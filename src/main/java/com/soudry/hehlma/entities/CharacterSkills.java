package com.soudry.hehlma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
// import java.util.List;

@Entity
@Table(name = "characterSkills")
public class CharacterSkills {
    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "character")
    private Characters character;

    @ManyToOne
    @JoinColumn(name = "skills", referencedColumnName = "skillName")
    private Skills skills;

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

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }
}
