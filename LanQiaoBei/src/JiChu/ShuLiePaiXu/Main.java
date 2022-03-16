package JiChu.ShuLiePaiXu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int) ((R - L) * Math.random()), R);
            int[] p = partition(arr, L, R);
            quicksort(arr, L, p[0] - 1);
            quicksort(arr, p[1] + 1, R);
        }

    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
