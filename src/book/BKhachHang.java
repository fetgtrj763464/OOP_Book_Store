/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public class BKhachHang extends AConnguoi{ 
    String GioiTinh;
    int NamSinh;
    public BKhachHang(){
        }
    
    public BKhachHang(String ID,String Ten,String DiaChi,String GioiTinh,int NamSinh,String SDT,String STK,String ChinhanhSTK){
        super(); 
    }
    public int getNamSinh(){
        return NamSinh;
    }
    public void setNamSinh(int NamSinh){
        this.NamSinh=NamSinh;
    }
    
    public String getGioiTinh(){
        return GioiTinh;
    }
    public void setGioiTinh(String GioiTinh) {
        while(true){
            System.out.println("Moi nhap gioi tinh:");
            GioiTinh= scanner.nextLine();
            if(GioiTinh.equalsIgnoreCase("nam")
                    ||GioiTinh.equalsIgnoreCase("nu"))
                break;
        }
        this.GioiTinh = GioiTinh;
    }
    
    @Override
    public void nhap(){
           super.nhap();
           setGioiTinh("");
           System.out.println("Moi nhap nam sinh :");
           NamSinh=scanner.nextInt();
    }
    
    @Override
    public String toString(){
        return String.format("|%-10s|%-15s|%-4s|%-10d|%-30s|%-13s|%-20s|%-25s|", ID,Ten,GioiTinh,NamSinh,DiaChi,SDT,STK,ChinhanhSTK);
        
    }
    @Override
    public String tieude(){
        return String.format("|%-10s|%-15s|%-4s|%-10s|%-30s|%-13s|%-20s|%-25s|", "Ma KH","Ten KH","Gioi Tinh","Nam Sinh","DiaChi","So dien thoai KH","So tai khoan","Chi nhanh STK");
        
    }

}
    
