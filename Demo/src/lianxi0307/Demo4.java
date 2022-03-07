package lianxi0307;


import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长方形的长");
        float a = sc.nextFloat();
        System.out.print("请输入长方形的宽");
        float b = sc.nextFloat();
        System.out.println("长方形的面积是："+(a*b));
    }
}
