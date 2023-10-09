package com.soudry.hehlapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.util.List;

@Entity
@Table(name = "characterSkills")
public class CharacterSkills {
    @Id
    private String id;

    // Define a many-to-one relationship to Player using the "player" foreign key
    @OneToOne
    @JoinColumn(name = "character")
    private Characters character;

    @OneToMany(mappedBy = "characterSkills")
    private List<Skills> skills;

    // Constructors
    public CharacterSkills() {
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Characters getCharacter() {
        return character;
    }

    public void setCharacterId(Characters character) {
        this.character = character;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }
}
