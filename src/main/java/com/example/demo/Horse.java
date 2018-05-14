package com.example.demo;

public class Horse {
    private long ID;
    private String Name;
    private String Breed;
    private String Sex;
    private int Age;
    private double weight;
    private String Color;
    private String Markings;
    private long RegistrationNumber;
    private long Vet_ID;
    private long Owner1_ID;
    private long Owner2_ID;
    private long stable_ID;

    public Horse(long ID, String Name, String Breed, String Sex, int Age, double weight, String Color, String Markings, long RegistrationNumber, long Vet_ID, long Owner1_ID, long Owner2_ID, long stable_ID ) {
        super();
        this.ID= ID;
        this.Name= Name;
        this.Breed= Breed;
        this.Sex= Sex;
        this.Age= Age;
        this.weight= weight;
        this.Color= Color;
        this.Markings= Markings;
        this.RegistrationNumber= RegistrationNumber;
        this.Vet_ID= Vet_ID;
        this.Owner1_ID= Owner1_ID;
        this.Owner2_ID= Owner2_ID;
        this.stable_ID= stable_ID;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getBreed() {
        return Breed;
    }

    public String getSex() {
        return Sex;
    }

    public int Age() {
        return Age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return Color;
    }

    public String getMarkings() {
        return Markings;
    }

    public long getRegistrationNumber() {
        return RegistrationNumber;
    }

    public long getVet_ID() {
        return Vet_ID;
    }

    public long getOwner1_ID() {
        return Owner1_ID;
    }

    public long getOwner2_ID() {
        return Owner2_ID;
    }

    public long getStable_ID() {
        return stable_ID;
    }

}
