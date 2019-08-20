package insert_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 20:09
 */
public class _02_InsertSorting {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -5 ,23, 1, 67,-1};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //第一次循环 {101, 34, 119, 1} --> {34,101, 119, 1}
            //定义待插入数
            int insertValue = arr[i];//要插入的数
            int insertIndex = i - 1;//即arr[1]的前面的这个数的下标

            //给insertValue找到插入的位置
            //1.insertIndex >= 0 保证在给insertValue找插入位置时不会越界
            //2.insertValue < arr[insertIndex] 说明还没有找到插入位置
            //3.就需要将arr[insertIndex]后移
            while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
                //arr[insertIndex]后移,{101, 34, 119, 1} --> {101, 101, 119, 1}
                //arr[1]已经存到insertValue中了
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;//让 34 跟 101 前面的数比较
            }
            //退出循环时，说明插入位置已经找到，位置为 insertIndex + 1
            arr[insertIndex + 1] = insertValue;//将34插入到已找到的插入位置
            System.out.println("第" + i + "次循环后：" + Arrays.toString(arr));
        }
    }
}
