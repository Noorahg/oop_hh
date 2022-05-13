package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }
    public void dancing(){
        System.out.println("I love dancing");
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
        return "\n"+"Class Dancer{"+" Name="+getName()+
                ", "+"Designation="+getDesignation()+", "
                +"Group Name=" + groupName+"}";
    }
}
