package com.mobile2b.webfunction;

public abstract class AbstractWebFunctionParameter {

    private String id;

    private I18nString label;

    private Type type;

    public AbstractWebFunctionParameter(String id, I18nString label, Type type) {
        this.id = id;
        this.label = label;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public I18nString getLabel() {
        return label;
    }

    public void setLabel(I18nString label) {
        this.label = label;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}