package com.wawa.common.utils;

import com.wawa.common.constant.DateConst;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Walker on 2019/8/13.
 */
public class DateUtils {
    private static final ThreadLocal<Map<String, SimpleDateFormat>> PARSERS = new ThreadLocal() {
        @Override
        protected Map<String, SimpleDateFormat> initialValue() {

            return new HashMap<String, SimpleDateFormat>();
        }
    };

    private static SimpleDateFormat getDateFormat(String pattern) {
        Map<String, SimpleDateFormat> dateFormatMap = PARSERS.get();
        SimpleDateFormat sdf = dateFormatMap.get(pattern);
        if (sdf == null) {
            // 创建新的，并放入map中
            sdf = new SimpleDateFormat(pattern);
            dateFormatMap.put(pattern, sdf);
        }

        return sdf;
    }

    /**
     * 转为汉字日期
     *
     * @param date
     * @return
     */
    public static String format2Chinese(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        StringBuilder sbu = new StringBuilder();
        sbu.append(calendar.get(Calendar.YEAR)).append(DateConst.YEAR_CHINESE)
                .append(calendar.get(Calendar.MONTH) + 1).append(DateConst.MONTH_CHINESE)
                .append(calendar.get(Calendar.DATE)).append(DateConst.DAY_CHINESE)
                .append(calendar.get(Calendar.HOUR)).append(DateConst.HOUR_CHINESE)
                .append(calendar.get(Calendar.MINUTE)).append(DateConst.MINUTE_CHINESE)
                .append(calendar.get(Calendar.SECOND)).append(DateConst.SECOND_CHINESE);

        return sbu.toString();
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sss", BigDecimal.TEN);

        Object sss = map.get("sss");
        BigDecimal ttt = new BigDecimal(String.valueOf(sss));

        System.out.println(ttt);
    }
}
