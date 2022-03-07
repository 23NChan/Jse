package lianxi0307;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Math.round(Math.abs(x+10)*Math.pow(5.5,5)));
    }
}
