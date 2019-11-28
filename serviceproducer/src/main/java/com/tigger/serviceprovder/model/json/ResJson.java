package com.tigger.serviceprovder.model.json;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 
 * 
 * @ClassName: AjaxJson.java
 * @Description: 
 * @author wangxiaolong
 * @Copyright: Copyright (c) 2017
 * @Company:成都信通网易医疗科技发展有限公司
 * @date 2019年4月11日
 */
@Component
public class ResJson  implements Serializable{

	private boolean success = true;// 是否成功
	private String msg = "操作成功";// 提示信息
	private Object obj = null;// 其他信息

	public ResJson(){
		super();
	}
	public ResJson(boolean success, String msg){
		super();
		this.success =success;
		this.msg = msg;
	}
	
	public ResJson(boolean success, String msg, Object obj){
		super();
		this.success =success;
		this.msg = msg;
		this.obj = obj;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
