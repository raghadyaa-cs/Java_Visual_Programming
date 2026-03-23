package edu.zuj.vp.week3.lecture1;

import javax.swing.JOptionPane;

public class Test7 {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("Enter number: ");
        int n=Integer.parseInt(input);
        int result=1;
        for(int i=2;i<=n;i++){
            result=result*i;
        }
        System.out.println("Fact = "+result);
    }
}
