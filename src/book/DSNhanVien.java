/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class DSNhanVien extends DNhanvien{
     static int n;
    DNhanvien ds[];
    void nhapDSNV(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new DNhanvien[n];
        for (int i = 0; i < n; i++) {
             ds[i] = new DNhanvien() {
                 @Override
                 double tinhLuong() {
                     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 }
             };    
             ds[i].nhap();
        }
    }    
    void xuatDSNV(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchNV(){
            System.out.println("Moi nhap ten can tim:");
            String snv=scanner.nextLine();
            int dem=0; 
            for (int i = 0; i < n; i++)
                 if(snv.equalsIgnoreCase(ds[i].getTen())==true){
                     ds[i].xuat();
                     dem++;
                 }
            return dem!=0;
    }

    @Override
    double tinhLuong() {
       
         return 0;
       
    }

    
   
}
