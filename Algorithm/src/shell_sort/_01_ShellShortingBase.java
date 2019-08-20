package shell_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 9:45
 */
public class _01_ShellShortingBase {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr);
    }

    public static void shellSort(int[] arr) {
        int temp = 0;
        //逐步推导
        //第1轮排序：将十个数据分成5组
        for (int i = 5; i < arr.length; i++) {
            //遍历各组中所有的元素（共有五组，每组两个元素），步长为5
            for (int j = i - 5; j >= 0; j -= 5) {
                //如果当前元素大于加上步长后的那个元素，说明要交换
                if (arr[j] > arr[j + 5]) {
                    temp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = temp;
                }
            }
        }
        System.out.println("第1次循环后：" + Arrays.toString(arr));

        //第2轮排序：将十个数据分成5/2=2组
        for (int i = 2; i < arr.length; i++) {
            //遍历各组中所有的元素（共有2组，每组5个元素），步长为2
            for (int j = i - 2; j >= 0; j -= 2) {
                //如果当前元素大于加上步长后的那个元素，说明要交换
                if (arr[j] > arr[j + 2]) {
                    temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println("第2次循环后：" + Arrays.toString(arr));

        //第3轮排序：将十个数据分成2/2=1组
        for (int i = 1; i < arr.length; i++) {
            //遍历各组中所有的元素（共有1组，每组10个元素），步长为1
            for (int j = i - 1; j >= 0; j -= 1) {
                //如果当前元素大于加上步长后的那个元素，说明要交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("第3次循环后：" + Arrays.toString(arr));
    }
}
