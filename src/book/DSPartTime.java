/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class DSPartTime extends DNVPartTime{
    static int n;
    DNVPartTime ds[];
    void nhapDSPartTime(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new DNVPartTime[n];
        for (int i = 0; i < n; i++) {
             ds[i] = new DNVPartTime();    
             ds[i].nhap();
        }
    }    
    void xuatDSPartTime(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchPartTime(){
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
