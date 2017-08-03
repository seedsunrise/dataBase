package cn.com.flaginfo.service;

import java.util.List;
import java.util.Map;

public interface LocalsService {

	List<Map<String, String>> query(List<String> ids);

}
