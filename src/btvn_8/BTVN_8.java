/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_8;

import java.util.ArrayList;
import java.util.Scanner;

public class BTVN_8 {

    static void CAU1() {
        Scanner scanner = new Scanner(System.in);
        ArrayList mang = new ArrayList();
        float val = 0;
        int count = 1;
        System.out.println("HÃY NHẬP VÀO MỘT SỐ LẺ NGUYÊN DƯƠNG!");
        do {
            System.out.printf("\t\t NHẬP VÀO SỐ THỨ %d : ", count);
            val = scanner.nextFloat();
            if (val % 2 != 0 && val > 0) {
                mang.add(val);
            } else {
                break;
            }
            count++;
        } while (count <= 10);
        System.out.println("KẾT QUẢ CỦA MẢNG HIỆN TẠI: " + mang.toString());
        float total1 = 0, total2 = 0, total3 = 0;
        for (int i = 0; i < 5; i++) {
            total1 = total1 + (float) mang.get(i);
        }
        System.out.println("TỔNG 5 PHẦN TỬ ĐẦU TIÊN CỦA MẢNG HIỆN TẠI: " + total1);
        for (int i = mang.size() - 5; i < mang.size(); i++) {
            total2 = total2 + (float) mang.get(i);
        }
        System.out.println("TỔNG 5 PHẦN TỬ CUỐI CÙNG CỦA MẢNG HIỆN TẠI: " + total2);
        for (int i = 0; i < mang.size() + 1; i++) {
            if (i % 2 != 0) {
                total3 += (float) mang.get(i);
            }
        }
        System.out.println("TỔNG CÁC PHẦN TỬ Ở VỊ TRÍ LẺ CỦA MẢNG HIỆN TẠI: " + total3);
    }

    static void CAU2() {
        Scanner scanner = new Scanner(System.in);
        ArrayList mang = new ArrayList();
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

    static void CAU3() {
        Scanner scanner = new Scanner(System.in);
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void CAU4() {
        Scanner scanner = new Scanner(System.in);
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar[i][j] % 2 != 0) {
                    count++;
                }
                if(ar[i][j] < 10){
                    System.out.print("|0"+ar[i][j]+"|");
                }
                else{
                    System.out.print("|"+ar[i][j]+"|");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("HIỆN TẠI CÓ %d SỐ LẺ TRONG MA TRẬN HIỆN TẠI", count);
        System.out.println();
    }
    
    static void CAU5() {
        Scanner scanner = new Scanner(System.in);
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        int total = 0;
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(ar[i][j] < 10){
                    System.out.print("|0"+ar[i][j]+"|");
                }
                else{
                    System.out.print("|"+ar[i][j]+"|");
                }
                
                total += ar[i][j];
            }
            System.out.println(" --->>> TỔNG DÒNG "+(i+1)+" TRONG MA TRẬN HIỆN TẠI --->>> "+total);
            total = 0;
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
//        CAU1();
//        CAU2();
//        CAU3();
//        CAU4();
        CAU5();
    }

}
