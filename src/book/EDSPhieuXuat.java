/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;
public class EDSPhieuXuat extends EPhieuXuat{
    static int n;
    EPhieuXuat ds[];
    void nhapDS() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(sc.nextLine());
        ds = new EPhieuXuat[n];
        int chon;
        for (int i = 0; i < n; i++) {
            ds[i] = new EPhieuXuat();    
            ds[i].nhap();
            }
        }
    void xuatDSPhieuXuat(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchMaSach(){
        System.out.println("Moi nhap ma sach can tim:");
        String spx=scanner.nextLine();
        int dem=0; 
        for (int i = 0; i < n; i++)
             if(spx.equalsIgnoreCase(ds[i].getMaSach())==true){
                 ds[i].xuat();
                 dem++;
             }
        return dem!=0;
    }
}


