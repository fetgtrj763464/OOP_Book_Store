/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


import java.util.Scanner;


public class CSach {

    String MaS,TenS, MaTLoai,TenTLoai,TenNXB;
    int SL,Gia;
    Scanner scanner = new Scanner(System.in);
    
    public CSach(){
    }
    public CSach(String MaS,String TenS,String MaTLoai,String TenTLoai,String TenNXB,int SL,int Gia){
        super();
        this.MaS=MaS;
        this.TenS=TenS;
        this.MaTLoai=MaTLoai;
        this.TenTLoai=TenTLoai;
        this.TenNXB=TenNXB;
        this.SL=SL;
        this.Gia=Gia;
    }
    public String getMaSach() {
        return MaS;
    }
    public void setMaSach(String MaS) {
        this.MaS = MaS;
    }
    public String getTenSach() {
        return TenS;
    }
    public void setTenSach(String TenS) {
        this.TenS = TenS;
    }
    public String getMaTLoai() {
        return MaTLoai;
    }
    public void setMaTLoai(String MaTLoai) {
        this.MaTLoai = MaTLoai; 
    }
    public String getTenTLoai() {
        return TenTLoai;
    }
    public void setTenTLoai(String TenTLoai) {
        this.TenTLoai = TenTLoai; 
    }
    public String getTenNXB() {
        return TenNXB;
    }
    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB; 
    }
    public int getSoLuong() {
        return SL;
    }
    public void setSoLuong(int SL) {
        this.SL = SL;
    }
    public int getGia() {
        return Gia;
    }
 
    public void setGia(int Gia) {
        this.Gia = Gia;
    }
     
    public void nhap(){
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
    }
    @Override
    public String toString(){
       return String.format("|%-10s|%-40s|%-10s|%-20s|%-20s|%-10d|%-20d|",MaS,TenS,MaTLoai,TenTLoai,TenNXB,SL,Gia);  
    }
    
    public String tieude(){
        
       return String.format("|%-10s|%-40s|%-10s|%-20s|%-20s|%-10s|%-20s|","MaS","TenS","MaTLoai","TenTLoai","TenNXB","SL","Gia");
    }
    
    public void  xuat(){
        System.out.println(tieude());
        System.out.println(toString());
     }

}
