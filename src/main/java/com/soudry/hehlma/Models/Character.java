package com.soudry.hehlma.Models;
import java.util.List;
import java.util.UUID;

public class Character {

    protected String id = "";

    protected String characterName = "";
    
    private List<Skill> skill;

    protected int attack;

    protected int defense;

    protected int hitpoints;

    protected String characterClass;

    protected int income = 0;

    public Character() {
        
    }

      public Character(String id, String characterName, int attack, int defense, int hitpoints, String characterClass, int income, List<Skill> skill) {
        this.id = id;
        this.characterName = characterName;
        this.attack = attack;
        this.defense = defense;
        this.hitpoints = hitpoints;
        this.characterClass = characterClass;
        this.income = income;
        this.skill = skill;
    }

     public String getId() {
        return this.id;
    }

    public void generateNewId() {
        this.id = UUID.randomUUID().toString();
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public List<Skill> getSkills() {
        return this.skill;
    }

    public void setSkills(List<Skill> skill) {
        this.skill = skill;
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
    
    public int getHitpoints() {
        return hitpoints;
    }
    
    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }
    
    public int getIncome() {
        return income;
    }
    
    public void setIncome(int income) {
        this.income = income;
    }
    
}

