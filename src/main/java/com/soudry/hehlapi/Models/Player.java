package com.soudry.hehlapi.Models;
import java.util.List;

import com.soudry.hehlapi.entities.User;

public class Player extends User {
    private String characterName = "";
    private List<String> items;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}

