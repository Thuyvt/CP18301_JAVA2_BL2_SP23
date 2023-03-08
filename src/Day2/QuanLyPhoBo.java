/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author ThuyVT
 */
public class QuanLyPhoBo implements IService {

    @Override
    public void nhap() {
        System.out.println("Nhap pho bo");
    }

    @Override
    public void xuat() {
        System.out.println("Xuat pho bo");
    }

    @Override
    public void sua() {
        System.out.println("Sua pho bo");
    }

    @Override
    public void xoa() {
        System.out.println("Xoa pho bo");
    }

    @Override
    public void tim() {
        System.out.println("Tim pho bo");
    }
    
}
