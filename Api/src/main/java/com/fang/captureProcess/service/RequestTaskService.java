package com.fang.captureProcess.service;

import java.util.List;

import com.fang.captureProcess.entity.RequestTask;
/**
 * @author huangjian
 * 征信系统和控股查询接口service接口
 */
public interface RequestTaskService {
  /**
   * 
   * @param list 调用接口传过来的json数据列表
   * @return result 插入结果
   */
  public boolean addRequestTaskInfo(List<RequestTask> list);
}
