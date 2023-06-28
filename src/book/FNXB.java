/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class FNXB extends AConnguoi{
    
    public FNXB(){
    }
    public FNXB(String ID,String Ten,String DiaChi,String SDT,String STK,String ChinhanhSTK) {
         super(ID,Ten,DiaChi,SDT,STK,ChinhanhSTK);
    } 

    @Override
    public void nhap(){
        super.nhap();
    }
     @Override
    public String toString(){
        return super.toString();
    }
    @Override
     public String tieude(){
        return String.format("|%-10s|%-15s|%-30s|%-13s|%-20s|%-25s|", "Ma NXB","Ten NXB ","DiaChi NXB","So dien thoai NXB","So tai khoan ","Chi nhanh STK");
        
    }
}
  
