package cn.com.flaginfo.contacts.observer;

import java.util.Observable;
import java.util.Observer;

import cn.com.flaginfo.contacts.cache.CacheFactory;
import cn.com.flaginfo.contacts.observer.event.CacheRefreshEvent;

public class CacheObserver implements Observer{


	@Override
	public void update(Observable o, Object event) {
		if(event instanceof CacheRefreshEvent){
			//清空所有的缓存
			CacheFactory.getGroupCache().invalidateAll();
			CacheFactory.getIdCache().invalidateAll();
			CacheFactory.getAllMemberCache().invalidateAll();
			CacheFactory.getCurMemberCache().invalidateAll();
		}
	}

}
