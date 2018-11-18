package btvn_8;

import java.util.ArrayList;
import java.util.Scanner;

public class CAU4 {

    static Scanner scanner = new Scanner(System.in);

    static void RUNA() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        System.out.print("PHẦN TỬ CÓ GIÁ TRỊ CHẴN VÀ VỊ TRÍ CHẴN: ");
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0 && ar[i] % 2 == 0) {
                System.out.print(" " + ar[i] + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
    }

    static void RUNB() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        System.out.print("PHẦN TỬ CÓ GIÁ TRỊ CHẴN VÀ VỊ TRÍ CHẴN: ");
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 != 0 && ar[i] % 2 != 0) {
                System.out.print(" " + ar[i] + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
    }

    static void RUNC() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        int tong = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 != 0 && ar[i] % 2 != 0) {
                tong += ar[i];
            }
        }
        System.out.println("TỔNG GIÁ TRỊ CỦA CÁC PHẦN TỬ VỊ TRÍ LẺ CỦA MẢNG HIỆN TẠI: " + tong);
        System.out.println("----------------------------------------------------");
    }

    static void RUND() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        int tong = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0 && ar[i] % 2 == 0) {
                tong += ar[i];
            }
        }
        System.out.println("TỔNG GIÁ TRỊ CỦA CÁC PHẦN TỬ VỊ TRÍ CHẴN CỦA MẢNG HIỆN TẠI: " + tong);
        System.out.println("----------------------------------------------------");
    }

    static void RUNE() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        int max = 0, min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("SỐ LỚN NHẤT TRONG MẢNG HIỆN TẠI: " + max);
        System.out.println("SỐ NHỎ NHẤT TRONG MẢNG HIỆN TẠI: " + min);
        System.out.println("----------------------------------------------------");
    }

    static void RUNF() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.print("NHẬP VÀO GIÁ TRỊ X: ");
        int x = scanner.nextInt();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > x) {
                System.out.println("VỊ TRÍ " + i + " LỚN HƠN " + x + " : " + ar[i]);
            } else if (ar[i] < x) {
                System.out.println("VỊ TRÍ " + i + " NHỎ HƠN " + x + " : " + ar[i]);
            } else {
                System.out.println("VỊ TRÍ " + i + " BẰNG VỚI " + x + " : " + ar[i]);
            }
        }
        System.out.println("----------------------------------------------------");
    }

    static void RUNGH() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        System.out.print("MẢNG HIỆN TẠI: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i] + " ");
        }
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int term = ar[i];
                    ar[i] = ar[j];
                    ar[j] = term;
                }
            }
        }
        System.out.println();
        System.out.println("SỐ LỚN NHẤT THỨ 2 TRONG MẢNG: " + ar[ar.length - 2]);
        System.out.println("SỐ NHỎ NHẤT THỨ 2 TRONG MẢNG: " + ar[1]);
        System.out.println("----------------------------------------------------");
    }

    static void RUNI() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        if (spt > 1) {
            int[] ar = new int[spt];
            for (int i = 0; i < ar.length; i++) {
                System.out.printf("NHẬP VỊ TRÍ %d: ", i);
                ar[i] = scanner.nextInt();
            }
            System.out.println("----------------------------------------------------");
            System.out.print("MẢNG HIỆN TẠI: ");
            for (int i = 0; i < ar.length; i++) {
                System.out.print(" " + ar[i] + " ");
            }
            System.out.println();
            System.out.print("CÁC SỐ TRÙNG NHAU CÓ TRONG MẢNG: ");
            ArrayList arl = new ArrayList();
            for (int item : ar) {
                int count = 0;
                for (int i = 0; i < ar.length; i++) {
                    if (item == ar[i]) {
                        count++;
                        if (count >= 2) {
                            if (arl.contains(item) == false) {
                                arl.add(item);
                            }
                        }
                    }
                }
            }
            if (arl.isEmpty()) {
                System.out.print("KHÔNG CÓ PHẦN TỬ NÀO TRÙNG NHAU TRONG MẢNG HIỆN TẠI");
            } 
            else {
                arl.forEach((item) -> {
                    System.out.print(" " + item + " ");
                });
            }
            System.out.println();
        } else {
            System.err.println("TỔNG SỐ PHẦN TỬ TRONG MẢNG PHẢI LỚN HƠN 1 !");
        }
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
//        RUNA();
//        RUNB();
//        RUNC();
//        RUND();
//        RUNE();
//        RUNF();
//        RUNGH();
        RUNI();
    }
}
