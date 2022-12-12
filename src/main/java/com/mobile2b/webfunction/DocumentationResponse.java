package com.mobile2b.webfunction;

import java.util.List;

public class DocumentationResponse {

    private String description;

    private List<WebFunctionInputParameter> input;

    private List<WebFunctionOutputParameter> output;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WebFunctionInputParameter> getInput() {
        return input;
    }

    public void setInput(List<WebFunctionInputParameter> input) {
        this.input = input;
    }

    public List<WebFunctionOutputParameter> getOutput() {
        return output;
    }

    public void setOutput(List<WebFunctionOutputParameter> output) {
        this.output = output;
    }
    
}
