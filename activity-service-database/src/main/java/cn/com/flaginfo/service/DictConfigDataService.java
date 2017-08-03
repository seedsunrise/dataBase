package cn.com.flaginfo.service;
import java.util.List;

import cn.com.flaginfo.model.DictConfigData;
public interface DictConfigDataService extends ICommonService<DictConfigData> {
	public void deleteBatch(List ids);
}
