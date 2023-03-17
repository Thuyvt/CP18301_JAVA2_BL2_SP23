/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class LapTopService {

    public void sapXepByTen(List<LapTop> list) {
        list.sort(Comparator.comparing(LapTop::getTen).reversed());
    }
    
    public List<LapTop> timKiemByTen(List<LapTop> list, String ten) {
        List<LapTop> listTimKiem = new ArrayList<>();
        for (LapTop lt : list) {
            if (lt.getTen().contains(ten)) {
                listTimKiem.add(lt);
            }
        }
        return listTimKiem;
    } 
}
