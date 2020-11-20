package com.company;

public class Human {

    private Head head;
    private Leg leg;
    private Hand hand;
    private String name;
    private String surname;


    public Human() {}

    public Human(String name, String surname, Head head, Leg leg, Hand hand) {
        this.name = name;
        this.surname = surname;
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setHead(Head head) {
        this.head = head;
    }
    public Head getHead() {
        return this.head;
    }
    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    public Leg getLeg() {
        return this.leg;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public Hand getHand() {
        return this.hand;
    }
    @Override
    public String toString() {
        return "This is a human called " + this.name + " " + this.surname + " which have a " + this.head + ", a " + this.hand + ", and a " + this.leg + "!";
    }

}