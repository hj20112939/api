package com.fang.captureProcess.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fang.captureProcess.dao.RequestTaskDao;
import com.fang.captureProcess.entity.RequestTask;

@Service("RequestTaskService")
public class RequestTaskServiceImpl implements RequestTaskService {
  @Autowired
  @Qualifier("RequestTaskDao")
  private RequestTaskDao requestTaskDao;

  @Override
  public boolean addRequestTaskInfo(List<RequestTask> list) {
	return this.requestTaskDao.insertRequestTaskInfo(list); 
  }
}
