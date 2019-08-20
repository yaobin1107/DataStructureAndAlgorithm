package array;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 1:20
 * KMP算法
 */
public class KMPAlgorithm {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABCD";
        int[] next = kmpNext(str2);
        int res = kmpSerrch(str1, str2, next);
        System.out.println(Arrays.toString(next));
        System.out.println(res);
    }

    //获取一个字符串（字串）的部分匹配值
    public static int[] kmpNext(String target) {
        //创建一个数组保存部分匹配值
        int[] next = new int[target.length()];
        next[0] = 0;//字符串长度为 1，部分匹配值必为0
        for (int i = 1, j = 0; i < target.length(); i++) {
            //target.charAt(i) != target.charAt(j)时，我们需要从next[j-1]获取新的j
            //直到发现target.charAt(i) == target.charAt(j)时退出
            while (j > 0 && target.charAt(j) != target.charAt(i)) {
                j = next[j - 1];
            }
            //当target.charAt(i) == target.charAt(j)这个条件满足时，部分匹配值+1 例：AAAAA
            if (target.charAt(i) == target.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    /**
     * @param str  源字符串
     * @param dest 字串
     * @param next 部分匹配表
     * @return 存在返回第一次出现索引，不存在返回-1
     */
    public static int kmpSerrch(String str, String dest, int[] next) {
        for (int i = 0, j = 0; i < str.length(); i++) {
            while (j > 0 && str.charAt(i) != dest.charAt(j)) {
                j = next[j - 1];
            }
            //i是源串下标索引，j是字串下标索引，循环源串每个字符根字串第一个i字符作比较
            //当相等时，字串下标索引+1，继续比较
            if (str.charAt(i) == dest.charAt(j)) {
                j++;
            }
            //当j增长到字串长度，则说明找到了
            if (j == dest.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }
}
