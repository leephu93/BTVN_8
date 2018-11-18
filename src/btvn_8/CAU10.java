/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_8;

import java.util.Scanner;

/**
 *
 * @author leeph
 */
public class CAU10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CÓ TRONG MẢNG: ");
        int x = scanner.nextInt();
        int[] ar = new int[x];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP PHẦN TỬ VỊ TRÍ %d : ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("****************************************");
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("| %d |", ar[i]);
        }
        System.out.println();
        System.out.println("MẢNG SAU KHI SẮP XẾP TĂNG DẦN: ");
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                if(ar[i] > ar[j]){
                    int term = ar[i];
                    ar[i] = ar[j];
                    ar[j] = term;
                }
            }
            System.out.printf("| %d |", ar[i]);
        }
        System.out.println();
        System.out.println("****************************************");
    }
}
