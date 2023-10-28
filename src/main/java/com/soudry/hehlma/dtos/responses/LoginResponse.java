package com.soudry.hehlma.dtos.responses;

import java.util.List;

import com.soudry.hehlma.Models.Character;

public class LoginResponse {

    private String username;
    private Boolean isAdmin = false;
    private List<Character> characterList;

    public LoginResponse() {
    }

    public LoginResponse(String username, Boolean value, List<Character> characters) {
        this.username = username;
        this.isAdmin = value;
        this.characterList = characters;
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

    public void setCharacters(List<Character> characters) {
        this.characterList = characters;
    }

      public List<Character> getCharacters() {
        return this.characterList;
    }
}