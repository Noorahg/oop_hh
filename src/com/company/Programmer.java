package com.company;

public class Programmer  extends Person {

    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }
    public void coding(){
        System.out.println("I love coding");
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
        return "\n"+"Class Programmer{" + " Name:"+getName()+
                ", "+"Designation:"+getDesignation()+", "
                +"Company Name:"+companyName +"}";
    }
}
