/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NebulaF
 */

import java.util.LinkedList;
import java.util.Queue;

public class radixSort {
    int []a = {3,1,5,7,2,3,45};
    
    void sinh(int n){
        
    }
    
    void in(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " - ");
        }
    }
    
    void Radix_Sort(){
        Queue Q = new LinkedList();
        Queue []QQ;
        QQ = new LinkedList[10];
        for (int i = 0; i < 9; i++) {
            QQ[i] = new LinkedList();
        }
        
        int x, vt, d = 1, max = a[0];
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
            Q.add(a[i]);
        }
        
        int k = ("" + max).length();
        for (int i = 0; i < k; i++) {
            while(!Q.isEmpty()){
                x = (int) Q.remove();
                vt = (x/d) % 10;
                QQ[vt].add(x);
            }
            
            for(int j = 0; j<=9; j++)
                while(!QQ[j].isEmpty()){
                    x = (int) QQ[i].remove();
                    Q.add(x);
                }
            d *= 10;
        }
        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Q.remove();
            
        }
    }
    public static void main(String[] args) {
        radixSort r = new radixSort();
        r.in();
        r.Radix_Sort();
        r.in();
    }
}
