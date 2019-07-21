package bubble_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 11:43
 */
public class _03_BubbleSortingAdvanced {
    public static void main(String[] args) {
        //int[] arr = {3, 9, -1, 10, 20};
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("排序前：" + Arrays.toString(arr));
        System.out.println("排序后：" + bubbleSorting(arr));
    }

    /**
     * @param arr 要排序的数组
     * @return 返回数组的字符串表现形式
     */
    public static String bubbleSorting(int[] arr) {
        int temp = 0;//临时变量
        boolean flag = false;//表示变量，表示是否进行过交换
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + i + "次排序后：" + Arrays.toString(arr));
            if (!flag) {//在一趟排序中，一次交换都没有发生过
                break;
            } else {
                flag = false;//重置flag，进行下次判断
            }
        }
        return Arrays.toString(arr);
    }
}
