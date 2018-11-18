/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_8;

import static btvn_8.CAU3.scanner;

/**
 *
 * @author leeph
 */
public class CAU11 {
    
    public static void main(String[] args) {
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar[i][j] < 10) {
                    System.out.print("|0" + ar[i][j] + "|");
                } else {
                    System.out.print("|" + ar[i][j] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        int total1 = 0, total2 = 0, term = 4;
        for (int i = 0; i < 4; i++) {
            term--;
            total1 = total1 + ar[i][i];
            total2 = total2 + ar[i][term];
        }
        System.out.println("TỔNG HAI ĐƯỜNG CHÉO TRONG MA TRẬN HIỆN TẠI: " + (total1 + total2));
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
}
