package com.blueseaheart.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by Walker on 2018/5/28.
 */
public class CommonUtils {
    private static Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    public static void countNum(String source) {
        // 统计字母,数字,空格和其他字符的个数

        StringBuilder sbu = new StringBuilder("当前字符串[");

        if (source == null || "".equals(source)) {
            sbu.append("]信息统计如下：")
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
            logger.debug(sbu.toString());
            return;
        }

        // init
        String caStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numStr = "0123456789";
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
        logger.debug(sbu.toString());
    }

    public static String getRadomCharacters(int num) {
        // 获取随机几位数字，字母
        if (num <= 0) {
            logger.debug("num=" + num + ",return  .");
            return "";
        }
        // init
        String source = "0123456789";
        StringBuilder str = new StringBuilder();
        Random r = new Random();
        // process
        for (int i = 0; i < num; i++) {
            str.append(source.charAt(r.nextInt(source.length())));
        }
        logger.debug("num=" + num + ",return ".concat(str.toString()).concat("."));
        return str.toString();
    }
}
