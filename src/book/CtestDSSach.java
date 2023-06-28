/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;
public class CtestDSSach {
    public static void main(String[] args) {
        CDSSach list = new CDSSach();
          int chon;
          for(;;){
            System.out.println("\nMoi nhap lua chon:");
            chon = Integer.parseInt(new Scanner(System.in).nextLine());
            if (chon == 5) {
                    break;
                }
            switch (chon) {
                    case 1:
                        list.nhapDSachSACH();
                        break;
                    case 2:
                        list.xuatDSachSACH();
                        break;
                    case 3:
                        boolean kq = list.searchSach();
                        if (kq == false) {
                            System.out.println("Khong tim thay ban ghi thoa man ten da nhap");
                        }
                        break;
                    case 4: 
                        System.out.println("Tong so luong"+list.tinhtong());
                        break;
                    default:
                        System.out.println("Gia tri vua nhap khong hop le");
                }
          } 
    }
}
