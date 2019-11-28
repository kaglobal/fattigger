/**
 * 
 * @ClassName: SysConstants.java
 * @Description: 
 * @author wangxiaolong
 * @Copyright: Copyright (c) 2017
 * @Company:成都信通网易医疗科技发展有限公司
 * @date 2019年4月15日
 */
package com.tigger.serviceprovder.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @ClassName: SysConstants.java
 * @Description: 系统通用常量
 * @author wangxiaolong
 * @Copyright: Copyright (c) 2017
 * @date 2019年4月15日
 */
@Configuration
public class SysConstants {
	private static Logger logger = LoggerFactory.getLogger(SysConstants.class);
	public static Map<String, String> DOCTOR_LEVEL_MAP = new LinkedHashMap<String, String>();
	// 已打印
	public final static String PRINT_OUT = "1";

	// 新增病历为住院类型病历
	public final static String ZY_BL = "1";
	// 新增病历为门诊类型病历
	public final static String MZ_BL = "2";

	// 是组合
	public final static String IS_COMBINE = "1";
	// 电子病历管理员操作级别
	public final static int ADMIN_LEVEL = 1;
	// 电子病历医务科操作级别
	public final static int YWK_LEVEL = 2;
	// 电子病历科室领导操作级别
	public final static int LEADER_LEVEL = 3;
	// 电子病历医生操作级别
	public final static int DOCTOR_LEVEL = 4;

	@PostConstruct
	public static void getDoctorLevel() {
		Map<String, String> doctorLevelMap = new HashMap<String, String>();
		doctorLevelMap.put("235", "1");
		doctorLevelMap.put("234", "2");
		doctorLevelMap.put("233", "3");
		doctorLevelMap.put("232", "4");
		doctorLevelMap.put("231", "5");
		DOCTOR_LEVEL_MAP = doctorLevelMap;
	}
}
