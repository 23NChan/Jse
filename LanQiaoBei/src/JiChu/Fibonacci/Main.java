package JiChu.Fibonacci;
//Fibonacci数列20220316改

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 3) {
            System.out.println(1);
        }else {
            long a = 1, b = 1;
            for (int c = 3; c <= i; c++) {
                if (c % 2 == 0) {
                    a += b;
                } else {
                    b += a;
                }
                a %=10007;
                b %=10007;
            }
            a = i%2==0 ? a : b;
            System.out.println(a);
        }

    }
}
