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
public class CAU1 {
    public static void RUN() {
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
    
    public static void main(String[] args) {
        RUN();
    }
}
