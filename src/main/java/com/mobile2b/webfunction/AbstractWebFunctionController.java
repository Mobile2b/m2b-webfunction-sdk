package com.mobile2b.webfunction;

import java.util.Map;

public abstract class AbstractWebFunctionController {

    private WebFunction function;

    public AbstractWebFunctionController(WebFunction function) {
        this.function = function;
    }

    protected WebFunctionResponse execute(WebFunctionRequest request) {
        validateRequest(request);
        Map<String, Object> data = function.execute(request.getData());
        validateResponse(data);
        WebFunctionResponse response = new WebFunctionResponse();
        response.setRequestId(request.getRequestId());
        response.setData(data);
        return response;
    }

    private void validateRequest(WebFunctionRequest request) {
        if (function.getInput() != null) {
            for (WebFunctionInputParameter variable : function.getInput()) {
                if (variable.isRequired()) {
                    if (request.getData() == null || !request.getData().containsKey(variable.getId()) || request.getData().get(variable.getId()) == null) {
                        throw new IllegalArgumentException("Variable \"" + variable.getId() + "\" (" + variable.getType().toString() + ") is required but missing in request.");
                    }
                }
            }
        }
        if (request.getData() != null) {
            for (String varId : request.getData().keySet()) {
                WebFunctionInputParameter variable = findInputVariable(varId);
                if (variable != null) {
                    Object value = request.getData().get(varId);
                    validateVarType(variable, value);
                }
            }
        }
    }

    private void validateResponse(Map<String, Object> data) {
        if (data != null) {
            for (String varId : data.keySet()) {
                WebFunctionOutputParameter variable = findOutputVariable(varId);
                if (variable == null) {
                    throw new IllegalArgumentException("Web function " + function.getClass().getSimpleName() + " returned data with ID \"" + varId + "\" but doesn't specify a output variable with the same ID.");
                } else {
                    Object value = data.get(varId);
                    validateVarType(variable, value);
                }
            }
        }
    }

    private void validateVarType(AbstractWebFunctionParameter variable, Object value) {
        if (variable.getType() == Type.STRING && !(value instanceof String)) {
            throwTypeException(variable, value);
        } else if (variable.getType() == Type.NUMBER && !(value instanceof Number)) {
            throwTypeException(variable, value);
        } else if (variable.getType() == Type.BOOLEAN && !(value instanceof Boolean)) {
            throwTypeException(variable, value);
        }
    }

    private void throwTypeException(AbstractWebFunctionParameter variable, Object value) {
        throw new IllegalArgumentException("Value of \"" + variable.getId() + "\" is of type " + value.getClass().getSimpleName() + " but is expected to be of type " + variable.getType().toString());
    }

    private WebFunctionInputParameter findInputVariable(String id) {
        if (function.getInput() != null) {
            for (WebFunctionInputParameter variable : function.getInput()) {
                if (variable.getId().equals(id)) {
                    return variable;
                }
            }
        }
        return null;
    }

    private WebFunctionOutputParameter findOutputVariable(String id) {
        if (function.getOutput() != null) {
            for (WebFunctionOutputParameter variable : function.getOutput()) {
                if (variable.getId().equals(id)) {
                    return variable;
                }
            }
        }
        return null;
    }

    protected DocumentationResponse getDocumentation() {
        DocumentationResponse response = new DocumentationResponse();
        response.setDescription(function.getDescription());
        response.setInput(function.getInput());
        response.setOutput(function.getOutput());
        return response;
    }

}
