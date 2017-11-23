package xuan.newCode;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Xuan on 2017/5/31.
 */
public class AboutDate {
    public static void main(String[] args) {

        //取1958年1月1日0时0分0秒世界时(UT)的瞬间作为同年同月同日0时0分0秒,UTC时间以秒记。
        //系统获取为毫秒记，因此除以1000
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000l);

        String str = "1496217448";
        System.out.println(Long.valueOf(str));  //String转Long
        System.out.println(Long.parseLong(str));//String转long

        //毫秒转日期
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date.toString());

        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

        Date date1 = new Date(0l);
        Date date2 = new Date(7200000l);
        System.out.println(sdf.format(date1));
        System.out.println(sdf.format(date2));
        System.out.println(sdf.format(new Date(1500220800000l)));

        int i=0;
        while(i<10);  //死循环
        {i=i+1;}

    }
}
