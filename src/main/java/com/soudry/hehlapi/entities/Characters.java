package com.soudry.hehlapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "characters")
public class Characters {
    @Id
    private String id = "";

    @Column(name = "characterName", nullable = false)
    private String characterName = "";

    @Column(name = "income")
    private int income;

    @Column(name = "hitpoints")
    private int hitpoints;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defense")
    private int defense;

    // Define a many-to-one relationship to User
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    // Define a one-to-one relationship to Player using characterName as the foreign key
    @ManyToOne
    @JoinColumn(name = "characterClass", referencedColumnName = "characterClass")
    private CharacterClass characterClass;

    @OneToOne(mappedBy = "character")
    private CharacterSkills characterSkills;

    // Constructors
    public Characters() {
    }

    public Characters(String characterName, int income, int hitpoints, int attack, int defense) {
        this.characterName = characterName;
        this.income = income;
        this.hitpoints = hitpoints;
        this.attack = attack;
        this.defense = defense;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CharacterSkills getCharacterSkills() {
        return characterSkills;
    }

    public void setCharacterSkills(CharacterSkills characterSkills) {
        this.characterSkills = characterSkills;
    }
}
