package com.fang.captureProcess.dao;

import java.util.List;

import com.fang.captureProcess.entity.RequestTask;
/**
 * 
 * @author huangjian
 * 征信系统和控股查询接口dao接口
 */
public interface RequestTaskDao {
  /**
   * 添加征信系统条用接口传过来的数据
   * @param list 调用接口传过来的json数据列表
   * @return result 插入数据库结果
   */
  public boolean insertRequestTaskInfo(List<RequestTask> list);
  
}
