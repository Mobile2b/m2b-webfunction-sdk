package com.mobile2b.webfunction;

import java.util.Map;

public class WebFunctionResponse {

    private String requestId;

    private Map<String, Object> data;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}