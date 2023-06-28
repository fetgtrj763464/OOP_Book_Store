/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IdocFile extends EPhieuNhap implements IdocghiFile{
    static int n;
    EPhieuNhap ds[];
    
     @Override
    public void ghiFile() {
        try {
            FileWriter fr=new FileWriter("test.txt");
            BufferedWriter br=new BufferedWriter(fr);
            String st;
            int i=0;
          // n=Integer.parseInt(br.writerLine());
            n=1;
            ds =new EPhieuNhap[n];
            for (int j=0;j<n;j++){
                ds[j] = new EPhieuNhap();    
                ds[j].nhap();
            }
            
            while(true){ 
                st = br.write();
                if(st==null) break;
                String[]s=st.split(";");
                String ms=s[0];
                String ts=s[1];
                String mt=s[2];
                String tl=s[3];
                String tn=s[4];
                int sl=Integer.parseInt((s[5]));
                int g=Integer.parseInt((s[6]));   
                int sp=Integer.parseInt((s[7]));
                int sn=Integer.parseInt((s[8]));
                String nn=s[9];
                String mn=s[10];
                ds[i]=new  EPhieuNhap(ms,ts,mt,tl,tn,sl,g,sp,sn,nn,mn);
                i++;
            }

        }catch (IOException e){}
    }
    
    @Override
    public void docFile(){
        
        try {
            FileReader fr=new FileReader("test.txt");
            BufferedReader br=new BufferedReader(fr);
            String st;
            int i=0;
            n=Integer.parseInt(br.readLine());
            ds =new EPhieuNhap[n];
            while(true){
                st=br.readLine();
                if(st==null)break;
                String[]s=st.split(";");
                String ms=s[0];
                String ts=s[1];
                String mt=s[2];
                String tl=s[3];
                String tn=s[4];
                int sl=Integer.parseInt((s[5]));
                int g=Integer.parseInt((s[6]));   
                int sp=Integer.parseInt((s[7]));
                int sn=Integer.parseInt((s[8]));
                String nn=s[9];
                String mn=s[10];
                ds[i]=new  EPhieuNhap(ms,ts,mt,tl,tn,sl,g,sp,sn,nn,mn);
                i++;
            }
        }catch (IOException e){}
    }
   
    public void xuatmang(EPhieuNhap list[]){
        for (EPhieuNhap s:list){
            s.xuat();
        }
                 
    }
    public static void main(String[] args) {
           IdocFile cb=new IdocFile();
//           cb.docFile();
           cb.ghiFile();
           cb.xuatmang(cb.ds);
    }

    

}
