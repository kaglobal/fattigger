package com.tigger.serviceprovder.core;

import java.util.List;

/**
 * dao的通用接口
 * @ClassName: BaseDao
 * @Description: dao的通用接口
 * @author tigger
 * @date 2019年2月22日 上午11:37:58
 * @最后修改人：tigger
 * @最后修改时间：2019年2月22日 上午11:37:58
 *
 * @param <T>
 *
 */
public interface BaseDao<T> {
	/**
	 * 查找所有
	 * @Title: findList
	 * @Description: 查找所有
	 * @最后修改人：tigger
	 * @最后修改时间：2019年2月22日 上午11:39:33
	 * @return 找到的所有数据
	 * @return List<T> 返回类型
	 * @throws
	 */
	List<T> findList();
	/**
	 * 添加数据
	 * @Title: save
	 * @Description: 添加数据
	 * @最后修改人：tigger
	 * @最后修改时间：2019年2月22日 上午11:39:20
	 * @param record 需要保存的数据
	 * @return 1成功 0失败
	 * @return int 返回类型
	 * @throws
	 */
	int save(T record);

	/**
	 * 通过id获取
	 * @Title: getByPk
	 * @Description: 通过id获取
	 * @最后修改人：tigger
	 * @最后修改时间：2019年2月22日 上午11:39:28
	 * @param id 主键
	 * @return 1成功 0失败
	 * @return T 返回类型
	 * @throws
	 */
	T getByPk(String id);

	/**
	 * 修改数据
	 * @Title: updateByPk
	 * @Description: 修改数据
	 * @最后修改人：tigger
	 * @最后修改时间：2019年2月22日 上午11:39:41
	 * @param record 需要修改的数据
	 * @return 1成功 0失败
	 * @return int 返回类型
	 * @throws
	 */
	int updateByPk(T record);

	/**
	 * 通过id删除
	 * @Title: deleteByPk
	 * @Description: 通过id删除
	 * @最后修改人：tigger
	 * @最后修改时间：2019年2月22日 上午11:39:48
	 * @param id 主键
	 * @return 1成功 0失败
	 * @return int 返回类型
	 * @throws
	 */
	int deleteByPk(String id);

}
