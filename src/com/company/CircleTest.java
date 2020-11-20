package com.company;

import java.lang.Math;

public class CircleTest {

    public static void main(String[] args) {

        double initialRadius = -5.0 + Math.random()*10.0;

        Circle circle = new Circle(initialRadius);

        System.out.println("\nCIRCLE'S CIRCUMFERENCE: " + circle.getCircumference());
        System.out.println("CIRCLE'S SQUARE: " + circle.getSquare());
        System.out.println("CIRCLE'S RADIUS: " + circle.getRadius());
        System.out.println("CIRCLE'S DIAMETER: " + circle.getDiameter());

        System.out.println("\nSUMMARY:");
        System.out.println(circle);

        System.out.println("\nSETTING NEW RADIUS...");

        double newRadius = 1.0 + Math.random()*10.0;

        circle.setRadius(newRadius);

        System.out.println("NEW CIRCLE'S RADIUS IS " + newRadius + "!");

        System.out.println("\nSUMMARY:");
        System.out.println(circle);

        System.out.println("\nSETTING NEW DIAMETER...");

        double newDiameter = 2.0 + Math.random()*20.0;

        circle.setDiameter(newDiameter);

        System.out.println("NEW CIRCLE'S DIAMETER IS " + newDiameter + "!");

        System.out.println("\nSUMMARY:");
        System.out.println(circle);

        Head paintersHead = new Head("fro", "brown", "hazel");
        Leg paintersLeg = new Leg("jeans");
        Hand paintersHand = new Hand("shirt","brush");
        Human painter = new Human("Bob","Ross", paintersHead, paintersLeg, paintersHand);

        System.out.println("\nPAINTER'S SUMMARY:\n" + painter);

        Head oldAngryGuyHead = new Head();
        Leg oldAngryGuyLeg = new Leg();
        Hand oldAngryGuyHand = new Hand();
        Human oldAngryGuy = new Human();

        oldAngryGuyHead.setHaircut("bald");
        oldAngryGuyHead.setHairColor("hair should not exist");
        oldAngryGuyHead.setEyeColor("blue");

        System.out.println("\nOLD ANGRY GUY'S HEAD'S SUMMARY:");
        System.out.println("HAIRCUT: " + oldAngryGuyHead.getHaircut());
        System.out.println("HAIR COLOR: " + oldAngryGuyHead.getHairColor());
        System.out.println("EYE COLOR: " + oldAngryGuyHead.getEyeColor());

        oldAngryGuyHead.setHaircut("short");
        oldAngryGuyHead.setHairColor("black");

        oldAngryGuyLeg.setClothing("jeans");

        System.out.println("\nOLD ANGRY GUY'S LEG'S SUMMARY:");
        System.out.println("LEG CLOTHING: " + oldAngryGuyLeg.getClothing());

        oldAngryGuyHand.setClothing("sweater");
        oldAngryGuyHand.setEquipment("microphone");

        System.out.println("\nOLD ANGRY GUY'S HAND'S SUMMARY:");
        System.out.println("HAND CLOTHING: " + oldAngryGuyHand.getClothing());
        System.out.println("HAND EQUIPMENT: " + oldAngryGuyHand.getEquipment());

        oldAngryGuy.setHead(oldAngryGuyHead);
        oldAngryGuy.setLeg(oldAngryGuyLeg);
        oldAngryGuy.setHand(oldAngryGuyHand);

        oldAngryGuy.setName("George");
        oldAngryGuy.setSurname("Carlin");

        System.out.println("\nGEORGE CARLIN'S SUMMARY:");
        System.out.println(oldAngryGuy);
    }

}