package com.mobile2b.webfunction;

import java.util.Collections;
import java.util.List;

public class WebFunctionInputParameter extends AbstractWebFunctionParameter {

    private boolean required;
    /**
     * Fixed selectable values for parameters of type {@link Type#SELECT}.
     * Empty for all other types.
     */
    private List<String> options;

    public WebFunctionInputParameter() {
        super();
        this.options = Collections.emptyList();
    }

    public WebFunctionInputParameter(String id, I18nString label, Type type, boolean required) {
        super(id, label, type);
        this.required = required;
        this.options = Collections.emptyList();
    }

    public WebFunctionInputParameter(String id, I18nString label, Type type, boolean required, List<String> options) {
        super(id, label, type);
        this.required = required;
        this.options = options != null ? options : Collections.emptyList();
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public List<String> getOptions() {
        return options != null ? options : Collections.emptyList();
    }

    public void setOptions(List<String> options) {
        this.options = options != null ? options : Collections.emptyList();
    }

    public static WebFunctionInputParameterBuilder builder() {
        return new WebFunctionInputParameterBuilder();
    }

    public static class WebFunctionInputParameterBuilder {

        private String id;
        private I18nString label;
        private Type type;
        private boolean required;
        private List<String> options = Collections.emptyList();

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

        /** Fixed selectable values. Use together with {@link Type#SELECT}. */
        public WebFunctionInputParameterBuilder options(List<String> options) {
            this.options = options != null ? options : Collections.emptyList();
            return this;
        }

        public WebFunctionInputParameter build() {
            return new WebFunctionInputParameter(id, label, type, required, options);
        }

        @Override
        public String toString() {
            return id + " " + type + " " + label + " Required " + required;
        }

    }

}