package com.stv.dao;

import java.util.List;

import com.stv.model.Task;

public interface TaskInfoDAO {
	public String editTask(Task task);
	
	public List<Task> getListTask();
	
	public String deleteTask(int id);
}
