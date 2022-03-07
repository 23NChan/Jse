package lianxi0307;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.print("请输入半径:");
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        System.out.println("圆的面积是："+(r*r*3.14));
    }
}
