package shell_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 11:12
 */
public class _04_ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr);
    }

    public static void shellSort(int[] arr) {
        int d = arr.length / 2;
        while (d >= 1) {
            for (int i = d; i < arr.length; i++) {
                int x = arr[i];
                int j = i - d;
                while (j >= 0 && arr[j] < x) {
                    arr[j + d] = arr[j];
                    j -= d;
                }
                arr[j + d] = x;
            }
            d /= 2;
            System.out.println(Arrays.toString(arr));
        }
    }
}
