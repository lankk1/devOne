package com.wawa.common.utils;

import com.wawa.common.constant.Const;

import java.util.Random;

/**
 * Created by Walker on 2019/8/10.
 */
public class StringUtils {

    /**
     * check the string is blank
     * {@code source}如果是空字符串（不进行trim处理）或null，则返回true
     *
     * @param source 源字符
     * @return
     */
    public static boolean isBlankNoTrim(String source) {
        return source == null || "".equals(source);
    }

    /**
     * check the string is blank
     * {@code source}如果是空字符串（trim处理后）或null，则返回true
     *
     * @param source 源字符
     * @return
     */
    public static boolean isBlankWithTrim(String source) {
        return isBlankNoTrim(source) || "".equals(source.trim());
    }

    /**
     * 生成指定位数的随机字符串
     *
     * @param source 随机字符串的源字符
     * @param length 随机字符串的长度
     * @return
     */
    public static String generateRadomCharacters(String source, int length) {
        if (isBlankWithTrim(source)) {
            return "";
        }
        if (length <= 0) {
            return "";
        }
        source = source.trim();

        StringBuilder str = new StringBuilder();
        Random random = new Random();

        for (int i = 0, sLen = source.length(); i < length; i++) {
            str.append(source.charAt(random.nextInt(sLen)));
        }

        return str.toString();
    }

    /**
     * 统计字母,数字,空格和其他字符的个数
     *
     * @param source
     */
    public static void countNum(String source) {
        StringBuilder sbu = new StringBuilder("当前字符串[");

        if (source == null || "".equals(source)) {
            sbu.append(source).append("]信息统计如下：")
                    .append("\n=====================================")
                    .append("\n     字母         |        0         ")
                    .append("\n-------------------------------------")
                    .append("\n     数字         |        0         ")
                    .append("\n-------------------------------------")
                    .append("\n     空格         |        0         ")
                    .append("\n-------------------------------------")
                    .append("\n     其他字符     |        0         ")
                    .append("\n=====================================");
            System.out.println(sbu.toString());
            return;
        }

        // init
        String caStr = Const.CHARS_LOWCASE.concat(Const.CHARS_UPCASE);
        String numStr = Const.NUMBERS;
        String emptStr = " ";
        int sourceLen = source.length();
        int caCount = 0;
        int numCount = 0;
        int emptCount = 0;
        int otherCount = 0;
        String cc = null;

        // process
        for (int i = 0; i < sourceLen; i++) {
            cc = String.valueOf(source.charAt(i));
            if (caStr.contains(cc)) {
                caCount++;
                continue;
            } else if (numStr.contains(cc)) {
                numCount++;
                continue;
            } else if (emptStr.equals(cc)) {
                emptCount++;
                continue;
            }
            otherCount++;
        }

        sbu.append(source).append("]信息统计如下：")
                .append("\n=====================================")
                .append("\n     字母         |        ").append(caCount)
                .append("\n-------------------------------------")
                .append("\n     数字         |        ").append(numCount)
                .append("\n-------------------------------------")
                .append("\n     空格         |        ").append(emptCount)
                .append("\n-------------------------------------")
                .append("\n     其他字符     |        ").append(otherCount)
                .append("\n=====================================");

        // output
        System.out.println(sbu.toString());
    }
}
