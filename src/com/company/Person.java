package com.company;

public class Person {

     //Fields or properties:
      private String name;
      private int age;
      private String company;

      //Methods :

    //Constructor - It is a method being called as soon as you create an instance or an object of a of a class:
    public Person(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    // Encapsulation is the process of binding up of the methods with it's properties:
    public void getInfo(){
          System.out.println("Hey my name is " + name + " and I created " + company);
      }


}
