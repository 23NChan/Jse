package JiChu.YangHuiSanJiao;
//杨辉三角20220315

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hang = sc.nextInt();
        sc.close();
        int[][] arr  = new int[hang][hang];
        for (int i = 0; i < hang; i++){
            for (int j = 0 ;j<=i;j++){
                if (j==0 ||j==i){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
