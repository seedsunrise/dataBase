package cn.com.flaginfo.contacts.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import cn.com.flaginfo.contacts.model.Group;

public class CacheFactory {
	
	private static final Cache<String, List<String>> idCache;
	
	private static final Cache<String, List<Group>> group;
	
	private static final Cache<String, Long> allMemberNumber;
	
	private static final Cache<String, Long> curMemberNumber;
	
	private static final Cache<String,List<String>> lastlevidCache;	
	static{
		
		idCache = CacheBuilder.newBuilder()
				//设置缓存最大容量为1000，超过1000之后就会按照LRU最近虽少使用算法来移除缓存项
				.maximumSize(1000)
				//设置缓存容器的初始容量为100
                .initialCapacity(100)
                //设置并发级别为10，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(10)
                //设置写缓存后5分钟过期
                .expireAfterWrite(5, TimeUnit.MINUTES)
				.build(); 
		
		lastlevidCache = CacheBuilder.newBuilder()
				//设置缓存最大容量为1000，超过1000之后就会按照LRU最近虽少使用算法来移除缓存项
				.maximumSize(1000)
				//设置缓存容器的初始容量为100
                .initialCapacity(100)
                //设置并发级别为10，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(10)
                //设置写缓存后5分钟过期
                .expireAfterWrite(5, TimeUnit.MINUTES)
				.build(); 
		group = CacheBuilder.newBuilder()
				//设置缓存最大容量为1000，超过1000之后就会按照LRU最近虽少使用算法来移除缓存项
				.maximumSize(1000)
				//设置缓存容器的初始容量为100
                .initialCapacity(100)
                //设置并发级别为10，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(10)
                //设置写缓存后5分钟过期
                .expireAfterWrite(5, TimeUnit.MINUTES)
				.build();
		allMemberNumber = CacheBuilder.newBuilder()
				//设置缓存最大容量为1000，超过1000之后就会按照LRU最近虽少使用算法来移除缓存项
				.maximumSize(1000)
				//设置缓存容器的初始容量为100
                .initialCapacity(100)
                //设置并发级别为10，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(10)
                //设置写缓存后5分钟过期
                .expireAfterWrite(5, TimeUnit.MINUTES)
				.build(); 
		curMemberNumber = CacheBuilder.newBuilder()
				//设置缓存最大容量为1000，超过1000之后就会按照LRU最近虽少使用算法来移除缓存项
				.maximumSize(1000)
				//设置缓存容器的初始容量为100
                .initialCapacity(100)
                //设置并发级别为10，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(10)
                //设置写缓存后5分钟过期
                .expireAfterWrite(5, TimeUnit.MINUTES)
				.build(); 
	}
	
	public static Cache<String, List<String>> getIdCache(){
		return idCache;
	}
	
	
	
	
	public static Cache<String, List<String>> getLastlevidcache() {
		return lastlevidCache;
	}




	public static Cache<String, List<Group>> getGroupCache(){
		return group;
	}
	
	public static Cache<String, Long> getAllMemberCache(){
		return allMemberNumber;
	}
	
	public static Cache<String, Long> getCurMemberCache(){
		return curMemberNumber;
	}

}
