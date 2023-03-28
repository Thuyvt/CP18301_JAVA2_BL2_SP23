/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class MonAnService {

    public String ghiFile(String path, List<MonAn> danhSach) {
        try {
            File file = new File(path);
            // kiểm tra file nếu chưa tồn tại thực hiện tạo mới
            if (!file.exists()) {
                file.createNewFile();
            }
            // ghi danh sách ra file
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            // ghi từng đối tượng vào file
            oos.writeObject(danhSach);

            // đóng luồng
            oos.close();
            fos.close();
            return "Ghi file thành công";
        } catch (Exception e) {
            e.printStackTrace();
            return "Ghi file thất bại";
        }
    }
}
