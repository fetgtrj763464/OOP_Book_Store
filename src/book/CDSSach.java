/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class CDSSach extends CSach implements ITinhtong{
        static int n;
        CSach ds[];
        void nhapDSachSACH(){
            System.out.println("Moi nhap so phan tu cua danh sach:");
            n = Integer.parseInt(scanner.nextLine());
            ds = new CSach[n];
            for (int i = 0; i < n; i++) {
                 ds[i] = new CSach();    
                 ds[i].nhap();
            }
        }    
        void xuatDSachSACH(){
             for (int i = 0; i < n; i++)
                 ds[i].xuat();
        }
        void themsach(){
            System.out.println("Moi nhap ma sach :");
            MaS=scanner.nextLine();
            System.out.println("Moi nhap ten sach :");
            TenS=scanner.nextLine();
            System.out.println("Moi nhap ma the loai :");
            MaTLoai=scanner.nextLine();
            System.out.println("Moi nhap ten the loai :");
            TenTLoai=scanner.nextLine();
            System.out.println("Moi nhap ten nha xuat ban :");
            TenNXB=scanner.nextLine();
            System.out.println("Moi nhap so luong :");
            SL=scanner.nextInt();
            System.out.println("Moi nhap gia :");
            Gia=scanner.nextInt();
            System.out.println(String.format("|%-10s|%-40s|%-10s|%-20s|%-20s|%-10d|%-20d|",MaS,TenS,MaTLoai,TenTLoai,TenNXB,SL,Gia));
            
        }
        boolean searchSach(){
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
        @Override
        public double tinhtong(){
            int sum=0;
            for (int i = 0; i < n; i++){
                sum+=ds[i].getSoLuong();
            }
            return sum;
        }
}
