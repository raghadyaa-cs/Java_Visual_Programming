package edu.zuj.vp.week3.lecture1;

import javax.swing.JOptionPane;

public class Test4 {
 
    public static void main(String[] args) {
        //String: datattype
        //n1: variable name
        //JOptionPane: class name
        //showInputDialog: method inside JOption{ane class
        //"Pleae enter ...": String
        // String: Paramter: 
        String n1=JOptionPane.showInputDialog("Please enter n1: ");
        String n2=JOptionPane.showInputDialog("Please enter n2: ");        
        //int: datatype
        //i1: variable name
        //Integer: class
        //parseInt: method
        //n1: paramter
        int i1=Integer.parseInt(n1);
        int i2=Integer.parseInt(n2);
        int sum=i1+i2;
        //+ opertator between tow Strnig will do a concat
        JOptionPane.showMessageDialog(null, sum);
    }
}
