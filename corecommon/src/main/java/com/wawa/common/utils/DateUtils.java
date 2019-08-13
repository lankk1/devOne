package com.wawa.common.utils;

import com.wawa.common.constant.Const;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Walker on 2019/8/13.
 */
public class DateUtils {
    /**
     * 转为汉字日期
     *
     * @param date
     * @return
     */
    public static String format2Chinese(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_PATTERN_THREE);
        String temp = sdf.format(date);
        StringBuilder sbu = new StringBuilder(temp);
        sbu.insert(4, Const.YEAR_CHINESE)
                .insert(7, Const.MONTH_CHINESE)
                .insert(10, Const.DAY_CHINESE);
        return sbu.toString();
    }

    public static void main(String[] args) {
        System.out.println(format2Chinese(new Date()));
    }
}
