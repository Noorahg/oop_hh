package com.company;

public class Person {

    private String name;
    private String designation;

    public Person(String name,String designation){
        this.name=name;
        this.designation=designation;
    }
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void learn(){
        System.out.println("I am learning English");
    }
    public void walk(){
        System.out.println("I am walking all day");
    }
    public void eat(){
        System.out.println("I am eating burgers");
    }
}
