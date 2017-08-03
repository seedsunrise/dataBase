package cn.com.flaginfo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import org.apache.commons.lang.time.DateUtils;

public class TimeUtil {

	public static Date startOfDay(Long time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(time);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	public static Date endOfDay(Long time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(time);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	public static Date startOfDay(String time) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(time);
			return startOfDay(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Date();
	}

	public static Date endOfDay(String time) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(time);
			return endOfDay(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Date();
	}

	public static Date startOfYesterday(Date time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	public static Date endOfYesterday(Date time) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - 1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}
	
	public static Date StringToDate(String time,String format){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date date = sdf.parse(time);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}

	public static boolean isOverOnDay(Date start, Date end) {
		return end.getTime() - start.getTime() > 24 * 3600 * 1000;
	}

	public static String dateToFarmat(Date time, String format) {
		String result = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			result = sdf.format(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}


	

	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		start.set(Calendar.HOUR_OF_DAY, 13);


		System.out.println(TimeUtil.dateToFarmat(start.getTime(), "H:mm"));
	}
	
	public static String formatDate(Date date,String format){
		return new SimpleDateFormat(format).format(date);
	}
	
	//判断选择的日期是否是本周  
	public static boolean isThisWeek(Date time)  
    {  
        Calendar calendar = Calendar.getInstance();  
        int currentWeek = calendar.get(Calendar.WEEK_OF_YEAR);  
        calendar.setTime(time);  
        int paramWeek = calendar.get(Calendar.WEEK_OF_YEAR);  
        if(paramWeek==currentWeek){  
           return true;  
        }  
        return false;  
    }  
    
  //判断选择的日期是否是本月  
    public static boolean isThisMonth(Date time)  
    {  
         return isThisTime(time,"yyyy-MM");  
    }  
    public static boolean isThisTime(Date time,String pattern) {  
         SimpleDateFormat sdf = new SimpleDateFormat(pattern);  
         String param = sdf.format(time);//参数时间  
         String now = sdf.format(new Date());//当前时间  
         if(param.equals(now)){  
           return true;  
         }  
         return false;  
    }  
}
