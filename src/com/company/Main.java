package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer prog=new Programmer("Maksatai"," Software Architect","Google");
        System.out.println(prog);
        prog.eat();
        prog.learn();
        prog.walk();
        prog.coding();

        Dancer danc=new Dancer("Zulya","Lead dancer","Gband");
        System.out.println(danc);
        danc.eat();
        danc.learn();
        danc.walk();
        danc.dancing();

        Singer sing =new Singer("Atabekov","Vocal","Solo");
        System.out.println(sing);
        sing.eat();
        sing.learn();
        sing.walk();
        sing.singing();
        sing.playGitar();

    }
}
