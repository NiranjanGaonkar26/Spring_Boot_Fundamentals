package org.example;

public class Alien {

    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Constructor");
    }

//    public Alien(int age, Laptop lap){
//        System.out.println("Parameterized Constructor invoked");
//        this.age = age;
//        this.lapObj = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code()
    {
        System.out.println("Coding..");
        com.compile();
    }
}
