/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyMonAn {
    
    Scanner sc = new Scanner(System.in);
    
    public void nhap (List<MonAn> list) {
        int nhapTiep;
        do {            
            String ten = getInput("ten: ");
            int gia = Integer.parseInt(getInput("gia: "));
            int soLuong = Integer.parseInt(getInput("so luong: "));
            list.add(new MonAn(ten, gia, soLuong));        
            nhapTiep = Integer.parseInt(getInput("nhap tiep hay khong 1 - co/ 2- khong:"));
        } while (nhapTiep == 1);
    }
    
    public String getInput(String message) {
        System.out.println("Nhap " + message);
        return sc.nextLine();
    }
    
    public void xuat(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            for (MonAn ma : list) {
                ma.toString();
                ma.getGiaMon();
            }
        }
    }
    
    public void tinhTong(List<MonAn> list) {
        int tong = 0;
        for (MonAn ma : list) {
            tong += ma.getTong();
        }
        System.out.println("Tong tien phai tra la " + tong);
    }
    
    public void timMax(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            MonAn max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getTong() > max.getTong()) {
                    max = list.get(i);
                }
            }
            System.out.println("Mon co tong tien lon nhat la:");
            max.toString();
        }
    }
    
    public void sapXep(List<MonAn> list) {
        // C1
        list.sort((ma1, ma2) -> ma2.getGia() - ma1.getGia());
        // C2
//        Collections.sort(Comparator.comparing(MonAn::getGia).reversed());
        xuat(list);
    }
    
}
