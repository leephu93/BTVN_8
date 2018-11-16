/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author leeph
 */
public class CAU2 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList mang = new ArrayList();
    
    static void RUNA() {
        float val = 0;
        int count = 1;
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        do {
            System.out.printf("\t\t NHẬP VÀO SỐ THỨ %d : ", count);
            val = scanner.nextFloat();
            if (val > 0) {
                mang.add(val);
            } else {
                break;
            }
            count++;
        } while (count <= 10);
        System.out.println("MẢNG VỪA MỚI NHẬP VÀO: " + mang.toString());
        System.out.print("MẢNG ĐÃ ĐƯỢC ĐẢO NGƯỢC: ");
        for (int i = mang.size() - 1; i >= 0; i--) {
            System.out.print(" " + mang.get(i));
        }
        System.out.println();
    }
    
    static void RUNB() {
        float val = 0;
        int count = 1;
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        do {
            System.out.printf("\t\t NHẬP VÀO SỐ THỨ %d : ", count);
            val = scanner.nextFloat();
            if (val > 0) {
                mang.add(val);
            } else {
                break;
            }
            count++;
        } while (count <= 10);
        System.out.println("MẢNG VỪA MỚI NHẬP VÀO: " + mang.toString());
        System.out.print("MẢNG CÁC VỊ TRÍ CHẴN CỦA MẢNG ĐẢO NGƯỢC: ");
        for (int i = mang.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(" " + mang.get(i));
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        RUNA();
//        RUNB();
    }
}
