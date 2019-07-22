package select_sort.practice;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 21:40
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {
        int minIndex = 0;
        int min = arr[0];

        for (int j = 0; j < arr.length - 1; j++) {
            minIndex = j;
            min = arr[j];
            for (int i = 1 + j; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                arr[minIndex] = arr[j];
                arr[j] = min;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

