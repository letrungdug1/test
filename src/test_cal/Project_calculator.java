/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_cal;

/**
 *
 * @author nguye
 */
public class Project_calculator {

   boolean check(String s){

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch) || Character.isSpaceChar(ch)) {
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
   
    public String modulo (String a, String b){
        if(!check(a) || !check(b)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_a = Float.parseFloat(a);            
            float float_b = Float.parseFloat(b);
            String s = String.valueOf(float_a % float_b);
            return s;
        }
    }
    
    public String multifly (String a, String b){
        if(!check(a) || !check(b)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_a = Float.parseFloat(a);            
            float float_b = Float.parseFloat(b);
            String s = String.valueOf(float_a * float_b);
            return s;
        }
    }
    
    public String plus (String a, String b){
        if(!check(a) || !check(b)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_a = Float.parseFloat(a);            
            float float_b = Float.parseFloat(b);
            String s = String.valueOf(float_a + float_b);
            return s;
        }
    }
    public String divide (String a, String b){
        if(!check(a) || !check(b)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_a = Float.parseFloat(a);            
            float float_b = Float.parseFloat(b);
            String s = String.valueOf(float_a / float_b);
            return s;
        }
    }
    
    public String pow (String x){
        if(!check(x)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_x = Float.parseFloat(x); 
            String s = String.valueOf(Math.pow(float_x, 2));
            return s;
        }
    }
    
    public String sqrt (String x){
        if(!check(x)){
            System.err.println("Error!");            
            return "";
        }
        else{
            float float_x = Float.parseFloat(x); 
            String s = String.valueOf(Math.sqrt(float_x));
            return s;
        }
    }
    
    public String deleteLeft (String x){
        String s = x.substring(1);
        return s;
    }
    
    public String deleteRight (String x){
        String s = x.substring(0, x.length() - 1);
        return s;
    }
    
    public static void main(String[] args) {
        Project_calculator p = new Project_calculator();
        System.out.println(p.pow("2"));
    }
}
