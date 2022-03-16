package JiChu.ChaZhaoint;
//查找整数20220315

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = -1;
        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int a = 0; a < i; a++) {
            arr[a] = sc.nextInt();
        }
        int b = sc.nextInt();
        for (int a = 0; a < i; a++) {
            if (arr[a] == b) {
                c =a+1;
                break;
            }
        }
        System.out.println(c);
    }
}
