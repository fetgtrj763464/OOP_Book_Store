/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


public class DNVPartTime extends DNhanvien{
    int gioLamViec;
    int luongPartTime_1gio= 100000;
    public DNVPartTime(){
        
    } 
    public DNVPartTime(String ID,String Ten,String DiaChi,String SDT,String STK,String ChinhanhSTK,long LuongNV,String GioiTinh,int NamSinh,int gioLamViec){
        super(ID,Ten,DiaChi,SDT,STK,ChinhanhSTK,GioiTinh,NamSinh,LuongNV);
        this.gioLamViec=gioLamViec;
    }
    public int getgiolamviec(){
        return gioLamViec;
    }
    public void setgiolamviec(int gioLamViec){
        this.gioLamViec=gioLamViec;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap so gio lam :");
        gioLamViec=scanner.nextInt();
    }

 
    
    @Override
      public double tinhLuong(){
       return luongPartTime_1gio*gioLamViec;
        
    }
    @Override
    public String toString(){
        return super.toString()+String.format("%-10d|%-15f|", gioLamViec,tinhLuong());
    }
    @Override
    public String tieude(){
        return super.tieude()+String.format("%-10s|%-15s|", "Gio Lam Viec","Luong nv");
        
    }
}
