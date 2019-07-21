package kmp;

import java.util.Arrays;

/**
 * @Author: yaobin
 * @Date: 2019/7/21 10:14
 */
public class KMP {

    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        int[] next = getNext(str2);
        int res = KMP(str1, str2);
        System.out.println(Arrays.toString(next));
        System.out.println(res);
    }

    /**
     * KMP算法
     *
     * @param ss 主串
     * @param ps 模式串
     * @return 如果找到，返回在主串中第一个字符出现的下标，否则为-1
     */
    public static int KMP(String ss, String ps) {
        char[] s = ss.toCharArray();
        char[] p = ps.toCharArray();

        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        int[] next = getNext(ps);
        while (i < s.length && j < p.length) {
            //①如果j=-1，或者当前字符匹配成功（即S[i]==P[j]），都令i++，j++
            if (j == -1 || s[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
                i++;
                j++;
            } else {
                //②如果j!=-1，且当前字符匹配失败（即S[i]!=P[j]），则令i不变，j=next[j]，j右移i-next[j]
                j = next[j];
            }
        }
        return j == p.length ? i - j : -1;
    }

    //优化过后的next数组求法
    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            //p[k]表示前缀，p[j]表示后缀
            if (k == -1 || p[j] == p[k]) {
                //较之前next数组求法，改动在下面4行
                if (p[++j] == p[++k]) {
                    next[j] = next[k];// 当两个字符相等时要跳过
                } else {
                    next[j] = k;//之前只有这一行
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
