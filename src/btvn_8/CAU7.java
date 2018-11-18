package btvn_8;

import java.util.Scanner;

public class CAU7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CÓ TRONG MẢNG: ");
        int x = scanner.nextInt();
        int[] ar = new int[x];
        System.out.println();
        if (x > 1) {
            int term1 = ar.length;
            int term2 = ar.length / 2;
            int term3 = 0;
            int term4 = 0;
            int[] ar1 = new int[term2];
            for (int i = 0; i < ar.length; i++) {
                System.out.printf("NHẬP PHẦN TỬ VỊ TRÍ %d : ", i);
                ar[i] = scanner.nextInt();
            }
            System.out.println("****************************************");
            for (int i = 0; i < ar.length; i++) {
                System.out.printf("| %d |", ar[i]);
            }
            if (x % 2 == 0 && term2 % 2 == 0 || term2 % 2 != 0) {
                for (int j = term1 - 1; j >= term2; j--) {
                    term3++;
                    ar1[term3 - 1] = ar[j];
                }
            } else {
                for (int j = term1 - 1; j > term2; j--) {
                    term3++;
                    ar1[term3 - 1] = ar[j];
                }
            }
            for (int i = 0; i < term2; i++) {
                if (ar[i] == ar1[i]) {
                    term4++;
                }
            }
            if (term4 == term2) {
                System.out.print(" --->>> ĐỐI XỨNG!");
            } else {
                System.out.print(" --->>> KHÔNG ĐỐI XỨNG!");
            }
            System.out.println();
            System.out.println("****************************************");
        } else {
            System.err.println("VUI LÒNG NHẬP SỐ NGUYÊN DƯƠNG LỚN HƠN 1 !");
        }
    }
}
