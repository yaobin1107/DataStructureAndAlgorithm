package shell_sort.practice;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 22:41
 */
public class ShellSort_move {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr);
    }

    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int step = arr.length / 2; step >= 1; step /= 2) {
            for (int i = step; i < arr.length; i++) {
                int insertIndex = i;
                int insertVal = arr[insertIndex];
                if (arr[insertIndex] < arr[insertIndex - step]) {
                    while (insertIndex - step >= 0 && insertVal < arr[insertIndex - step]) {
                        arr[insertIndex] = arr[insertIndex - step];
                        insertIndex -= step;
                    }
                    arr[insertIndex] = insertVal;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

