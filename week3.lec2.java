package edu.zuj.vp.week3.lecture2;

import javax.swing.JOptionPane;

public class Test1 {
    public static void main(String[] args) {
        int n=readNumber("Enter value");
        int opt=0;
        while(opt!=5){
            opt=showMenu();
            double result=processOperation(n, opt);
            if(result!=-1){
                JOptionPane.showMessageDialog(null,"Result = "+result);
            }
        }
        System.exit(0);
    }
    
    public static int readNumber(String message){
        String  msg=JOptionPane.showInputDialog(message);
        int value=Integer.parseInt(msg);
        return value;
    }
    
    public static int showMenu(){
        String menu="1- From M to Feet\n"+
            "2- From Feet to M\n"+
            "3- From CM to Inche        \n"+
            "4- From Inche to CM\n"+
            "5- Quit\n"+
            "------------------------------\n"+
            "Enter your choice";
            int opt=readNumber(menu);
            return opt;
    }
    
    public static double processOperation(int n,int choice){
        double result=-1;            
        switch(choice){
            case 1: result=n* 3.28084; break;
            case 2: result=n * 0.3048;break;
            case 3: result=n/2.54;break;
            case 4: result=n*2.54;break;
            case 5: System.exit(0);
            default: JOptionPane.showMessageDialog(null,"Invalid Input");
        }
        return result;
    }
}
