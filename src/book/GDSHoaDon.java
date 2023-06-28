/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class GDSHoaDon extends GHoaDon implements ITinhtong{
    static int n;
    GHoaDon ds[];
    
    void nhapDSHoaDon(){
        System.out.println("Moi nhap so phan tu cua danh sach:");
        n = Integer.parseInt(scanner.nextLine());
        ds = new GHoaDon[n];
        for (int i = 0; i < n; i++) {
             ds[i] = new GHoaDon();    
             ds[i].nhap();
        }
    }    
    void xuatDSHoaDon(){
         for (int i = 0; i < n; i++)
             ds[i].xuat();
    }
     boolean searchHoadon(){
            System.out.println("Moi nhap ten can tim:");
            String sh=scanner.nextLine();
            int dem=0; 
            for (int i = 0; i < n; i++)
                 if(sh.equalsIgnoreCase(ds[i].getMaSach())==true){
                     ds[i].xuat();
                     dem++;
                 }
            return dem!=0;
        }

    @Override
     public double tinhtong(){
            int sum=0;
            System.out.println("Moi nhap ngay ban:");
            String k=scanner.nextLine();
            for (int i = 0; i < n; i++){
                if(ds[i].getNgayBan()==k)
                sum+=ds[i].getGia();
            }
            return sum;
        }
}
