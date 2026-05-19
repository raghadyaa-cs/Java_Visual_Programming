package edu.zuj.vp.week9.lecture1;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ValidationUtil {
    ///////////////////////////////////////////////////
    public static boolean isEmpty(JTextField ... arr){
        for(JTextField txt:arr){
            boolean empty=isEmpty(txt);
            if(empty){
                return false;
            }
        }        
        return true;
    }
    
    ///////////////////////////////////////////////////
    public static boolean isEmpty(JTextField txt){
         String value=txt.getText();
        if(value.trim().equals("")){
            txt.requestFocus();
            txt.setBorder(BorderFactory.createLineBorder(Color.red));
            return true;
        }else{
            txt.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            return false;
        }
    }

    ///////////////////////////////////////////////////
    public static  boolean isValidLength(JTextField txt, int min, int max){
        String value=txt.getText().trim();
        if(value.length()>=min && value.length()<=max){            
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid length, should be  "+min+" to "+max);
            txt.requestFocus();            
            return false;
        }        
    }

}
