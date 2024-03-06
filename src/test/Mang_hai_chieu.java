/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NebulaF
 */
public class Mang_hai_chieu {
    int [][]a;
    int m, n;
    
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        m = sc.nextInt();
        System.out.println("Nhap so cot: ");
        n = sc.nextInt();
        
        a = new int[m][n];
        
        Random rd = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt() % 1001;
            }
            System.out.println("");
        }
    };
    
    void in(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.format("%6d", a[i][j]);
            }
            System.out.print("\n");
        }
    };
    
    void max_dong(){
        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
            System.out.println("Max dong " + i + " = " + max);
        }
    }
    
    void TB_le(){
        for (int i = 0; i < n; i++) {
            int avg = 0;
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if(a[j][i] % 2 != 0){
                    sum += a[j][i];
                    avg++;
                }
            }
            if(avg == 0){
                System.out.println("Cot " + i + " khong co so le");
                continue;
            }
            else{
                System.out.println("Trung binh cong cac so le cot " + i + " = " + (sum/avg));
            }
        }
    }
    
    void xoayNgang(){
        for (int i = 0; i < a.length; i++) {
            int left = 0;
            int right = a[i].length - 1;
        
            while(left < right){
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
                left++; right--;
            }
        }
       
    }
    
    public static void main(String[] args) {
        Mang_hai_chieu m = new Mang_hai_chieu();
        m.nhap();
        m.in();
        m.max_dong();
        m.TB_le();
        m.xoayNgang();
        m.in();
    }
    
}
