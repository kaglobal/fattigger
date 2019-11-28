package com.tigger.serviceprovder.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 
* @ClassName: CommonDao 
* @Description: TODO(公共操作dao) 
* @author tigger
* @date 2019年4月26日 上午9:45:27
* @最后修改人：tigger
* @最后修改时间：2019年4月26日 上午9:45:27
*
 */
public interface CommonDao {

    
	/**
	 * 
	* @Title: queryList 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @最后修改人：luojun
	* @最后修改时间：2019年4月26日 上午9:45:22
	* @param value
	* @return List<LinkedHashMap<String,Object>> 返回类型
	* @throws
	 */
    List<LinkedHashMap<String, Object>> queryList(String value);
    
    /**
     * @param idValue 
     * @param idColumn 
     * 
    * @Title: count 
    * @Description:  查询某个表的某个字段的某个值在数据库的存在条数
    * @最后修改人：luojun
    * @最后修改时间：2019年4月26日 上午9:45:16
    * @param table 表名
    * @param column 字段
    * @param value 值
    * @return int 个数
    * @throws
     */
	int count(@Param("table") String table, @Param("column") String column, @Param("value") Object value,
              @Param("idColumn") String idColumn, @Param("idValue") Object idValue);

}
