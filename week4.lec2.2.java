package edu.zuj.vp.week4.lecture2;

public class TestPerson {
    public static void main(String[] args) {
        //Person: class/datatype name
        //p: refernce
        //new Person: construction 
        Person p1=new Person();
        p1.name="Ata";
        p1.age=20;       
        p1.talk();//ata

        Person p2=new Person();
        p2.name="Essa";
        p2.talk();//Essa
        
        Person p3=p1;
        p3.talk();//Ata
        p3.name="Kamal";
        p1.talk();//
        
        
        Person p4=null;
        p4.name="abd";
        
    }
}
