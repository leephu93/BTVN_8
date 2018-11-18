package btvn_8;

import java.util.Scanner;

public class CAU6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CÓ TRONG MẢNG: ");
        int x = scanner.nextInt();
        int[] ar = new int[x];
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("NHẬP PHẦN TỬ VỊ TRÍ %d : ",i);
            ar[i] = scanner.nextInt();
        }
        System.out.println("****************************************");
        int tong = 0, count = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] % 2 == 0){
                tong += ar[i];
                count++;
            }
        }
        System.out.println("KẾT QUẢ TỔNG CÁC PHẦN TỬ CÓ GIÁ TRỊ CHẴN: "+(float)tong/count);
        System.out.println("****************************************");
    }
}
