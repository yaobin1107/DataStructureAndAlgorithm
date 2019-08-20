package shell_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 10:01
 */
public class _02_ShellSorting_swap {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort_Swap(arr);
    }

    public static void shellSort_Swap(int[] arr) {
        int temp = 0;
        int count = 0;
        for (int x = arr.length / 2; x > 0; x /= 2) {
            for (int i = x; i < arr.length; i++) {
                for (int j = i - x; j >= 0; j -= x) {
                    if (arr[j] > arr[j + x]) {
                        temp = arr[j];
                        arr[j] = arr[j + x];
                        arr[j + x] = temp;
                    }
                }
            }
            System.out.println("第" + (++count) + "次循环后：" + Arrays.toString(arr));
        }
    }
}
