package com.company;

public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }
    public void singing(){
        System.out.println("I am singing");
    }

    public void playGitar(){
        System.out.println("I am playing Gitar");
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return
        "\n"+"Class Singer{" + " Name="+getName()+", "
                +"Designation="+getDesignation()+
                ", "+"Band Name=" + bandName+"}";
    }
}
