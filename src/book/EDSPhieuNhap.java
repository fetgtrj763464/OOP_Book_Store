/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class EDSPhieuNhap extends EPhieuNhap{
    static int n,id;
    EPhieuNhap ds[];
    void nhapDSPhieuNhap(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new EPhieuNhap[n];
        for (int i = 0; i < n; i++) {
             ds[i] = new EPhieuNhap();    
             ds[i].nhap();
        }
    }    
    void xuatDSPhieuNhap(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
    boolean searchNXB(){
        System.out.println("Moi nhap ten can tim:");
        String spn=scanner.nextLine();
        int dem=0; 
        for (int i = 0; i < n; i++)
             if(spn.equalsIgnoreCase(ds[i].getTenNXB())==true){
                 ds[i].xuat();
                 dem++;
             }
        return dem!=0;
    }
    boolean delete() {
        System.out.println("Moi nhap ten can xpa:");
        int k=scanner.nextInt();
        for(int i = 0; i < n; i++) {
            if(ds[i].getSoPN() == k) {
                int newSize = n - 1; 
                for(int j=i; j < newSize; j++) {
                    ds[j] = ds[j+1];
                }
                n--;
                return true;
            }
        }
        return false;
}
    
    
}
