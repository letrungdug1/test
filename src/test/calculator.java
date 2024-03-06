/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NebulaF
 */
public class calculator {
    boolean check(String s){

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }
    public String subtract(String a, String b){
        if(!check(a) || !check(b)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_a = Float.parseFloat(a);            
            float float_b = Float.parseFloat(b);
            String s = String.valueOf(float_a - float_b);
            return s;
        }
    }
}
