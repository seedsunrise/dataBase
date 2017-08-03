package cn.com.flaginfo.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * *<p>Title:批量限制导入辅助类 </p>* 
	<p>Description: </p>* 
     @author liming
     @date 2016年8月29日
 */
public class BatchUtil<T> {

	
	/**
	 * 
	 * desc:
	 * @param list 要导入的数据
	 * @param size 限制一次导入的长度
	 * @param ck  回调函数
	 * @author:liming 
	 * @date:2016年8月29日
	 */
	public void  limitBatch(List<T> list,Integer size,final CallBackMethod<T> ck){
		
		List<T> newList =new ArrayList<T>(size);
		for(int i=0;i<list.size();i++){
			newList.add(list.get(i));
			if(newList.size()==size){
				ck.doCallBack(newList);
				newList.clear();
			}
		}
		if(newList.size()!=0){
			ck.doCallBack(newList);
		}
		
		
	}
	
	public static interface CallBackMethod<T>{
		
		void doCallBack(List<T> list);
		 
	}

	
}
