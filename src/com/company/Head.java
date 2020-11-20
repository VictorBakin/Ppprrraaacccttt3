package com.company;

public class Head {

    private String haircut;
    private String hairColor;
    private String eyeColor;

    public Head() {}

    public Head(String haircut, String hairColor, String eyeColor) {
        this.haircut = haircut;
        if (this.haircut.toLowerCase().equals("bald"))
            this.hairColor = "";
        else
            this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void setHaircut(String haircut) {
        this.haircut = haircut;
        if (this.haircut.toLowerCase().equals("bald"))
            this.hairColor = "";
    }

    public String getHaircut() {
        return this.haircut;
    }

    public void setHairColor(String hairColor) {
        if (!this.haircut.toLowerCase().equals("bald"))
            this.hairColor = hairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    @Override
    public String toString() {
        return "head with " + this.hairColor + " " + this.haircut + " haircut and " + this.eyeColor + " eyes";
    }

}