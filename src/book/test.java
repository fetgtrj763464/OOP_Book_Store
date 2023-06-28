/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class test {
     public static void main(String[] args) {
        CSach s=new CSach();
        AConnguoi cn=new AConnguoi();
        EPhieuNhap pn=new EPhieuNhap();
        EPhieuXuat px = new EPhieuXuat();
        EPhieuTra pt = new EPhieuTra();
        BKhachHang kh=new BKhachHang();
        GHoaDon hd=new GHoaDon();
           
        
        s.nhap();
        pn.nhap();   
        px.nhap();
        pt.nhap();
        kh.nhap();
        hd.nhap();
       
        
        s.xuat();
        pn.xuat();
        px.xuat();
        hd.xuat();
        
    }
}
