package bubble_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 11:40
 */
public class _01_BubbleSortingBase {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        sort(arr);
        System.out.println("结果：" + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        //第一趟排序，把最大的数排在最后
        int temp = 0;//临时变量，做交换用
        for (int i = 0; i < arr.length - 1; i++) {
            //如果前面的数大于后面的数，则交换
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第一趟排序：" + Arrays.toString(arr));

        //第二趟排序，把第二大的数排在倒数第二位
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            //如果前面的数大于后面的数，则交换
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第二趟排序：" + Arrays.toString(arr));

        //第三趟排序，把第三大的数排在倒数第三位
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            //如果前面的数大于后面的数，则交换
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第四趟排序：" + Arrays.toString(arr));

        //第四趟排序，把第四大的数排在倒数第四位
        for (int i = 0; i < arr.length - 1 - 3; i++) {
            //如果前面的数大于后面的数，则交换
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("第四趟排序：" + Arrays.toString(arr));
    }
}
