/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;
public class EPhieuTra extends CSach{
    int MaPTra,SoLTra;
    private String NgayTra,LyDo;
    public EPhieuTra(String MaS,String TenS,String MaTLoai,String TenTLoai,String TenNXB,int SL,int Gia,int MaPTra,int SoLTra,String NgayTra,String LyDo){
         super(MaS,TenS,MaTLoai,TenTLoai,TenNXB,SL,Gia);
         this.LyDo=LyDo;
         this.MaPTra=MaPTra;
         this.SoLTra=SoLTra;
         this.NgayTra=NgayTra;
    }     
    public EPhieuTra(){
        
    }
    public int getMaPTra(){
        return MaPTra;
    }
    public void setMaPTra(int MaPTra){
        this.MaPTra=MaPTra;
    }
    
    public int getSoLTra(){
        return SoLTra;
    }
    public void setSoLTra(int SoLTra){
        this.SoLTra=SoLTra;
    }
    
    public String getNgayTra(){
        return NgayTra;
    }
    public void setNgayTra(String NgayTra){
        this.NgayTra=NgayTra;
    }
    
    public String getLyDo(){
        return LyDo;
    }
    public void setLyDo(String LyDo){
        this.LyDo=LyDo;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap ma tra sach :");
        MaPTra=scanner.nextInt();
        System.out.println("Moi nhap so luong tra :");
        SoLTra=scanner.nextInt();
        System.out.println("Moi nhap ngay tra :");
        setNgayTra(new Scanner(System.in).nextLine());
        System.out.println("Moi nhap ly do tra :");
        setLyDo(new Scanner(System.in).nextLine());
    }
    @Override
    public String toString(){
        return super.toString()+String.format("%-13d|%-10d|%-15s|%-25s|", MaPTra,SoLTra,NgayTra,LyDo);
    }
    @Override
    public String tieude(){
        return super.tieude()+String.format("%-10s|%-10s|%-15s|%-25s|","Ma Phieu Tra","So Luong Tra","Ngay tra","Ly Do");
    }

}

