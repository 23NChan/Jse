package JiChu.RunNianPanDuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
