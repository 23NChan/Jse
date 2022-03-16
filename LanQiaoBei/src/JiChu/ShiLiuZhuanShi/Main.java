package JiChu.ShiLiuZhuanShi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Character,Integer> shiliu = new HashMap<>();
        shiliu.put('0', 0);
        shiliu.put('1', 1);
        shiliu.put('2', 2);
        shiliu.put('3', 3);
        shiliu.put('4', 4);
        shiliu.put('5', 5);
        shiliu.put('6', 6);
        shiliu.put('7', 7);
        shiliu.put('8', 8);
        shiliu.put('9', 9);
        shiliu.put('A', 10);
        shiliu.put('B', 11);
        shiliu.put('C', 12);
        shiliu.put('D', 13);
        shiliu.put('E', 14);
        shiliu.put('F', 15);
        Scanner sc = new Scanner(System.in);
        String s16=sc.next();
        char[] c16 = s16.toCharArray();
        long num = 0;
        int l16 = s16.length()-1;
        for(int i=l16;i>=0;i--){
            num = num + (((Integer) shiliu.get(c16[i]))*((long) Math.pow(16,l16-i)));
        }
        System.out.print(num);
    }
}