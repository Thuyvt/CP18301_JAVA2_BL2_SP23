/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class DongHo implements Runnable {

    @Override
    public void run() {
        int s = 0; // giây
        int m = 0; // phút
        int h = 0; // giờ

        while (true) {
//            s += 1;
//            if (s == 60) {
//                m += 1;
//                s = 0;
//            }
//            if (m == 60) {
//                h += 1;
//                m = 0;
//                s = 0;
//            }
//            if (h == 24) {
//                h = 0;
//                m = 0;
//                s = 0;
//            }
            // Lấy thông tin của giờ, phút giây của hệ thống
            Calendar cal = Calendar.getInstance();
            h = cal.get(Calendar.HOUR);// giờ hiện tại
            m = cal.get(Calendar.MINUTE);// phút
            s = cal.get(Calendar.SECOND);// giây
            System.out.println(h + ":" + m + ":" + s);
            try {
                // ngắt giữa các vòng lặp 1s
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DongHo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
        DongHo dh = new DongHo();
        dh.run();
    }

}
