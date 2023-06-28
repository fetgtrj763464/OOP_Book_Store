/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

public abstract class DNhanvien extends AConnguoi{
    protected long   LuongNV;
    String GioiTinh;
    int NamSinh;
    public DNhanvien(){
    }
    public DNhanvien(String ID,String Ten,String DiaChi,String SDT,String STK,String ChinhanhSTK,String GioiTinh,int NamSinh,long LuongNV){
        super(ID,Ten,DiaChi,SDT,STK,ChinhanhSTK);
        this.GioiTinh=GioiTinh;
        this.NamSinh=NamSinh;
        this.LuongNV=LuongNV;
    }
    
    public long getLuongNV(){
        return LuongNV;
    }
    public void setLuongNV(long LuongNV){
        this.LuongNV=LuongNV;
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
    public int getNamSinh(){
        return NamSinh;
    }
    public void setNamSinh(int NamSinh){
        this.NamSinh=NamSinh;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap luong nhan vien :");
        LuongNV=scanner.nextInt();
        setGioiTinh(this.GioiTinh);
        System.out.println("Moi nhap nam sinh :");
        NamSinh=scanner.nextInt();
    }
    // khai báo phương thức tinhLuong() là phương thức trừu tượng
    abstract double tinhLuong();
    
    @Override
    public String toString(){
        return String.format("|%-10s|%-15s|%-14s|%-10s|%-10d|%-13s|%-20s|%-20s|%-15f", ID,Ten,DiaChi,GioiTinh,NamSinh,SDT,STK,ChinhanhSTK,tinhLuong());
    }
    @Override
    public String tieude(){
       return String.format("|%-10s|%-15s|%-14s|%-10s|%-10s|%-13s|%-20s|%-20s|%-15s", "Ma NV","Ten NV ","DiaChi NV","Gioi tinh","Nam sinh","So dien thoai NV","So tai khoan ","Chi nhanh STK","Luong NV");
       
    }
    @Override
     public void  xuat(){
         System.out.println(tieude());
         System.out.println(toString());
     }
}
