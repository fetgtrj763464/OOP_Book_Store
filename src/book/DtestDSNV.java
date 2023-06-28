/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;


public class DtestDSNV {
    public static void main(String[] args) {
        System.out.println("***********************");
        System.out.println(" 1. Nhap danh sach nhan vien");
        System.out.println(" 2. Xuat danh sach nhan vien");
        System.out.println(" Them ");
        System.out.println(" Sua ");
        System.out.println(" Xoa");
        System.out.println(" 3. Tim theo ten");
        System.out.println(" 4. Thoat");
        System.out.println("***********************");
        DSNhanVien list = new DSNhanVien();
          int chon;
          for(;;){
            System.out.println("\nMoi nhap lua chon:");
            chon = Integer.parseInt(new Scanner(System.in).nextLine());
            if (chon == 4) {
                    break;
                }
            switch (chon) {
                    case 1:
                        list.nhapDSNV();
                        break;
                    case 2:
                        list.xuatDSNV();
                        break;
                    case 3:
                        boolean kq = list.searchNV();
                        if (kq == false) {
                            System.out.println("Khong tim thay ban ghi thoa man ten da nhap");
                        }
                        break;
                    default:
                        System.out.println("Gia tri vua nhap khong hop le");
                }
          } 
    }
}

