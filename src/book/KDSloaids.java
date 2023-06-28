/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class KDSloaids extends CSach{
    static int n;
    CSach ds[];
    void nhapDSsach(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new CSach[n];
        int chon;
        for (int i = 0; i < n; i++) {
            System.out.println("Moi chon loai danh sach:");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    ds[i] = new CSach();break;
                case 2:
                    ds[i] = new EPhieuTra();break;
                case 3:
                    ds[i] = new EPhieuNhap();break;
                case 4:
                    ds[i] = new EPhieuXuat();break;  
            }
            ds[i].nhap();

        }
    }
    void xuatDSsach(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchName(){
        System.out.println("Moi nhap ten can tim:");
        String ss=scanner.nextLine();
        int dem=0; 
        for (int i = 0; i < n; i++)
             if(ss.equalsIgnoreCase(ds[i].getTenSach())==true){
                 ds[i].xuat();
                 dem++;
             }
        return dem!=0;
    }
    int tinhtongSL(){
        int sum=0;
        for (int i = 0; i < n; i++){
            sum=+ds[i].SL;
        }
        return sum;
    }
}
