package com.mobile2b.webfunction;

public class WebFunctionOutputParameter extends AbstractWebFunctionParameter {

    public WebFunctionOutputParameter() {
        super();
    }

    public WebFunctionOutputParameter(String id, I18nString label, Type type) {
        super(id, label, type);
    }

    public static WebFunctionOutputParameterBuilder builder() {
        return new WebFunctionOutputParameterBuilder();
    }

    public static class WebFunctionOutputParameterBuilder {

        private String id;
        private I18nString label;
        private Type type;

        public WebFunctionOutputParameterBuilder id(String id) {
            this.id = id;
            return this;
        }

        public WebFunctionOutputParameterBuilder label(I18nString label) {
            this.label = label;
            return this;
        }

        public WebFunctionOutputParameterBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public WebFunctionOutputParameter build() {
            return new WebFunctionOutputParameter(id, label, type);
        }

        @Override
        public String toString() {
            return id + " " + type + " " + label;
        }

    }

}
