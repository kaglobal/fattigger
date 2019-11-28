package com.tigger.serviceprovder.service.api;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 
* @ClassName: CommonService 
* @Description: (公共操作) 
* @author tigger
* @date 2019年4月26日 上午9:39:57
* @最后修改人：tigger
* @最后修改时间：2019年4月26日 上午9:39:57
* 
*
 */
public interface CommonService {

	/**
	 * 
	 * @Title: queryList
	 * @author tigger
	 * @Description:(根据sql查询查询数据) 
	 * @param
	 * @return List<LinkedHashMap<String,Object>> 返回类型
	 */
    List<LinkedHashMap<String, Object>> queryList(String sql);
    
    

    /**
     * 
     * @Title: checkExists
     * @author tigger
     * @Description:(检查某表的的某个字段的值是否存在) 
     * @param
     * @return
     */
    boolean checkExists(String table, String column, Object value);
    
    /**
     * 
     * @Title: checkExists
     * @author tigger
     * @Description: 检查某表的的某个字段的值是否存在，并剔除指定id的列（可用于修改操作，判断唯一一行）
     * @param
     * @return
     */
    boolean checkExists(String table, String column, Object value, String idColumn, Object idValue);
}
