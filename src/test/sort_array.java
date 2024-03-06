/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Random;

/**
 *
 * @author NebulaF
 */
public class sort_array {
    int []A;
    
    void sinh(int n){
        A = new int[n];
        Random rd = new Random();
        
        for (int i = 0; i < A.length; i++) {
            A[i] = rd.nextInt() % 1001;
        }
    }
    
    void xuat(){
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]: " + A[i]);
        }
    }
    
    void xuly2(int x){
        int vt = 1;
        for (int i = 0; i < A.length; i++) {
            if(A[i] < x) vt++;
        }
        
        System.out.println("Vi tri cua " + x + " trong mang la: " + vt);
    }
    
    public static void main(String[] args) {
        sort_array s = new sort_array();
        s.sinh(1000000);
//        s.xuat();
        s.xuly2(5);
    }
}
