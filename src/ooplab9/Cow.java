package ooplab9;

import ooplab8.Pet;

public class Cow extends Pet{
    public Cow(String name, String hairColor, String gender, String age) {
        super(name, hairColor, gender, age);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Mor Mor !!!");
    }
}//Class
