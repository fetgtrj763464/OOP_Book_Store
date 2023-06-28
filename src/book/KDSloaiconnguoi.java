/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class KDSloaiconnguoi extends AConnguoi{
    static int n;
    AConnguoi ds[];
    void nhapDSCN(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new AConnguoi[n];
        int chon;
        for (int i = 0; i < n; i++) {
            System.out.println("Moi chon loai danh sach:");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    ds[i] = new AConnguoi();break;
                case 2:
                    ds[i] = new DNVFulltime();break;
                case 3:
                    ds[i] = new DNVPartTime();break;
                case 4:
                    ds[i] = new FNXB();break; 
                case 5:
                    ds[i] = new BKhachHang();break;     
            }
            ds[i].nhap();

        }
    }
    void xuatDSCN(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchName(){
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
