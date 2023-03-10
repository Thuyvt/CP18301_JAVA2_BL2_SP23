/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import Day1.MonAn;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        MonAn phoBo = new PhoBo();
        IService qlPb = new QuanLyPhoBo();
        qlPb.nhap();
        qlPb.xuat();
        qlPb.sua();
        
        MonAn comRang = new ComRang();
        IService qlCr = new QuanLyComRang();
        qlCr.nhap();
        qlCr.xuat();
        
        
    }
}
