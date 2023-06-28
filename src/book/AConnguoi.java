/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;

public class AConnguoi {
    String ID,Ten,DiaChi,ChinhanhSTK, STK,SDT;
    Scanner scanner = new Scanner(System.in);
    
    public AConnguoi(){
    }
    
    public AConnguoi(String ID,String Ten,String DiaChi,String SDT,String STK,String ChinhanhSTK){
        super();
        this.ID=ID;
        this.Ten=Ten;
        this.DiaChi=DiaChi;
        this.SDT=SDT;
        this.STK=STK;
        this.ChinhanhSTK=ChinhanhSTK;
    }
    
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    
    public String getTen(){
        return Ten;
    }
    public void setTen(String Ten){
        this.Ten=Ten;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    
    public String getSDT(){
        return SDT;
    }
    public void setSDT(String SDT){
        this.SDT=SDT;   
    }
    
     public String getSTK(){
        return STK;
    }
    public void setSTK(String STK){
        this.STK=STK;   
    }
    
    public String getChinhanhSTK(){
        return ChinhanhSTK;
    }
    public void setChinhanhSTK(String ChinhanhSTK){
        this.ChinhanhSTK=ChinhanhSTK;
    }
    
    public void nhap(){
        System.out.println("Moi nhap ID :");
        ID=scanner.nextLine();
        System.out.println("Moi nhap ten :");
        Ten=scanner.nextLine();
        System.out.println("Moi nhap dia chi :");
        DiaChi=scanner.nextLine();
        System.out.println("Moi nhap SDT :");
        SDT=scanner.nextLine();
        System.out.println("Moi nhap STK :");
        STK=scanner.nextLine();
        System.out.println("Moi nhap chi nhanh STK :");
        ChinhanhSTK=scanner.nextLine();
        
    }
    
    @Override
    public String toString(){
        return String.format("|%-10s|%-15s|%-20s|%-13s|%-20s|%-20s|", ID,Ten,DiaChi,SDT,STK,ChinhanhSTK);
        
    }
    public String tieude(){
        return String.format("|%-10s|%-15s|%-20s|%-13s|%-20s|%-25s|", "Ma KH","Ten KH ","DiaChi Kh","So dien thoai KH","So tai khoan ","Chi nhanh STK");
        
    }
    public void  xuat(){
         System.out.println(tieude());
         System.out.println(toString());
     }
}