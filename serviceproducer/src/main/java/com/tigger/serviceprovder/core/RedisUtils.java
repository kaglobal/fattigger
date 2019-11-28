package com.tigger.serviceprovder.core;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: RedisUtils.java
 * @Description: 
 * @author wangxiaolong
 * @Copyright: Copyright (c) 2017
 * @Company:成都信通网易医疗科技发展有限公司
 * @date 2019年6月18日
 */
@Component
public class RedisUtils {

	@Autowired
	private RedisTemplate redisTemplate;

	/**
	 * 
	 * @Title: remove
	 * @author wangxiaolong
	 * @Description: 批量删除对应的value
	 * @param
	 * @return
	 */
	public void remove(final String... keys) {
		for (String key : keys) {
			remove(key);
		}
	}


	/**
	 * 
	 * @Title: removePattern
	 * @author wangxiaolong
	 * @Description:批量删除key
	 * @param
	 * @return
	 */
	public void removePattern(final String pattern) {
		Set<String> keys = redisTemplate.keys(pattern);
		if (keys.size() > 0)
			redisTemplate.delete(keys);
	}

	/**
	 * 
	 * @Title: remove
	 * @author wangxiaolong
	 * @Description:删除对应的value
	 * @param
	 * @return
	 */
	public void remove(final String key) {
		if (exists(key)) {
			redisTemplate.delete(key);
		}
	}


	/**
	 * 
	 * @Title: exists
	 * @author wangxiaolong
	 * @Description:判断缓存中是否有对应的value
	 * @param
	 * @return
	 */
	public boolean exists(final String key) {
		return redisTemplate.hasKey(key);
	}


	/**
	 * 
	 * @Title: get
	 * @author wangxiaolong
	 * @Description: 读取缓存
	 * @param
	 * @return
	 */
	public String get(final String key) {
		Object result = null;
		redisTemplate.setValueSerializer(new StringRedisSerializer());
		ValueOperations<String, Object> operations = redisTemplate.opsForValue();
		result = operations.get(key);
		if (result == null) {
			return null;
		}
		return result.toString();
	}


	/**
	 * 
	 * @Title: set
	 * @author wangxiaolong
	 * @Description:写入缓存
	 * @param
	 * @return
	 */
	public boolean set(final String key, Object value) {
		boolean result = false;
		try {
			ValueOperations<String, Object> operations = redisTemplate.opsForValue();
			operations.set(key, value);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 
	 * @Title: set
	 * @author wangxiaolong
	 * @Description:普通写入缓存
	 * @param
	 * @return
	 */
	public boolean set(final String key, Object value, Long expireTime) {
		boolean result = false;
		try {
			ValueOperations<String, Object> operations = redisTemplate.opsForValue();
			operations.set(key, value);
			redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 
	 * @Title: hmset
	 * @author wangxiaolong
	 * @Description:写入缓存 多个键值
	 * @param
	 * @return
	 */
	public boolean hmset(String key, Map<String, String> value) {
		boolean result = false;
		try {
			redisTemplate.opsForHash().putAll(key, value);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 
	 * @Title: hmget
	 * @author wangxiaolong
	 * @Description:获取缓存，多个键值
	 * @param
	 * @return
	 */
	public Map<Object, Object> hmget(String key) {
		Map<Object, Object> result = null;
		try {
			result = redisTemplate.opsForHash().entries(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
