package JiChu.ShuLixTeZheng;
//数列特征20220315

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            temp = sc.nextInt();
            sum += temp;
            max = temp > max ? temp : max;
            min = temp < min ? temp : min;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
