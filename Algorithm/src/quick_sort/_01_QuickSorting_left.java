package quick_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 21:21
 */
public class _01_QuickSorting_left {
    public static void main(String[] args) {
        int[] arr1 = {-9, 78, 0, 23, -567, 70};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void quickSort(int[] arr, int low, int high) {
        int l, r, base, temp;
        if (low > high) {
            return;
        }
        l = low;//arr[0]
        r = high;//arr[arr.length-1]
        //base就是基准位
        base = arr[low];

        while (l < r) {
            //先看右边，依次往左递减
            while (base <= arr[r] && l < r) {
                r--;
            }
            //再看左边，依次往右递增
            while (base >= arr[l] && l < r) {
                l++;
            }
            //如果满足条件则交换
            if (l < r) {
                temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }

        }
        //最后将基准值与i和j相等位置的数字交换
        arr[low] = arr[l];
        arr[l] = base;
        //递归调用左半数组
        quickSort(arr, low, r - 1);
        //递归调用右半数组
        quickSort(arr, l + 1, high);
        System.out.println(Arrays.toString(arr));
    }
}
