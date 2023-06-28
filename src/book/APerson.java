/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

import java.util.Scanner;

/**
 *
 * @author nonle
 */
public class APerson {
    String ID,Ten,DiaChi,ChinhanhSTK, STK,SDT;
    Scanner scanner = new Scanner(System.in);

    public APerson(String ID, String Ten, String DiaChi, String ChinhanhSTK, String STK, String SDT) {
        this.ID = ID;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.ChinhanhSTK = ChinhanhSTK;
        this.STK = STK;
        this.SDT = SDT;
    }

    public APerson() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getChinhanhSTK() {
        return ChinhanhSTK;
    }

    public void setChinhanhSTK(String ChinhanhSTK) {
        this.ChinhanhSTK = ChinhanhSTK;
    }

    public String getSTK() {
        return STK;
    }

    public void setSTK(String STK) {
        this.STK = STK;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    
    
}
