package com.soudry.hehlma.Models;

public class Skill {

    private int attack;
    private int defense;
    private int hp;
    private Boolean passive;
    private String power;

    // Constructor that takes all the fields as parameters
    public Skill(int attack, int defense, int hp, Boolean passive, String power) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.passive = passive;
        this.power = power;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Boolean isPassive() {
        return this.passive;
    }

    public void setPassive(Boolean passive) {
        this.passive = passive;
    }

    public String getPower() {
        return this.power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
