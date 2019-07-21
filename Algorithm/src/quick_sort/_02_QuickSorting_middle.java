package quick_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 22:27
 */
public class _02_QuickSorting_middle {
    public static void main(String[] args) {
        int[] arr1 = {-9, 78, 0, 23, -567, 70};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left; //左下标
        int r = right; //右下标
        //middle 中轴值
        int middle = arr[(left + right) / 2];
        int temp = 0; //临时变量，作为交换时使用
        //while循环的目的是让比middle 值小放到左边
        //比middle 值大放到右边
        while (l < r) {
            //在middle的左边一直找,找到大于等于middle值,才退出
            while (arr[l] < middle) {
                l++;
            }
            //在middle的右边一直找,找到小于等于middle值,才退出
            while (arr[r] > middle) {
                r--;
            }
            //如果l >= r说明middle 的左右两的值，已经按照左边全部是
            //小于等于middle值，右边全部是大于等于middle值
            if (l >= r) {
                break;
            }
            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == middle值 相等 r--， 前移
            if (arr[l] == middle) {
                r--;
            }
            //如果交换完后，发现这个arr[r] == middle值 相等 l++， 后移
            if (arr[r] == middle) {
                l++;
            }
        }
        // 如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l++;
            r--;
        }
        //向左递归
        if (left < r) {
            quickSort(arr, left, r);
        }
        //向右递归
        if (right > l) {
            quickSort(arr, l, right);
        }
    }
}
