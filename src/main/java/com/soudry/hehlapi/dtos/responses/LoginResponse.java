package com.soudry.hehlapi.dtos.responses;

public class LoginResponse {

    private String username;
    private Boolean isAdmin = false;

    public LoginResponse() {
    }

    public LoginResponse(String username, Boolean value) {
        this.username = username;
        this.isAdmin = value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}