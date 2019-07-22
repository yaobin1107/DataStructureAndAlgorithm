package merge_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 23:21
 */
public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        int temp[] = new int[arr.length];//归并排序需要额外的空间
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;//中间索引
            //向左递归进行分解
            mergeSort(arr, left, mid, temp);
            //向右递归进行分解
            mergeSort(arr, mid + 1, right, temp);
            //合并
            merge(arr, left, mid, right, temp);
        }
    }

    /**
     * 合并的方法
     *
     * @param arr   待排序的原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边有序序列的初始索引
     * @param temp  中转数组
     */
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int l = left;//初始化l，左边有序序列的初始索引
        int r = mid + 1;//初始化r，右边边有序序列的初始索引
        int t = 0;//指向temp数组当前索引

        //1.先把左右两边的数据按规则填充到temp数组
        //直到左右两边的有序序列，有一边处理完毕位置
        while (l <= mid && r <= right) {
            //如果左边的有序序列的当前元素小于右边有序序列的当前元素
            //就将小的值存入temp当前索引
            if (arr[l] < arr[r]) {
                temp[t] = arr[l];
                //temp的当前索引++，即下一次往后存
                t++;
                //往右移继续判断
                l++;
            } else {//左边大
                temp[t] = arr[r];
                t++;//temp的当前索引++，即下一次往后存
                r++;//往右移继续判断
            }
        }
        //2.把有剩余的元素，依次填充到temp
        while (l <= mid) {//左边有剩余
            temp[t] = arr[l];//填充到temp
            t++;
            l++;
        }
        while (r <= right) {//右边有剩余
            temp[t] = arr[r];//填充到temp
            t++;
            r++;
        }
        //3.将temp数组的元素拷贝到arr
        //并不是每次都全部拷贝
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
