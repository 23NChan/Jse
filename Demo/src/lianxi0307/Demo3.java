package lianxi0307;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.print("请输入正方形的边长：");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println("正方形的面积是："+(d*d));

    }
}
