package com.soudry.hehlma.dtos.requests;

public class CharacterRequest {

    public CharacterRequest() {
    }
    
    private String characterName = "";
    private String characterClass = "";
    private String username = "";

    // Getter for the 'name' field
    public String getCharacterName() {
        return characterName;
    }

    // Setter for the 'name' field
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    // Getter for the 'characterClass' field
    public String getCharacterClass() {
        return characterClass;
    }

    // Setter for the 'characterClass' field
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    // Getter for the 'username' field
    public String getUsername() {
        return username;
    }

    // Setter for the 'username' field
    public void setUsername(String username) {
        this.username = username;
    }
}
