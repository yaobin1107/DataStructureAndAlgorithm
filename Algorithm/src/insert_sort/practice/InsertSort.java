package insert_sort.practice;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 22:16
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {17, 3, 25, 14, 20, 9};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {

        int insertVal = 0;//定义待插入的数
        int insertIndex = 0;//待插入的位置索引，arr[i+1]前面的这个索引
        for (int i = 0; i < arr.length - 1; i++) {
            insertVal = arr[i + 1];//定义待插入的数
            insertIndex = i;//待插入的位置索引，arr[1]前面的这个索引

            while (insertIndex >= 0 && insertVal <= arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
            System.out.println(Arrays.toString(arr));
        }
    }
}

