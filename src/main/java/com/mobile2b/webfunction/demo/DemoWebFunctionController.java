package com.mobile2b.webfunction.demo;

import com.mobile2b.webfunction.*;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class DemoWebFunctionController extends AbstractWebFunctionController {

    public DemoWebFunctionController(DemoWebFunction function) {
        super(function);
    }

    //Map this to your POST / endpoint
    @Override
    public WebFunctionResponse execute(WebFunctionRequest request) {
        return super.execute(request);
    }

    //Map this to your GET /doc endpoint
    @Override
    public DocumentationResponse getDocumentation() {
        return super.getDocumentation();
    }

}
