package bubble_sort.practice;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 21:18
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 28, -1, 5};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i + 1] < arr[i]) {
                    flag = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (!flag) {
                flag = false;
                break;
            }
            System.out.println("第" + (j + 1) + "次循环后" + Arrays.toString(arr));
        }
    }
}
