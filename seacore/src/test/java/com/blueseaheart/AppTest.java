package com.blueseaheart;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        countNum(null);
    }

    private void countNum(String source) {
        // 统计字母,数字,空格和其他字符的个数
        if (StringUtils.isEmpty(source)) {
            System.out.println("字符串中字母个数:0,数字个数:0,空格个数:0,其他字符个数:0");
            return;
        }

        // init
        String caStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numStr = "0123456789";
        String emptStr = " ";
        int caCount = 0;
        int numCount = 0;
        int emptCount = 0;
        int otherCount = 0;
        String cc = null;

        // process
        for (int i = 0; i < source.length(); i++) {
            cc = source.charAt(i) + "";
            if (caStr.indexOf(cc) > -1) {
                caCount++;
                continue;
            } else if (numStr.indexOf(cc) > -1) {
                numCount++;
                continue;
            } else if (emptStr.equals(cc)) {
                emptCount++;
                continue;
            }
            otherCount++;
        }

        // output
        System.out.println("字符串中字母个数:" + caCount
                + ",数字个数:" + numCount + ",空格个数:" + emptCount
                + ",其他字符个数:" + otherCount);
    }
}
