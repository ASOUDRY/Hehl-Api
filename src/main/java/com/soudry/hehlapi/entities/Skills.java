package com.soudry.hehlapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    private String code;

    @Column(name = "ability")
    private String ability;

    // Define a many-to-one relationship to Role using the "role" foreign key
    @ManyToOne
    @JoinColumn(name = "characterClass", referencedColumnName = "characterClass")
    private CharacterClass characterClass;

    @ManyToOne
    @JoinColumn(name = "characterSkills", referencedColumnName = "id")
    private CharacterSkills characterSkills;

    // Constructors...
    public Skills() {
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterSkills getCharacterSkills() {
        return characterSkills;
    }

    public void setCharacterSkills(CharacterSkills characterSkills) {
        this.characterSkills = characterSkills;
    }
}
