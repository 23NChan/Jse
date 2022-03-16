package JiChu.ShiZhuanShiLiu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        sc.close();
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "0");
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");
        map.put(5, "5");
        map.put(6, "6");
        map.put(7, "7");
        map.put(8, "8");
        map.put(9, "9");
        map.put(10, "A");
        map.put(11, "B");
        map.put(12, "C");
        map.put(13, "D");
        map.put(14, "E");
        map.put(15, "F");
        StringBuilder result = new StringBuilder();
        while ((l % 16 != 0) || (l != 0)) {
            result.insert(0, (map.get((int) (l % 16))));
            l = l / 16;
        }
        if (result.length() < 1) {
            result.append("0");
        }
        System.out.print(result);
    }
}