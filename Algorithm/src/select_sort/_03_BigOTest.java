package select_sort;

import java.util.Date;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 16:33
 */
public class _03_BigOTest {
    public static void main(String[] args) {
        //随机给80000个数据
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 80000000);
        }

        long timeBegin = new Date().getTime();
        selectSort(arr);
        long timeEnd = new Date().getTime();

        System.out.println("耗时：" + (timeEnd - timeBegin) / 1000 + "秒");
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {//说明假定的最小值并不是最小的
                    min = arr[j];//重置最小值
                    minIndex = j;//重置最小值所在索引
                }
            }
            if (minIndex != i) {//如果当前索引不是最小值索引才交换
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
