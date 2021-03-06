package com.qiqiim.webserver.user.service;

import com.qiqiim.webserver.user.model.UserMessageEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-23 10:47:47
 */
public interface UserMessageService {
	
	UserMessageEntity queryObject(Long id);
	
	List<UserMessageEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserMessageEntity userMessage);
	
	int update(UserMessageEntity userMessage);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
