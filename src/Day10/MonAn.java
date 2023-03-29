/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.Serializable;

/**
 *
 * @author ThuyVT
 */
public class MonAn implements Serializable {
    private String ten;
    private double gia;
    private String loai;
    private int soLuong;
    private String kichThuoc;
    private boolean trangThai;

    public MonAn() {
    }

    public MonAn(String ten, double gia, String loai, int soLuong, String kichThuoc, boolean trangThai) {
        this.ten = ten;
        this.gia = gia;
        this.loai = loai;
        this.soLuong = soLuong;
        this.kichThuoc = kichThuoc;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
