/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import Day5.LapTop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionDemo {

    public static void main(String[] args) {
        // HashSet: Loại bỏ các phần tử trùng lặp
        Set<String> hashSet = new HashSet<String>();
        // add(): Thêm phần tử
        hashSet.add("PHP");
        hashSet.add("PyThon");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C");
        System.out.println("Các phần tử của hashSet:");
        System.out.print("\t" + hashSet + "\n");
        for (String monHoc : hashSet) {
            System.out.println(monHoc);
        }
        // TreeSet: sắp xếp các phần tử trong set
        Set<Integer> setSN = new HashSet<Integer>();
        setSN.add(1);
        setSN.add(5);
        setSN.add(4);
        setSN.add(2);
        setSN.add(3);
        setSN.add(2);

        System.out.println("Các phần tử của tree set:");
        System.out.print("\t" + setSN + "\n");

        List<LapTop> list = new ArrayList<>();
        LapTop lap = new LapTop("M2", "Mac", 2022, 1, 29292, false);
        list.add(new LapTop("M2", "Mac", 2022, 1, 29292, false));
        list.add(new LapTop("M1", "Mac", 2022, 1, 3300, false));
        list.add(new LapTop("M5", "Mac", 2022, 1, 3000, false));
        list.add(new LapTop("M4", "Mac", 2022, 1, 330000, false));
        list.add(new LapTop("M4", "Mac", 2022, 1, 310000, false));
        list.add(new LapTop("M4", "Mac", 2022, 1, 320000, false));
        for (LapTop lt : list) {
            System.out.println(lt.hashCode());
        }
        Set<LapTop> setLt = new HashSet<LapTop>();
        setLt.addAll(list);
        for (LapTop lt : setLt) {
            System.out.println(lt.getTen());
        }

        Set<LapTop> treeLapTop = new TreeSet<LapTop>();
        treeLapTop.addAll(list);
        System.out.println("Sắp xếp theo giá");
        for (LapTop lt : treeLapTop) {
            System.out.println(lt.getTen());
        }
        // MAP ưu theo cặp key và value
        // put(): thêm giá trị vào map
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("MOB1023", "Java 2");
        hashMap.put("MOB1014", "Java 1");
        hashMap.put("COM108", "Nhập môn lập trình");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap + "\n");
        // get(): lấy ra value = key
        System.out.println("Môn MOB1023:" + hashMap.get("MOB1023"));
        // keySet(): lấy ra tất cả các key
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            // hiển thị tất cả value dựa vào key
            System.out.println(hashMap.get(key));
        }

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập số nguyên:");
            int so = sc.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println("Sai định dạng");
        } catch (Exception e) {
            System.out.println("Nhập không đúng định dạng");
        } finally {
            System.out.println("Hết giờ");
        }

    }
}
