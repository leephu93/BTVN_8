package btvn_8;

import java.util.Scanner;

public class BTVN_8 {

    static void INSERT1ELEMENT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CÓ TRONG MẢNG: ");
        int x = scanner.nextInt();
        int[] ar = new int[x + 1];
        int count = 0;
        do {
            count++;
            System.out.printf("NHẬP PHẦN TỬ VỊ TRÍ %d : ", count - 1);
            ar[count - 1] = scanner.nextInt();
        } while (count < x);
        System.out.println("****************************************");
        System.out.print("MẢNG TRƯỚC KHI CHÈN: ");
        for (int i = 0; i < ar.length; i++) {
            if (i != ar.length - 1) {
                System.out.printf("| %d |", ar[i]);
            }
        }
        System.out.println();
        System.out.print("VỊ TRÍ PHẦN TỬ MUỐN CHÈN: ");
        int xxx = scanner.nextInt();
        System.out.print("GIÁ TRỊ MUỐN CHÈN: ");
        int xxxx = scanner.nextInt();
        System.out.print("MẢNG SAU KHI CHÈN: ");
        for (int i = 0; i < ar.length; i++) {
            if (i == xxx) {
                for (int j = x; j > xxx; j--) {
                    ar[j] = ar[j - 1];
                }
                ar[xxx] = xxxx;
            }
            System.out.printf("| %d |", ar[i]);
        }
        System.out.println();
        System.out.println("****************************************");
    }

    static void PAGINATION() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NHẬP TỔNG SỐ PHẦN TỬ CÓ TRONG MẢNG: ");
        int x = scanner.nextInt();
        int[] ar = new int[x];
        int count = 0;
        int pages = 0;
        do {
            count++;
            System.out.printf("NHẬP PHẦN TỬ VỊ TRÍ %d : ", count - 1);
            ar[count - 1] = scanner.nextInt();
        } while (count < x);
        System.out.println("****************************************");
        System.out.print("MẢNG HIỆN TẠI: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("| %d |", ar[i]);
        }
        System.out.println();
        if (x % 4 == 0) {
            pages = x / 4;
        } else {
            pages = x / 4;
            pages += 1;
        }
        System.out.println("HIỆN CÓ " + pages + " TRANG !");
        int term = 0;
        do {
            System.out.print("NHẬP TRANG MUỐN TÌM: ");
            int page = scanner.nextInt();
            term = page;
            if (ar.length % 4 == 0) {
                for (int i = 0; i <= ar.length; i++) {
                    if (i / 4 == page && i % 4 == 0) {
                        for (int j = i - 4; j < page * 4; j++) {
                            System.out.printf(" %d ", ar[j]);
                        }
                    }
                }
            } else {
                if (page == pages) {
                    int term1 = 0;
                    for (int i = 0; i <= ar.length; i++) {
                        int term2 = 0;
                        if (i % 4 == 0) {
                            term1++;
                            term2 = i;
                            if (term1 == pages) {
                                for (int j = term2; j < ar.length; j++) {
                                    System.out.printf(" %d ", ar[j]);
                                }
                            }
                        }
                    }
                } else {
                    for (int i = 0; i <= ar.length; i++) {
                        if (i / 4 == page && i % 4 == 0) {
                            for (int j = i - 4; j < page * 4; j++) {
                                System.out.printf(" %d ", ar[j]);
                            }
                        }
                    }
                }
            }
            System.out.println();
        } while (term != 0);
        System.out.println("****************************************");
    }

    static void SHOWBANNER() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 18; j++) {
                switch (i) {
                    case 0:
                        if(j % 2 == 0){
                            System.out.print(" * ");
                        }
                        else{
                            System.out.print(" - ");
                        }
                        break;
                    case 1:
                        switch (j) {
                            case 0:
                                System.out.print(" | ");
                                break;
                            case 17:
                                System.out.print(" * ");
                                break;
                            default:
                                System.out.print("   ");
                                break;
                        }
                        break;
                    case 2:
                        switch (j) {
                            case 0:
                                System.out.print(" * ");
                                break;
                            case 17:
                                System.out.print(" | ");
                                break;
                            case 4:
                                System.out.print(" L ");
                                break;
                            case 5:
                                System.out.print(" Ê ");
                                break;
                            case 7:
                                System.out.print(" V ");
                                break;
                            case 8:
                                System.out.print(" Ă ");
                                break;
                            case 9:
                                System.out.print(" N ");
                                break;
                            case 11:
                                System.out.print(" P ");
                                break;
                            case 12:
                                System.out.print(" H ");
                                break;
                            case 13:
                                System.out.print(" Ú ");
                                break;
                            default:
                                System.out.print("   ");
                                break;
                        }
                        break;
                    case 3:
                        switch (j) {
                            case 0:
                                System.out.print(" | ");
                                break;
                            case 17:
                                System.out.print(" * ");
                                break;
                            default:
                                System.out.print("   ");
                                break;
                        }
                        break;
                    case 4:
                        if(j % 2 == 0){
                            System.out.print(" * ");
                        }
                        else{
                            System.out.print(" - ");
                        }
                        break;
                };
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
//        INSERT1ELEMENT();
//        PAGINATION();
        SHOWBANNER();
    }

}
