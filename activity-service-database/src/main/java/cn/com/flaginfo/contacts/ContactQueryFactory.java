package cn.com.flaginfo.contacts;

import cn.com.flaginfo.contacts.impl.CacheContactQuery;
import cn.com.flaginfo.contacts.impl.MemoryContactQuery;

public class ContactQueryFactory {
	
	private ContactQueryFactory(){}
	
	private static final ContactQuery CONTACT_QUERY;
	
	static{
		ContactQuery contactQuery = new MemoryContactQuery(null);
		CONTACT_QUERY = new CacheContactQuery(contactQuery);
	}
	
	public static ContactQuery getContactQuery(){
		return CONTACT_QUERY;
	}

}
