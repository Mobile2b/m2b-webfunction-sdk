package com.mobile2b.webfunction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractWebFunctionParameter {

    @NotBlank
    private String id;

    @NotEmpty
    private Map<String, String> label;

    @NotNull
    private WebFunctionParameterType type;

}