package shell_sort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 11:11
 */
public class _03_ShellSortint_move {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort_Move(arr);
    }

    public static void shellSort_Move(int[] arr) {
        int temp = 0;
        int count = 0;
        //增量x，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素开始，逐个对其所在组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];//移动
                        j -= gap;
                    }
                    //退出while后表示找到了temp的插入位置
                    arr[j] = temp;
                }
            }
            System.out.println("第" + (++count) + "次循环后：" + Arrays.toString(arr));
        }
    }
}
