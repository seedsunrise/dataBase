package cn.com.flaginfo.utils;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.flaginfo.exception.ActivityRateException;
import cn.com.flaginfo.model.EvaluateRecordPO;

/**
 * 
 *<p>Title: </p>* 
 *<p>Description: 参与率、回复率、点赞率各比例对应分数：低于10% 0分；10%-20% 30分；21%-40% 50分；41%-60% 60分；70%-100% 100分；各比例计算四舍五入</p>*
 *<p>Company:flaginfo </p> 
 * @author liming
 * @date 2017年6月11日
 */
public class AcitivityRateCountUtils {
	
	private static Logger logger=LoggerFactory.getLogger(AcitivityRateCountUtils.class);
	
	
	/**计算参与率得出分数
	 * @throws Exception **/
	public static Integer countScore(Integer num,Long allNum) throws Exception{
		
		//如果分子大于分母，设置为100
		if(num>allNum){
			
			return 100;
		}
		
		if(allNum==0){
			//如果支部人数为0，直接返回0分
			return 0;
		}
		double rate=(double)num/(double)allNum;
		//四舍五入保留两位
		BigDecimal rateInt=new BigDecimal(rate).setScale(2, BigDecimal.ROUND_HALF_UP);
		//百分率*100
		Integer sorce=(int) (rateInt.doubleValue()*100);
		if(sorce<10){
			
			return 0;
		}
		if(sorce>=10&&sorce<=20){
			
			return 30;
		}
		if(sorce>=21&&sorce<=40){
			
			return 50;
		}
		if(sorce>=41&&sorce<=60){
			
			return 60;
		}
		if(sorce>=61&&sorce<=69){
			
			return 80;
		}
		if(sorce>=70&&sorce<=100){
			
			return 100;
		}
		if(sorce>100){
			
			throw new ActivityRateException("概率大于100,参与人数大于全部人数");
			
		}
		return null;
	}
	
	/**
	 * 
	 * desc:计算自动评定，规则（自动评定 = 活动参与率（70%） + 活动回复率（20%） + 活动点赞率（10%）
	 * @return
	 * @author:liming
	 * @date:2017年6月9日
	 */
	public static Integer countAutoRate(int commentRate,int praiseRate,int joinRate){
		
		logger.info("--回复分数[{}],点赞分数[{}],参与分数[{}]---------",commentRate,praiseRate,joinRate);
		
		BigDecimal sysRate= new BigDecimal(((joinRate*0.7)+(commentRate*0.2)+(praiseRate*0.1))).setScale(0, BigDecimal.ROUND_HALF_UP);
		
		return sysRate.intValue();
	}
	
	/**
	 * 
	 * desc:计算综合评分
	 * @param systemScore
	 * @param personScore
	 * @return
	 * @author:liming
	 * @date:2017年6月12日
	 */
	public static Integer countTotalScore(Integer systemScore,Integer personScore){
		
		if(systemScore==null){
			systemScore=0;
		}
		if(personScore==null){
			personScore=0;
		}
		
		logger.info("--系统分数[{}],手动点评分数[{}]---------",systemScore,personScore);
		
		BigDecimal sysRate= new BigDecimal((systemScore*0.7)+(personScore*0.3)).setScale(0, BigDecimal.ROUND_HALF_UP);
		
		return sysRate.intValue();
		
	}
	
	
	/**
	 * 
	 * desc:计算手动评分
	 * @param ffcdScore
	 * @param picScore
	 * @return
	 * @author:liming
	 * @date:2017年6月12日
	 */
	public static Integer countPersonScore(Integer ffcdScore,Integer picScore){
		
		if(ffcdScore==null){
			ffcdScore=0;
		}
		if(picScore==null){
			picScore=0;
		}
		
		logger.info("--丰富程度分数[{}],图片上传分数[{}]---------",ffcdScore,picScore);
		
		BigDecimal sysRate= new BigDecimal((ffcdScore*0.5)+(picScore*0.5)).setScale(0, BigDecimal.ROUND_HALF_UP);
		
		return sysRate.intValue();
		
	}
	
	public boolean validateData(EvaluateRecordPO eva){
		
		boolean flag=(eva.getFfcdScore()!=null&&eva.getPicScore()!=null&&eva.getTotalScore()!=null);
	
		return flag;
	}


}
