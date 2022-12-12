package com.mobile2b.webfunction;

public class WebFunctionInputParameter extends AbstractWebFunctionParameter {

    private boolean required;

    public WebFunctionInputParameter(String id, I18nString label, Type type, boolean required) {
        super(id, label, type);
        this.required = required;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

}
