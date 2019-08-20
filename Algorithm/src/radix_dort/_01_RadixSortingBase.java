package radix_dort;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/22 11:24
 */
public class _01_RadixSortingBase {
    public static void main(String[] args) {
        int[] arr = {53, 3, 542, 748, 14, 214};
        radixSort(arr);
    }

    public static void radixSort(int[] arr) {
        //定义一个二维数组，表示十个桶，每个桶是一个一维数组
        //说明：
        //1.二维数组包含10个一维数组
        //2.为了防止在放入数的时候数据溢出，则每个一维数组（桶）的大小应定为arr.length
        //3.空间换时间
        int[][] bucket = new int[10][arr.length];
        //为了记录每个桶实际存放了多少个数据，定义一个一维数组来记录每个桶放入的数据数
        //bucketElementCounts[0] 记录 bucket[0] 的数据数
        int[] bucketElementCounts = new int[10];


        //===============第一轮：针对每个元素的个位进行排序处理====================//
        for (int i = 0; i < arr.length; i++) {
            //每个元素的个位的值
            int digitOfElement = arr[i] % 10;
            //放入到对应的桶
            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
            bucketElementCounts[digitOfElement]++;
        }
        //按照桶顺序取出数据，放入原来的数组
        int index = 0;
        //遍历每一个桶并将桶中的数据放入到原数组
        for (int i = 0; i < bucket.length; i++) {
            //如果桶中有数据才放入原数组
            if (bucketElementCounts[i] != 0) {
                //循环该桶
                for (int j = 0; j < bucketElementCounts[i]; j++) {
                    //取出元素放入原数组
                    arr[index] = bucket[i][j];
                    index++;
                }
            }
            //每轮处理后要将bucketElementCounts[i]置零！！！
            bucketElementCounts[i] = 0;
        }
        System.out.println(("第1次放入后取出：" + Arrays.toString(arr)));


        //===============第2轮：针对每个元素的十位进行排序处理====================//
        for (int i = 0; i < arr.length; i++) {
            //每个元素的十位的值
            int digitOfElement = arr[i] / 10 % 10;
            //放入到对应的桶
            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
            bucketElementCounts[digitOfElement]++;
        }
        //按照桶顺序取出数据，放入原来的数组
        index = 0;
        //遍历每一个桶并将桶中的数据放入到原数组
        for (int i = 0; i < bucket.length; i++) {
            //如果桶中有数据才放入原数组
            if (bucketElementCounts[i] != 0) {
                //循环该桶
                for (int j = 0; j < bucketElementCounts[i]; j++) {
                    //取出元素放入原数组
                    arr[index] = bucket[i][j];
                    index++;
                }
            }
            //每轮处理后要将bucketElementCounts[i]置零！！！
            bucketElementCounts[i] = 0;
        }
        System.out.println(("第2次放入后取出：" + Arrays.toString(arr)));


        //===============第2轮：针对每个元素的百位进行排序处理====================//
        for (int i = 0; i < arr.length; i++) {
            //每个元素的百位的值
            int digitOfElement = arr[i] / 10 / 10 % 10;
            //放入到对应的桶
            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[i];
            bucketElementCounts[digitOfElement]++;
        }
        //按照桶顺序取出数据，放入原来的数组
        index = 0;
        //遍历每一个桶并将桶中的数据放入到原数组
        for (int i = 0; i < bucket.length; i++) {
            //如果桶中有数据才放入原数组
            if (bucketElementCounts[i] != 0) {
                //循环该桶
                for (int j = 0; j < bucketElementCounts[i]; j++) {
                    //取出元素放入原数组
                    arr[index] = bucket[i][j];
                    index++;
                }
            }
            //每轮处理后要将bucketElementCounts[i]置零！！！
            bucketElementCounts[i] = 0;
        }
        System.out.println(("第3次放入后取出：" + Arrays.toString(arr)));
    }
}
