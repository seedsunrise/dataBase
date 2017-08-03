package cn.com.flaginfo.service;
import java.util.List;

import cn.com.flaginfo.model.DictConfigField;
public interface DictConfigFieldService extends ICommonService<DictConfigField> {
	public void deleteBatch(List ids);
}
