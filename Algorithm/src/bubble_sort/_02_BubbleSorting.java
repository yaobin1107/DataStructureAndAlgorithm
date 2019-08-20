package bubble_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 11:07
 */
public class _02_BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        System.out.println("结果：" + bubbleSorting(arr));
    }

    /**
     * @param arr 要排序的数组
     * @return 返回数组的字符串表现形式
     */
    public static String bubbleSorting(int[] arr) {
        int temp = 0;//临时变量
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + i + "次排序后：" + Arrays.toString(arr));
        }
        return Arrays.toString(arr);
    }
}
