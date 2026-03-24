package edu.zuj.vp.week4.lecture2;
/*
OOP: strucrting the code into  classes
Class:
    - Attributes
    - Actions:
Example:
    Person
        - name
        - age
    Actions:
        - Talk

To have an easier approach to design OOP programs/applications, they created UML
- UML Class Diagram
*/
public class Person {
    String name;
    int age;
    
    public void talk(){
        System.out.println("Hi, my name is "+name);
    }
}
