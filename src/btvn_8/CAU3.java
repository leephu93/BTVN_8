/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn_8;

import java.util.Scanner;

public class CAU3 {
    static Scanner scanner = new Scanner(System.in);
    
    static void RUNA() {
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

    static void RUNB() {
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
                if (ar[i][j] < 10) {
                    System.out.print("|0" + ar[i][j] + "|");
                } else {
                    System.out.print("|" + ar[i][j] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("HIỆN TẠI CÓ %d SỐ LẺ TRONG MA TRẬN HIỆN TẠI", count);
        System.out.println();
    }

    static void RUNC() {
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
                if (ar[i][j] < 10) {
                    System.out.print("|0" + ar[i][j] + "|");
                } else {
                    System.out.print("|" + ar[i][j] + "|");
                }
                total += ar[i][j];
            }
            System.out.println(" --->>> TỔNG DÒNG " + (i + 1) + " TRONG MA TRẬN HIỆN TẠI --->>> " + total);
            total = 0;
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
        System.out.println();
    }

    static void RUND() {
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
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
        int max = 0, min = ar[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar[i][j] > max) {
                    max = ar[i][j];
                }
                if (ar[i][j] < min) {
                    min = ar[i][j];
                }
            }
        }
        System.out.println("SỐ LỚN NHẤT TRONG MA TRẬN HIỆN TẠI: " + max);
        System.out.println("SỐ NHỎ NHẤT TRONG MA TRẬN HIỆN TẠI: " + min);
        System.out.println("----------------------------------------------------");
        System.out.println();
    }

    static void RUNE() {
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
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
        int total1 = 0, total2 = 0, total3 = 0, term = 4;
        for (int i = 0; i < 4; i++) {
            term--;
            total1 = total1 + ar[i][i];
            total2 = total2 + ar[i][term];
        }
        total3 = total1 + total2;
        System.out.println("TỔNG ĐƯỜNG CHÉO DẤU HUYỀN TRONG MA TRẬN HIỆN TẠI: " + total1);
        System.out.println("TỔNG ĐƯỜNG CHÉO DẤU SẮC TRONG MA TRẬN HIỆN TẠI: " + total2);
        System.out.println("TỔNG HAI ĐƯỜNG CHÉO TRONG MA TRẬN HIỆN TẠI: " + total3);
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
    
    static void RUNF() {
        int[][] ar = new int[4][4];
        System.out.println("HÃY NHẬP VÀO MỘT SỐ NGUYÊN DƯƠNG!");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("NHẬP GIÁ TRỊ CHO VỊ TRÍ (" + i + "," + j + ") CỦA MẢNG NHIỀU CHIỀU HIỆN TẠI: ");
                ar[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
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
        System.out.println("VỊ TRÍ CÁC GIÁ TRỊ LỚN HƠN 5 TRONG MA TRẬN HIỆN TẠI: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(ar[i][j] > 5){
                    System.out.printf("VỊ TRÍ (%d,%d)",i,j);
                    System.out.println();
                }
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
    
    public static void main(String[] args) {
//        RUNA();
//        RUNB();
//        RUNC();
//        RUND();
//        RUNE();
        RUNF();
    }
}
