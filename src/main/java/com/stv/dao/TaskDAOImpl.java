package com.stv.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stv.model.Task;

@Service
@Transactional
public class TaskDAOImpl extends JdbcDaoSupport implements TaskInfoDAO{
	
	@Autowired
	public TaskDAOImpl (DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public String editTask(Task task) {
		
		String sql = "UPDATE TASKS SET title = ? , scheduled_date = ?, complete_date =  ?, priority = ?, isComplete = ?,"
				+ " delete_flg = ?, updated_at =?  where id = ? ";
				
		Object[] params = new Object[] {task.getTitle(), task.getScheduled_date(), task.getComplete_date(), task.getPriority(),
				task.isComplete(), task.getDelete_flg(), task.getUpdated_at(),task.getId()};
		this.getJdbcTemplate().update(sql, params);
		
		return "edit succesfull";
	}

	@Override
	public List<Task> getListTask() {
		String sql = "SELECT  * from TASKS";
		List<Task> listTasks = this.getJdbcTemplate().queryForList(sql, Task.class);
		return listTasks;
	}

	@Override
	public String deleteTask(int id) {
		String sql = "UPDATE TASKS SET delete_flg = 1  where id = ? ";
		
		Object[] params = new Object[] {id};
		this.getJdbcTemplate().update(sql, params);
		return "delete succesfull";
	}
	
	
}
