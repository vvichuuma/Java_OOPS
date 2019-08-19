package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p1 = new Person("mark", 23 , "facebook");
        Person p2 = new Person("steve", 46, "Apple");

        p1.getInfo();
        p2.getInfo();

        Employee e1 = new Employee("peter" , 37, "Actualize", 137);
        e1.employeeInfo();

    }
}
