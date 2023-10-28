package com.soudry.hehlma.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "characterSkills")
public class CharacterSkills {
    @Id
    private String id = UUID.randomUUID().toString();;

    @ManyToOne
    @JoinColumn(name = "character", referencedColumnName = "id")
    private Characters character;

    @ManyToOne
    @JoinColumn(name = "skills", referencedColumnName = "skillName")
    private Skills skills;

       public CharacterSkills() {
    }

    // Constructors
    public CharacterSkills(Characters c, Skills s) {
        this.character = c;
        this.skills = s;
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

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }
}
