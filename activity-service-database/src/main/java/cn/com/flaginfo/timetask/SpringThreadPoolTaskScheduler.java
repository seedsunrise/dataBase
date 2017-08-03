package cn.com.flaginfo.timetask;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;


public class SpringThreadPoolTaskScheduler{
	
	private static ConcurrentHashMap<String,ScheduledFuture<?>> taskMap = new ConcurrentHashMap<>();
	
	private SpringThreadPoolTaskScheduler(){
		
	}
	public static ThreadPoolTaskScheduler threadPoolTaskScheduler;
	static{
		threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.setThreadNamePrefix("CronTask"); 
		threadPoolTaskScheduler.initialize();
	}
	
	public synchronized static void removeTask(String taskId){
		if(taskMap.get(taskId)!=null){
			ScheduledFuture<?> sf = taskMap.get(taskId);
			sf.cancel(true);
			taskMap.remove(taskId);
		}
	}
	
	public static void addTask(TaskThread<?> thread){
		ScheduledFuture<?> future = threadPoolTaskScheduler.schedule(thread, new CronTrigger(thread.getCron()));
		taskMap.put(thread.getTaskId(), future);
	}
	
	
	
	
}
