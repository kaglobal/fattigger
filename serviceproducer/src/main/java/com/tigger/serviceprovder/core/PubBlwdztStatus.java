package com.tigger.serviceprovder.core;

/**
 * 病历状态参数
* @ClassName: PubBlwdztStatus 
* @Description: 病历状态参数接口
* @author tigger
* @date 2019年4月10日 下午3:32:34
* @最后修改人：tigger
* @最后修改时间：2019年4月10日 下午3:32:34
* 
*
 */
public interface PubBlwdztStatus{
	/**新建*/
	public static String New  = "0";
	
	/**暂存*/
	public static String Ltchd = "1";
	
	/**保存*/
	public static String Hold = "2";
	/**归档*/
	public static String Archive = "3";
	/**审核通过*/
	public static String Approve = "4";
	/**删除*/
	public static String DEL = "9";
	
	/**
	 * 有效的病历
	 */
	public static String[] VALID_DOC={New,Hold,Ltchd,Archive,Approve};
}
