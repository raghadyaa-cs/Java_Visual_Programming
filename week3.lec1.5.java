package edu.zuj.vp.week3.lecture1;

import javax.swing.JOptionPane;

public class Test5 {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("Enter number: ");
        int n=Integer.parseInt(input);
        if(n%2==0){
            JOptionPane.showMessageDialog(null, "Yes");
        }else{
            JOptionPane.showMessageDialog(null, "Good bye");
        }
    }
}
