package JiChu.TeShuHuiWenShu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Long> al = new ArrayList<Long>();
        for (long i=10001; i<=99999;i++){
            char[] c = String.valueOf(i).toCharArray();;
            if ((c[0]==c[4])&&(c[1]==c[3])&&((c[0]+c[1]+c[2]+c[3]+c[4]-240)==num)){
                System.out.println(i);
            }
        }
        for (long i=100001; i<999999;i++){
            char[] c = String.valueOf(i).toCharArray();;
            if ((c[0]==c[5])&&(c[1]==c[4])&&((c[0]+c[1]+c[2]+c[3]+c[4]+c[5]-288)==num)&&(c[2]==c[3])){
                System.out.println(i);
            }
        }
    }
}
