package cn.com.flaginfo.timetask;


public class TaskThread<T extends TaskScheduler> implements Runnable {
	private final T taskThead;
	private String taskId;
	private String cron;
	public TaskThread(T taskThead){
		this.taskThead = taskThead;
	}
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	@Override
	public void run() {
		taskThead.excute(taskId);
	}

}
