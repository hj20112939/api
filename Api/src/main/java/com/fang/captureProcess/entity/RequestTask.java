package com.fang.captureProcess.entity;
/**
 * 接口查询参数实体类
 * @author huangjian
 */
public class RequestTask {
  private String RequestTarget;
  private int RequestTaskId;
  private String RequestData;
  private String ExtendField;
  
  public String getRequestTarget() {
	return RequestTarget;
  }
  public void setRequestTarget(String requestTarget) {
	RequestTarget = requestTarget;
  }
  public int getRequestTaskId() {
	return RequestTaskId;
  }
  public void setRequestTaskId(int requestTaskId) {
	RequestTaskId = requestTaskId;
  }
  public String getRequestData() {
	return RequestData;
  }
  public void setRequestData(String requestData) {
	RequestData = requestData;
  }
  public String getExtendField() {
	return ExtendField;
  }
  public void setExtendField(String extendField) {
	ExtendField = extendField;
  }
}
