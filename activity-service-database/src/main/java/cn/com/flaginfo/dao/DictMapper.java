package cn.com.flaginfo.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.flaginfo.model.Dict;
@Mapper
public interface DictMapper {

	/**通过类型和父级id获取
     *
     * @param type
     * @return
     */
    public List<Dict> getSubDictByType(@Param("type")String type,@Param("parentId")String parentId);

    /**获取所有记录
     * 
     * @param 
     * @return
     */
    public List<Dict> getAllDict();
    

    
    /**通过类型获取
    *
    * @param type
    * @return
    */
   public List<Dict> getDictType(@Param("type")String type);
   
   /**通过类型+空格+code获取
   *
   * @param type
   * @return
   */
  public List<Dict> getDictByType();
  /**通过类型+空格+code获取
  *
  * @param type
  * @return
  */
 public String getDictByType1();
}