package btvn_8;

import java.util.Scanner;

public class CAU4 {

    static Scanner scanner = new Scanner(System.in);

    static void RUNA() {
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CHO MẢNG: ");
        int spt = scanner.nextInt();
        int[] ar = new int[spt];
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP VỊ TRÍ %d: ", i + 1);
            ar[i] = scanner.nextInt();
        }
        System.out.println("----------------------------------------------------");
        System.out.print("PHẦN TỬ CÓ GIÁ TRỊ CHẴN VÀ VỊ TRÍ CHẴN: ");
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0 && ar[i] % 2 == 0) {
                System.out.print(" "+ar[i]+" ");
            }
        }
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        RUNA();
    }
}
