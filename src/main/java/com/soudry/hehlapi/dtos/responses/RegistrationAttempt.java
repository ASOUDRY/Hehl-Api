package com.soudry.hehlapi.dtos.responses;

public class RegistrationAttempt {

    private String message = "";
    private Boolean success = false;

    public RegistrationAttempt() {
    }

     public RegistrationAttempt(String message, Boolean value) {
        this.message = message;
        this.success = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
