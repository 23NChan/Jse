package JiChu.XuLieQiuHe;
//数列求和20220316

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i = sc.nextInt();
        long result = i + i*(i-1)/2;
        System.out.println(result);
    }
}
