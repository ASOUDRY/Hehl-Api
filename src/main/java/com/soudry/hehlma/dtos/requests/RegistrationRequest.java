package com.soudry.hehlma.dtos.requests;

public class RegistrationRequest {
    private String username = "";

    private String password = "";

    private String email = "";

    public void setUsername(String username) {
            this.username = username;
    }

    public void setPassword(String password) {
            this.password = password;
    }

      public void setEmail(String email) {
            this.email = email;
    }

    public String getUsername() {
            return this.username;
    }

    public String getPassword() {
            return this.password;
    }

    public String getEmail() {
            return this.email;
    }

    public RegistrationRequest() {
        
    }
    
}
