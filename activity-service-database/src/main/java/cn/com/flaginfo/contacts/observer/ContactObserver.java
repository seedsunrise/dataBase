package cn.com.flaginfo.contacts.observer;

import java.util.Observer;

public interface ContactObserver extends Observer{
	
	public void init();
	
	public void clear();

}
