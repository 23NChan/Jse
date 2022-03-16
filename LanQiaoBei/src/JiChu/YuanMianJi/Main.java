package JiChu.YuanMianJi;
//计算园面积保留七位小数20220315
//计算园面积保留七位小数20220316改

import java.util.Scanner;
import static java.lang.Math.atan;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double mianji =r * r * atan(1.0)*4;
        System.out.printf("%.7f",mianji);
    }
}
