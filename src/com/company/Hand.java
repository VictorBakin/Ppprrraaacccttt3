package com.company;

public class Hand {

    private String clothing;
    private String equipment;

    public Hand() {}

    public Hand(String clothing, String equipment) {
        this.clothing = clothing;
        this.equipment = equipment;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getClothing() {
        return this.clothing;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipment() {
        return this.equipment;
    }

    @Override
    public String toString() {
        return "hand wearing " + this.clothing + " and holding " + this.equipment;
    }

}