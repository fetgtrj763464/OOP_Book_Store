/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class BDSKhachhang extends BKhachHang{
    static int n;
    BKhachHang ds[];
    void nhapDSKH(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new BKhachHang[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new BKhachHang();
            ds[i].nhap();
    }
    }
    void xuatDSKH(){
    for (int i = 0; i < n; i++)
    ds[i].xuat();
    }

    boolean searchKH(){
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
