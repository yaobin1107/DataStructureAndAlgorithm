package select_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 12:41
 */
public class _01_SelectSortingBase {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        System.out.println("排序前：" + Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {

        int minIndex = 0;
        int min = 0;

        //第一次循环
        minIndex = 0;
        min = arr[0];
        for (int i = 0 + 1; i < arr.length; i++) {
            if (min > arr[i]) {//说明假定的最小值并不是最小的
                min = arr[i];
                minIndex = i;
            }
        }
        //将最小值和arr[0]位置的值进行交换
        if (minIndex != 0) {
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.println("第一次循环后：" + Arrays.toString(arr));

        //第二次循环
        minIndex = 1;
        min = arr[1];
        for (int i = 1 + 1; i < arr.length; i++) {
            if (min > arr[i]) {//说明假定的最小值并不是最小的
                min = arr[i];
                minIndex = i;
            }
        }
        //将最小值和arr[1]位置的值进行交换
        if (minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }
        System.out.println("第二次循环后：" + Arrays.toString(arr));

        //第三次循环
        minIndex = 2;
        min = arr[2];
        for (int i = 2 + 1; i < arr.length; i++) {
            if (min > arr[i]) {//说明假定的最小值并不是最小的
                min = arr[i];
                minIndex = i;
            }
        }
        //将最小值和arr[2]位置的值进行交换
        if (minIndex != 2) {
            arr[minIndex] = arr[2];
            arr[2] = min;
        }
        System.out.println("第三次循环后：" + Arrays.toString(arr));
    }
}
