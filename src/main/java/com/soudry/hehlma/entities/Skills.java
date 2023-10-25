package com.soudry.hehlma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    private String skillName;

    @Column(name = "power")
    private String power;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defense")
    private int defense;

    @Column(name = "hp")
    private int hp;

    @Column(name = "ispassive")
    private Boolean ispassive;

    @Column(name = "tier")
    private int tier;

    // Define a many-to-one relationship to CharacterClass using the "characterClass" foreign key
    @ManyToOne
    @JoinColumn(name = "characterClass", referencedColumnName = "characterClass")
    private CharacterClass characterClass;

    // @OneToMany(mappedBy = "characterSkills")
    // private List<Skills> skills;

    @OneToMany(mappedBy = "skills")
    private List<CharacterSkills> characterSkills;

    // Constructors...
    public Skills() {
    }

    // Getters and Setters
    public String getName() {
        return this.skillName;
    }

    public void setName(String skillName) {
        this.skillName = skillName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTier() {
        return hp;
    }

    public void seTier(int tier) {
        this.tier = tier;
    }

    public Boolean getIspassive() {
        return ispassive;
    }

    public void setIspassive(Boolean ispassive) {
        this.ispassive = ispassive;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public List<CharacterSkills> getCharacterSkills() {
        return characterSkills;
    }

    public void setCharacterSkills(List<CharacterSkills> characterSkills) {
        this.characterSkills = characterSkills;
    }
}
