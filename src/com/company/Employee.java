package com.company;


//An Employee class and it is extending from the Person class(inheriting):
public class Employee extends Person {

     //The property of the indiviual class:
     private int eNumber;

    public Employee(String name, int age, String company, int eNumber) {
        //It is inheriting from the Parent class(the constructor):
        super(name, age, company);
        this.eNumber = eNumber;

    }

    //You are inheriting from the Parent class the name property:
    public void employeeInfo(){
        System.out.println("Hey my name is " + super.getName() + " and my number is " + eNumber );
    }
}
