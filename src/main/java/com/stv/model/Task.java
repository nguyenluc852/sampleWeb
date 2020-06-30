package com.stv.model;

public class Task {
	int id;
	String title;
	String scheduled_date;
	String complete_date;
	int priority;
	boolean isComplete;
	int delete_flg;
	String created_at;
	String updated_at;
	
	
	public Task() {
		super();
	}


	public Task(int id, String title, String scheduled_date, String compleate_date, int priority, boolean isComplete,
			int delete_flg, String created_at, String updated_at) {
		super();
		this.id = id;
		this.title = title;
		this.scheduled_date = scheduled_date;
		this.complete_date = compleate_date;
		this.priority = priority;
		this.isComplete = isComplete;
		this.delete_flg = delete_flg;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getScheduled_date() {
		return scheduled_date;
	}
	public void setScheduled_date(String scheduled_date) {
		this.scheduled_date = scheduled_date;
	}
	public String getComplete_date() {
		return complete_date;
	}
	public void setComplete_date(String compleate_date) {
		this.complete_date = compleate_date;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public int getDelete_flg() {
		return delete_flg;
	}
	public void setDelete_flg(int delete_flg) {
		this.delete_flg = delete_flg;
	}
	
}
