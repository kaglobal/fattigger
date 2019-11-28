package com.tigger.serviceprovder.core;

/**
 * action的参数
 * @ClassName: EmrActionMethod 
 * @Description: action的参数接口
 * @author tigger
 * @date 2019年4月10日 下午3:24:53
 * @最后修改人：tigger
 * @最后修改时间：2019年4月10日 下午3:24:53
 * 
 *
 */
public interface EmrDoctorTemplateStatus {
	/**审核中 */
	final String IN_AUDIT = "1";
	/**审核通过*/
	final String AUDIT_PASS = "2";
}
