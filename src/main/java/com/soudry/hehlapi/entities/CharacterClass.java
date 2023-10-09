package com.soudry.hehlapi.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "characterClass")
public class CharacterClass {
    @Id
    private String characterClass;

    @OneToMany(mappedBy = "characterClass")
    private List<Characters> characters;

    @OneToMany(mappedBy = "characterClass")
    private List<Skills> skills;

    // Constructors
    public CharacterClass() {
    }

    // Getters and Setters
    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public List<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Characters> characters) {
        this.characters = characters;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }
}
