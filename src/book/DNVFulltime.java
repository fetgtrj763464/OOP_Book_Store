/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class DNVFulltime extends DNhanvien{
    private int soNgayLamThem,chon;
    private String loaiNhanVien;
    private static long luongSep = 20000000;
    private static long luongNVthuong = 10000000;
    private static long luonglamthem = 800000;
    
    public DNVFulltime(){
        
    }
    public DNVFulltime(String ID,String Ten,String DiaChi,String SDT,String STK,String ChinhanhSTK,int LuongNV,String GioiTinh,int NamSinh,int soNgayLamThem,String loaiNhanVien){
       super(ID,Ten,DiaChi,SDT,STK,ChinhanhSTK,GioiTinh,NamSinh,LuongNV);
       this.soNgayLamThem=soNgayLamThem;
       this.loaiNhanVien=loaiNhanVien;
    }
    
    public int getsoNgayLamThem(){
        return soNgayLamThem;
    }
    public void setsoNgayLamThem(int soNgayLamThem){
        this.soNgayLamThem=soNgayLamThem;
    }
    public String getloaiNhanVien(){
        return loaiNhanVien;
    }
    public void setloaiNhanVien(String loaiNhanVien){
        this.loaiNhanVien=loaiNhanVien;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap so ngay lam them :");
        soNgayLamThem=scanner.nextInt();
        System.out.println("Moi nhap loai nhan vien(1-Binh thuong,2-Sep ):");
        chon=scanner.nextInt();
        switch (chon) {
            case 1:
                loaiNhanVien="Nhan vien binh thuong";
                break;
            case 2:
                loaiNhanVien="Sep";
                break;
            default:
               System.out.println("Nhap loai nhan vien khong dung!");
               break;
        }
    }
    
    @Override
    public double tinhLuong(){
        if(loaiNhanVien.equals("Nhan vien binh thuong")){
            LuongNV=luongNVthuong+soNgayLamThem*luonglamthem;
        }else
             if(loaiNhanVien.equals("Sep")){
               LuongNV=luongSep+soNgayLamThem*luonglamthem;
             }
        return LuongNV;
    }
    
    @Override
    public String toString(){
        return super.toString()+String.format("%-15s|%-15d|", loaiNhanVien,soNgayLamThem);
    }
    @Override
    public String tieude(){
        return super.tieude()+String.format("%-15s|%-15s|", "Loai Nhan Vien","SoNgayLamThem");
        
    }
    @Override
     public void  xuat(){
         System.out.println(tieude());
         System.out.println(toString());
     }
}
