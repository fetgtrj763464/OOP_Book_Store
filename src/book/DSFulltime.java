/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class DSFulltime extends DNVFulltime{
    static int n;
    DNVFulltime ds[];
    void nhapDSFulltime(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new DNVFulltime[n];
        for (int i = 0; i < n; i++) {
             ds[i] = new DNVFulltime();    
             ds[i].nhap();
        }
    }    
    void xuatDSFulltime(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchNhanvien(){
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
}