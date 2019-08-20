package bubble_sort;

import java.util.Date;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 11:57
 */
public class _04_BigOTest {
    public static void main(String[] args) {
        //随机给80000个数据
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 80000000);
        }

        long timeBegin = new Date().getTime();
        bubbleSorting(arr);
        long timeEnd = new Date().getTime();

        System.out.println("耗时：" + (timeEnd - timeBegin) / 1000 + "秒");
    }

    /**
     * @param arr 要排序的数组
     * @return 返回数组的字符串表现形式
     */
    public static int[] bubbleSorting(int[] arr) {
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
            if (!flag) {//在一趟排序中，一次交换都没有发生过
                break;
            } else {
                flag = false;//重置flag，进行下次判断
            }
        }
        return arr;
    }
}
