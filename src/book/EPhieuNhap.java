/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;

public class EPhieuNhap extends CSach{
    private int SoPN, SLNhap;
    private String MaNXB, NgayNhap;
    public EPhieuNhap(String MaS, String TenS, String MaTLoai, String TenTLoai, String TenNXB, int SL, int Gia, int SoPN, int SLNhap, String NgayNhap, String MaNXB)
    {
         super(MaS,TenS,MaTLoai,TenTLoai,TenNXB,SL,Gia);
         this.SoPN=SoPN;
         this.SLNhap=SLNhap;
         this.NgayNhap=NgayNhap;
         this.MaNXB=MaNXB;
    } 
    public EPhieuNhap(){
        
    }
    public int getSoPN(){
        return SoPN;
    }
    public void setSoPN(int SoPN){
        this.SoPN=SoPN;
    }
    public int getSLNhap(){
        return SLNhap;
    }
    public void setSLNhap(int SLNhap){
        this.SLNhap=SLNhap;
    }
    public String getNgayNhap(){
        return NgayNhap;
    }
    public void setNgayNhap(String NgayNhap){
        this.NgayNhap=NgayNhap;
    }
    public String getMaNXB(){
        return MaNXB;
    }
    public void setMaNXB(String MaNXB){
        this.MaNXB=MaNXB;
    }
    @Override
    public void nhap(){
        super.nhap(); 
        
        System.out.println("Moi nhap ma nha xuat ban: ");
        setMaNXB(new Scanner(System.in).nextLine());
         //MaNXB=scanner.nextLine();
        System.out.println("Moi nhap so phieu nhap: ");
        SoPN=scanner.nextInt();
        System.out.println("Moi nhap so luong nhap : ");
        SLNhap=scanner.nextInt();
        System.out.println("Moi nhap ngay nhap: ");
        setNgayNhap(new Scanner(System.in).nextLine());
        //NgayNhap=scanner.nextLine();
        //setNgayNhap(new Scanner(System.in).next());
       // System.out.println("Moi nhap ngay nhap: "+NgayNhap.ngay);
        // getngay(new Scanner(System.in).nextInt());
        //NgayNhap.ngay(this.NgayNhap.ngay)
    }
    @Override
    public String toString(){
       // return super.toString()+String.format("%-10s|%-15d|%-10d|%-15s|",MaNXB,SoPN,SLNhap,NgayNhap);
        return String.format("%-10s|%-15d|%-10d|%-15s|",MaNXB,SoPN,SLNhap,NgayNhap);
    }
    @Override
    public String tieude(){
       //return String.format("|%-10s|%-40s|%-10s|%-20s|%-20s|%-10s|%-20s|","MaS","TenS","MaTLoai","TenTLoai","TenNXB","SL","Gia");
        return String.format("%-10s|%-15d|%-10d|%-15s|","Ma NXB","So PN","SL Nhap","Ngay Nhap");
       //return super.tieude()+String.format("%-10s|%-15d|%-10d|%-15s|","Ma NXB","So PN","SL Nhap","Ngay Nhap");
    }
    @Override
     public void  xuat(){
         System.out.println(tieude());
         System.out.println(toString());
     }

    
}

