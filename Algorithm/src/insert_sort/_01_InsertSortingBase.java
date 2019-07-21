package insert_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 18:55
 */
public class _01_InsertSortingBase {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        insertSort(arr);
    }

    //插入排序
    public static void insertSort(int[] arr) {
        //第一次循环 {101, 34, 119, 1} --> {34,101, 119, 1}
        //定义待插入数
        int insertValue = arr[1];//要插入的数
        int insertIndex = 1 - 1;//即arr[1]的前面的这个数的下标

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
        System.out.println("第一次循环后：" + Arrays.toString(arr));

        //第二次循环 {34, 101, 119, 1} --> {34, 101, 119, 1}
        //定义待插入数
        insertValue = arr[2];//要插入的数
        insertIndex = 2 - 1;//即arr[2]的前面的这个数的下标

        //给insertValue找到插入的位置
        //1.insertIndex >= 0 保证在给insertValue找插入位置时不会越界
        //2.insertValue < arr[insertIndex] 说明还没有找到插入位置
        //3.就需要将arr[insertIndex]后移
        while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertValue;
        System.out.println("第二次循环后：" + Arrays.toString(arr));

        //第三次循环 {34, 101, 119, 1} --> {1, 34, 101, 119}
        //定义待插入数
        insertValue = arr[3];//要插入的数
        insertIndex = 3 - 1;//即arr[3]的前面的这个数的下标

        //给insertValue找到插入的位置
        //1.insertIndex >= 0 保证在给insertValue找插入位置时不会越界
        //2.insertValue < arr[insertIndex] 说明还没有找到插入位置
        //3.就需要将arr[insertIndex]后移
        while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
            arr[insertIndex + 1] = arr[insertIndex];
            //1.{34, 101, 119, 1} --> {34, 101, 119, 119}
            //2.{34, 101, 119, 1} --> {34, 101, 101, 119}
            //3.{34, 101, 119, 1} --> {34, 134, 101, 119}
            //4.{34, 101, 119, 1} --> {1, 134, 101, 119}
            insertIndex--;
        }
        arr[insertIndex + 1] = insertValue;
        System.out.println("第三次循环后：" + Arrays.toString(arr));
    }
}
