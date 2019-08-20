package select_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 12:41
 */
public class _02_SelectSorting {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        selectSort(arr);
        System.out.println("结果：" + Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {//说明假定的最小值并不是最小的
                    min = arr[j];//重置最小值
                    minIndex = j;//重置最小值所在索引
                }
            }
            if (minIndex != i) {//如果当前索引不是最小值索引才交换
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            System.out.println("第" + (i + 1) + "次循环后：" + Arrays.toString(arr));
        }
    }
}
