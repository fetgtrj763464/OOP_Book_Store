/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


    public class EDSPhieuTra extends EPhieuTra{
        static int n;
        EPhieuTra ds[];
        void nhapDSPhieuTra(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new EPhieuTra[n];
        for (int i = 0; i < n; i++) {
             ds[i] = new EPhieuTra();    
             ds[i].nhap();
        }
        }    
        void xuatDSPhieuTra(){
             for (int i = 0; i < n; i++)
                 ds[i].xuat();
        }
        boolean searchNXB(){
            System.out.println("Moi nhap ten can tim:");
            String spx=scanner.nextLine();
            int dem=0; 
            for (int i = 0; i < n; i++)
                 if(spx.equalsIgnoreCase(ds[i].getTenNXB())==true){
                     ds[i].xuat();
                     dem++;
                 }
            return dem!=0;
        }

}
