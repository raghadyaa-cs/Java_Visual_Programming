package edu.zuj.vp.week3.lecture1;

import javax.swing.JOptionPane;

public class Test2 {
 
    public static void main(String[] args) {
        //String: datattype
        //n1: variable name
        //JOptionPane: class name
        //showInputDialog: method inside JOption{ane class
        //"Pleae enter ...": String
        // String: Paramter: 
        String n1=JOptionPane.showInputDialog("Please enter n1: ");
        String n2=JOptionPane.showInputDialog("Please enter n2: ");        
        //+ opertator between tow Strnig will do a concat
        System.out.println(n1+n2);
    }
}
