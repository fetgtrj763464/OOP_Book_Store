/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;
public class EPhieuXuat extends CSach{
    private int SoPX, SLXuat;
    private String NgayXuat;
    public EPhieuXuat(String MaS,String TenS,String MaTLoai,String TenTLoai,String TenNXB,int SL,int Gia, int SoPX, int SLXuat, String NgayXuat)
    {
         super(MaS,TenS,MaTLoai,TenTLoai,TenNXB,SL,Gia);
         this.SoPX=SoPX;
         this.SLXuat=SLXuat;
         this.NgayXuat=NgayXuat;
    } 
    public EPhieuXuat(){
        
    }
    public int getSoPX(){
        return SoPX;
    }
    public void setSoPX(int SoPX){
        this.SoPX=SoPX;
    }
    public int getSLXuat(){
        return SLXuat;
    }
    public void setSLXuat(int SLXuat){
        this.SLXuat=SLXuat;
    }
    public String getNgayXuat(){
        return NgayXuat;
    }
    public void setNgayXuat(String NgayXuat){
        this.NgayXuat=NgayXuat;
    }
    
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap so phieu xuat: ");
        SoPX=scanner.nextInt();
        System.out.println("Moi nhap so luong xuat: ");
        SLXuat=scanner.nextInt();
        System.out.println("Moi nhap ngay xuat: ");
        setNgayXuat(new Scanner(System.in).nextLine());
    }
    @Override
    public String toString(){
        return super.toString()+String.format("%-10d|%-10d|%-15s|", SoPX,SLXuat,NgayXuat);
    }
    @Override
    public String tieude(){
        return super.tieude()+String.format("%-10s|%-10s|%-15s|", "So PX","SL Xuat","Ngay Xuat");
    }
}
