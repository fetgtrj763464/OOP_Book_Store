/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class FDSNXB extends FNXB{
    static int n;
    FNXB ds[];
    void nhapDSNXB(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new FNXB[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new FNXB();
            ds[i].nhap();
    }
    }
    void xuatDSNXB(){
    for (int i = 0; i < n; i++)
    ds[i].xuat();
    }

    boolean searchNXB(){
        System.out.println("Moi nhap ten can tim:");
        String ss=scanner.nextLine();
        int dem=0;
        for (int i = 0; i < n; i++)
        if(ss.equalsIgnoreCase(ds[i].getTen())==true){
        ds[i].xuat();
        dem++;
        }
        return dem!=0;
    }
}
