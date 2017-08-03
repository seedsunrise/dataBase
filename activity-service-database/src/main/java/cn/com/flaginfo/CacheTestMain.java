package cn.com.flaginfo;

import cn.com.flaginfo.contacts.ContactQuery;
import cn.com.flaginfo.contacts.ContactQueryFactory;
import cn.com.flaginfo.contacts.observer.ContactObserver;

public class CacheTestMain {

	/*public static void main(String[] args)
			throws Exception {
		ContactObserver  contactDatasManager = new ContactObserverImpl();
		contactDatasManager.init();
		ContactQuery contactQuery = ContactQueryFactory.getContactQuery();
		for(int i=0;i<20;i++){
			long time = System.currentTimeMillis();
			contactQuery.getChildrenGroup("17041716033411481603");
			System.out.println("第"+i+"次：耗时："+(System.currentTimeMillis()-time));
		}
		System.out.println(contactQuery.getName("17041716033411481603"));
	}*/

}
