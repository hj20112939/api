package com.fang.captureProcess.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.fang.captureProcess.entity.RequestTask;

@Repository("RequestTaskDao")
public class RequestTaskDaoImpl implements RequestTaskDao {
  @Resource
  private SqlSessionTemplate sqlSession;
  
  @Override
  public boolean insertRequestTaskInfo(List<RequestTask> list) {
	Map<String, Object> map = new HashMap<String, Object>();
    map.put("insertList", list);
    try{
	  this.sqlSession.insert("RequestTask.insertRequestTaskInfo", map);
    }catch(Exception e){
    	return false;
    }
	return true;
  }
}
