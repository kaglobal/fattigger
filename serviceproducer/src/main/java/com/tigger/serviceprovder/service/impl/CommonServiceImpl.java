package com.tigger.serviceprovder.service.impl;

import com.tigger.serviceprovder.dao.CommonDao;
import com.tigger.serviceprovder.service.api.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    private CommonDao commonDao;

    @Override
    public List<LinkedHashMap<String, Object>> queryList(String sql) {
        return commonDao.queryList(sql);
    }

	@Override
	public boolean checkExists(String table, String column, Object value) {
		int res = commonDao.count(table, column, value, null, null);
		if(res == 0) {
			// 等于0，标识数据库中不存在
			return false;
		}
		return true;
	}

	@Override
	public boolean checkExists(String table, String column, Object value, String idColumn, Object idValue) {
		int res = commonDao.count(table, column, value, idColumn, idValue);
		if(res == 0) {
			// 等于0，标识数据库中不存在
			return false;
		}
		return true;
	}
}
