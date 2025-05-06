package com.microservicelab1.restaurantsvc.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class VerifyOrderResult {
    private Boolean pass;
    private String reason;

    public VerifyOrderResult(Boolean pass, String reason) {
        this.pass = pass;
        this.reason = reason;
    }

    public Boolean getPass() {
        return pass;
    }

    public String getReason() {
        return reason;
    }
}
