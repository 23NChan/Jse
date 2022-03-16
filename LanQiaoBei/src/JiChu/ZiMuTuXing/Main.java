package JiChu.ZiMuTuXing;
//字母图形20220315
//字母图形20220316(改)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0;i<n;i++){
            char c =(char) (65+i);
            for (int j=0;(j<m)&&(j<i);j++){
                System.out.print(c);
                c--;
            }
            for (int j = i;j<m;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
