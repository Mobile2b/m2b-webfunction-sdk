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

    public static WebFunctionInputParameterBuilder builder() {
        return new WebFunctionInputParameterBuilder();
    }

    public static class WebFunctionInputParameterBuilder {

        private String id;
        private I18nString label;
        private Type type;
        private boolean required;

        public WebFunctionInputParameterBuilder id(String id) {
            this.id = id;
            return this;
        }

        public WebFunctionInputParameterBuilder label(I18nString label) {
            this.label = label;
            return this;
        }

        public WebFunctionInputParameterBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public WebFunctionInputParameterBuilder required(boolean required) {
            this.required = required;
            return this;
        }

        public WebFunctionInputParameter build() {
            return new WebFunctionInputParameter(id, label, type, required);
        }

    }

}