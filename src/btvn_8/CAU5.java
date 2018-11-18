package btvn_8;

import java.util.ArrayList;
import java.util.Scanner;

public class CAU5 {

    static Scanner scanner = new Scanner(System.in);
    static int[][] ar1 = new int[3][4];
    static ArrayList ar2 = new ArrayList();
    static ArrayList ar3 = new ArrayList();

    static void INSERT() {
        System.out.println("HÃY NHẬP 12 GIÁ TRỊ CHO CÁC PHẦN TỬ CỦA MẢNG HAI CHIỀU:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("NHẬP GIÁ TRỊ CHO PHẦN TỬ VỊ TRÍ (%d,%d): ", i, j);
                int term = scanner.nextInt();
                if (term > 0) {
                    ar1[i][j] = term;
                } else {
                    System.err.println("VUI LÒNG NHẬP SỐ LỚN HƠN 0 !");
                }
            }
        }
    }

    static void VIEW() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar1[i][j] < 10) {
                    System.out.printf("| 0%d |", ar1[i][j]);
                } else {
                    System.out.printf("| %d |", ar1[i][j]);
                }
            }
            System.out.println();
        }
    }

    static void RUNA() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        int min = ar1[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar1[i][j] < min) {
                    min = ar1[i][j];
                }
            }
        }
        System.out.println("SỐ NHỎ NHẤT TRONG MA TRẬN HIỆN TẠI: " + min);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar1[i][j] == min) {
                    System.out.printf("VỊ TRÍ CỦA SỐ NHỎ NHẤT: (%d,%d)", i, j);
                    System.out.println();
                }
            }
        }
        System.out.println("****************************************************");
    }

    static void RUNB() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        int max = 0, term = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar1[i][j] > max) {
                    max = ar1[i][j];
                }
            }
        }
        System.out.println("SỐ LỚN NHẤT TRONG MA TRẬN HIỆN TẠI: " + max);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (ar1[i][j] == max) {
                    System.out.printf("VỊ TRÍ CỦA SỐ LỚN NHẤT: (%d,%d)", i, j);
                    System.out.println();
                }
            }
        }
        System.out.println("****************************************************");
    }

    static void RUNC() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ar2.add(ar1[i][j]);
            }
        }
        for (int i = 0; i < ar2.size(); i++) {
            int count = 0;
            for (int j = 1; j <= (int) ar2.get(i); j++) {
                if ((int) ar2.get(i) % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                if (!ar3.contains(ar2.get(i))) {
                    ar3.add(ar2.get(i));
                }
            }
        }
        for (int k = 0; k < ar3.size(); k++) {
            System.out.print("VỊ TRÍ PHẦN TỬ LÀ SỐ NGUYÊN TỐ - " + ar3.get(k) + " : ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (ar1[i][j] == (int) ar3.get(k)) {
                        System.out.print("(" + i + "," + j + ")");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("****************************************************");
    }

    static void RUND() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        for (int i = 0; i < 3; i++) {
            int tong = 0;
            for (int j = 0; j < 4; j++) {
                tong += ar1[i][j];
                if (ar1[i][j] < 10) {
                    System.out.printf("| 0%d |", ar1[i][j]);
                } else {
                    System.out.printf("| %d |", ar1[i][j]);
                }
            }
            System.out.print(" --->>> " + (float) tong / 4);
            System.out.println();
        }
        System.out.println("****************************************************");
    }

    static void RUNE() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                ar2.add(ar1[i][j]);
            }
        }
        for (int k = 0; k < ar2.size(); k++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if ((int) ar2.get(k) == ar1[i][j]) {
                        count++;
                    }
                }
            }
            if (count >= 2) {
                if (ar3.contains(ar2.get(k)) == false) {
                    ar3.add(ar2.get(k));
                }
            }
        }
        for (Object item : ar3) {
            System.out.println("PHẦN TỬ CÓ GIÁ TRỊ TRÙNG NHAU: " + item);
        }
        System.out.println("****************************************************");
    }

    static void RUNF() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        System.out.print("NHẬP VÀO GIÁ TRỊ CẦN XÁC ĐỊNH LỚN HƠN: ");
        int x = scanner.nextInt();
        System.out.println("KẾT QUẢ: ");
        for (int i = 0; i < 3; i++) {
            int tong = 0;
            for (int j = 0; j < 4; j++) {
                tong += ar1[i][j];
            }
            if (tong > x) {
                for (int j = 0; j < 4; j++) {
                    if (ar1[i][j] < 10) {
                        System.out.printf("| 0%d |", ar1[i][j]);
                    } else {
                        System.out.printf("| %d |", ar1[i][j]);
                    }
                }
                System.out.println();
            }
        }
        System.out.println("****************************************************");
    }

    static void RUNG() {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
        System.out.print("NHẬP VÀO GIÁ TRỊ CẦN XÁC ĐỊNH LỚN HƠN: ");
        int x = scanner.nextInt();
        System.out.println("KẾT QUẢ: ");
        for (int i = 0; i < 3; i++) {
            int tong = 0;
            for (int j = 0; j < 4; j++) {
                tong += ar1[i][j];
            }
            if ((float) tong / 4 < (float) x) {
                for (int j = 0; j < 4; j++) {
                    if (ar1[i][j] < 10) {
                        System.out.printf("| 0%d |", ar1[i][j]);
                    } else {
                        System.out.printf("| %d |", ar1[i][j]);
                    }
                }
                System.out.println();
            }
        }
        System.out.println("****************************************************");
    }

    static void RUNI() {
        
        System.out.print("NHẬP VÀO GIÁ TRỊ CẦN XÁC ĐỊNH LỚN HƠN: ");
        int x = scanner.nextInt();
        for (int i = 0; i < 4; i++) {
            int tong = 0;
            ArrayList ar_term = new ArrayList();
            for (int j = 0; j < 3; j++) {
                tong += ar1[j][i];
                ar_term.add(ar1[j][i]);
            }
            if (tong > x) {
                System.out.printf("CỘT SỐ %d",i+1);
                System.out.println();
                for (int j = 0; j < 3; j++) {
                    System.out.println("|" + ar_term.get(j) + "|");
                }
            }
        }
        System.out.println("****************************************************");
    }

    public static void main(String[] args) {
        INSERT();
        System.out.println("****************************************************");
        VIEW();
        System.out.println("****************************************************");
//        RUNA();
//        RUNB();
//        RUNC();
//        RUND();
//        RUNE();
//        RUNF();
//        RUNG();
        RUNI();
    }
}
