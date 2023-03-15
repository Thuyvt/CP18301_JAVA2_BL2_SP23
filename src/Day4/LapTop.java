/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author ThuyVT
 */
public class LapTop {
    private String ten;
    private String hang;
    private int namSx;
    private int oCung; // int 1 = SSD, int 2 = HDD
    private double giaTien;
    private boolean trangThai;

    public LapTop() {
    }

    public LapTop(String ten, String hang, int namSx, int oCung, double giaTien, boolean trangThai) {
        this.ten = ten;
        this.hang = hang;
        this.namSx = namSx;
        this.oCung = oCung;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public int getoCung() {
        return oCung;
    }

    public void setoCung(int oCung) {
        this.oCung = oCung;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

  
    
}
