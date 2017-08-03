package cn.com.flaginfo.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.UUID;

import cn.com.flaginfo.model.ErrPO;
import cn.com.flaginfo.service.ErrService;

public class ExcepitonUtils {
	
	/**
	 * 
	 * desc:把错误信息的堆栈信息输出到String
	 * @param ex
	 * @return
	 * @author:liming
	 * @date:2017年6月9日
	 */
	public static String getExceptionStackTrace(Exception ex){
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try
		{
		ex.printStackTrace(pw);
		return sw.toString();
		}
		finally
		{
		pw.close();
		}
	}
	
	
	public static void saveErrMessage(Exception e,String businesskey,String type) {
		ErrService errService=(ErrService) SpringApplicationContextHolder.getSpringBean("errService");
		ErrPO errPo=new ErrPO();
		errPo.setMessage(e.getMessage());
		errPo.setId(UUID.randomUUID().toString().replace("-", ""));
		errPo.setType(type);
		errPo.setBusinessKey(businesskey);
		errPo.setCreateTime(new Date());
		errPo.setExceptionInfo(ExcepitonUtils.getExceptionStackTrace(e));
		errService.saveErr(errPo);
	}

}
