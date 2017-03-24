/**
 * File：DtbController.java
 * Package：com.fang.captureProcess.controller
 * Author：user
 * Date：2016-1-15 下午5:35:05
 * Copyright (C) 2003-2016 搜房资讯有限公司-版权所有
 */
package com.fang.captureProcess.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fang.captureProcess.entity.RequestTask;
import com.fang.captureProcess.service.RequestTaskService;

/**
 * @author huangjian
 */
@Controller
@RequestMapping("CaptureProcess/NoticeCaptureDataSucceed")
public class RequestTaskController {
  @Autowired
  @Qualifier("RequestTaskService")
  private RequestTaskService requestTaskService;
  
  @ResponseBody
  @RequestMapping(value = "/RequestTask",method = RequestMethod.POST)
  public void getRequestTask(HttpServletRequest request, HttpServletResponse response,@RequestBody String json) {
	JSONObject jsonObj = JSONObject.fromObject(json.toString());
	JSONArray jsonArray = jsonObj.getJSONArray("data");
	List<RequestTask> list = new ArrayList<RequestTask>();
	for(int i = 0;i < jsonArray.size();i++){
		RequestTask rt = new RequestTask();
		JSONObject jsonTemp = JSONObject.fromObject(jsonArray.get(0));
		rt.setExtendField(jsonTemp.getString("ExtendField"));
		rt.setRequestData(jsonTemp.getString("RequestData"));
		rt.setRequestTarget(jsonTemp.getString("RequestTarget"));
		rt.setRequestTaskId(jsonTemp.getInt("RequestTaskId"));
		list.add(rt);
	}
	requestTaskService.addRequestTaskInfo(list);
  } 
}
