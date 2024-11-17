package org.example;

public class Alien {

    private int age;
    private Laptop lapObj;
    public Alien()
    {
        System.out.println("Alien Constructor");
    }

    public Alien(int age, Laptop lap){
        System.out.println("Parameterized Constructor invoked");
        this.age = age;
        this.lapObj = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Laptop getLapObj() {
        return lapObj;
    }

    public void setLapObj(Laptop lapObj) {
        this.lapObj = lapObj;
    }

    public void code()
    {
        System.out.println("Coding..");
        lapObj.compile();

    }
}
