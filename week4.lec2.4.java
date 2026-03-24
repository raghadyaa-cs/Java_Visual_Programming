/*
Pratice:
1- Write Person v1 class and its Test
2- Wtite Person v2 class (with encpaualtion, toString, and Constructors) 
and its test
3- Create first JFrame example

*/
package edu.zuj.vp.week4.lecture2;

public class PersonV2 {
    private String name;
    private int age;

    public PersonV2() {
    }

    public PersonV2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonV2{" + "name=" + name + ", age=" + age + '}';
    }
    
    public void talk(){
        System.out.println("Hello , my name is "+name+" and my age is "+age);
    }
    
    
}
