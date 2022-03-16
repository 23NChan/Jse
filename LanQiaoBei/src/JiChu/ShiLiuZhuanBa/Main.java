package JiChu.ShiLiuZhuanBa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<String,String> shiliu = new HashMap<>();
        shiliu.put("0","0000");
        shiliu.put("1","0001");
        shiliu.put("2","0010");
        shiliu.put("3","0011");
        shiliu.put("4","0100");
        shiliu.put("5","0101");
        shiliu.put("6","0110");
        shiliu.put("7","0111");
        shiliu.put("8","1000");
        shiliu.put("9","1001");
        shiliu.put("A","1010");
        shiliu.put("B","1011");
        shiliu.put("C","1100");
        shiliu.put("D","1101");
        shiliu.put("E","1110");
        shiliu.put("F","1111");
        Map<String,String> ba = new HashMap<>();
        ba.put("000","0");
        ba.put("001","1");
        ba.put("010","2");
        ba.put("011","3");
        ba.put("100","4");
        ba.put("101","5");
        ba.put("110","6");
        ba.put("111","7");
        for (int i =0 ;i<num;i++){
            zhuanhuan(sc.next(),shiliu,ba);
        }

    }
    private static void zhuanhuan(String s,Map<String,String> shiliu,Map<String,String> ba){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c :charArray){
            sb.append(shiliu.get(c+""));
        }
        while (sb.length()%3!=0){
            sb.insert(0,"0");
        }
        for (int i=0;i<sb.length();i+=3){
            sb2.append(ba.get(sb.substring(i,i+3)));
        }

        int i=0;
        while (true){
            if (sb2.charAt(i)=='0'){
                i++;
            }else {
                break;
            }
        }

        System.out.println(sb2.substring(i));
    }
}
