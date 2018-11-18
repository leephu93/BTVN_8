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
public class CAU8 {

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
        System.out.print("NHẬP VÀO VỊ TRÍ MUỐN XÓA TRONG MẢNG: ");
        int xxx = scanner.nextInt();
        if (xxx < ar.length && xxx >= 0) {
            for (int i = 0; i < ar.length; i++) {
                if(i != xxx){
                    System.out.printf("| %d |", ar[i]);
                }
            }
            System.out.println();
        } else {
            System.out.println("VUI LÒNG NHẬP SỐ LỚN HƠN HOẶC BẰNG 0 VÀ NHỎ HƠN " + x + " !");
        }
        System.out.println("****************************************");
    }
}
