/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


import java.util.Scanner;
public class GHoaDon extends CSach{
    int SoHD=-1;
    static int count=-1;
    private String NgayBan;
    
    public GHoaDon(String NgayBan,String MaS,String TenS,String MaTLoai,String TenTLoai,String TenNXB,int SL,int Gia){
         super(MaS,TenS,MaTLoai,TenTLoai,TenNXB,SL,Gia);
         this.NgayBan=NgayBan;
         count++;
    }
    
    public GHoaDon(){
        SoHD=++count;
    }
    
    public int getSoHD(){
        return SoHD;
    }
    public void setSoHD(int SoHD){
        this.SoHD=SoHD;
    }
    public String getNgayBan(){
        return NgayBan;
    }
    public void setNgayBan(String NgayBan){
        this.NgayBan=NgayBan;
    }
    public int thanhtien(){
        return SL*Gia;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap ngay ban :");
        setNgayBan(new Scanner(System.in).nextLine());
    }
    @Override
    public String toString(){
       return super.toString()+String.format("|%-15d|%-10s|",SoHD,NgayBan); 
    }
    
    @Override
    public String tieude(){   
       return super.tieude()+String.format("|%-15s|%-10s|","SoHD","NgayBan");
    }
    

}
