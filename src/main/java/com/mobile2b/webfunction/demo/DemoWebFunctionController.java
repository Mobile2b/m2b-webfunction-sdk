package com.mobile2b.webfunction.demo;

import com.mobile2b.webfunction.AbstractWebFunctionController;
import com.mobile2b.webfunction.DocumentationResponse;
import com.mobile2b.webfunction.WebFunctionRequest;
import com.mobile2b.webfunction.WebFunctionResponse;

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
