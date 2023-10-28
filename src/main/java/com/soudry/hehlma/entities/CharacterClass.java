package com.soudry.hehlma.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "characterClass")
public class CharacterClass {
    @Id
    private String className;

    @OneToMany(mappedBy = "characterClass")
    private List<Characters> characters;

    // Constructors
    public CharacterClass() {
    }

     public CharacterClass(String characterClass) {
        this.className = characterClass;
    }

    // Getters and Setters
    public String getCharacterClass() {
        return className;
    }

    public void setCharacterClass(String characterClass) {
        this.className = characterClass;
    }

    public List<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Characters> characters) {
        this.characters = characters;
    }
}