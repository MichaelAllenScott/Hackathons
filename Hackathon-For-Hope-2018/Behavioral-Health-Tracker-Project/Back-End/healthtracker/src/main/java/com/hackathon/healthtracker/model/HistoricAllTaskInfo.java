package com.hackathon.healthtracker.model;

import java.util.List;

public class HistoricAllTaskInfo {

	private HistoricTaskInfo historicTaskInfo;
	private List<HistoricTaskInfo> historicTaskInfoList;

	public HistoricTaskInfo getHistoricTaskInfo() {
		return historicTaskInfo;
	}

	public void setHistoricTaskInfo(HistoricTaskInfo historicTaskInfo) {
		this.historicTaskInfo = historicTaskInfo;
	}

	public List<HistoricTaskInfo> getHistoricTaskInfoList() {
		return historicTaskInfoList;
	}

	public void setHistoricTaskInfoList(List<HistoricTaskInfo> historicTaskInfoList) {
		this.historicTaskInfoList = historicTaskInfoList;
	}
	
}
