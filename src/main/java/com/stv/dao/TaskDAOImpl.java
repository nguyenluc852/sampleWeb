package com.stv.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stv.model.Task;

@Service
@Transactional
public class TaskDAOImpl extends JdbcDaoSupport implements TaskInfoDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	public TaskDAOImpl (DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public String editTask(Task task) {
		
		String sql = "UPDATE TASKS SET title = ? , scheduled_date = ?, complete_date =  ?, priority = ?, isComplete = ?,"
				+ " delete_flg = ?, updated_at =?  where id = ? ";
				
		Object[] params = new Object[] {task.getTitle(), task.getScheduled_date(), task.getComplete_date(), task.getPriority(),
				task.isComplete(), task.getDelete_flg(), task.getUpdated_at(),task.getId()};
		jdbcTemplate.update(sql, params);
		
		return "edit succesfull";
	}

	@Override
	public List<Task> getListTask() {
		String sql = "SELECT  * from TASKS";
		
		RowMapper<Task> rowMapper = new RowMapper<Task>() {

			@Override
			public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
				Task task = new Task();
				task.setId(rs.getInt("id"));
				task.setTitle(rs.getString("title"));
				task.setScheduled_date(rs.getString("scheduled_date"));
				task.setComplete_date(rs.getString("complete_date"));
				task.setPriority(rs.getInt("priority"));
				task.setDelete_flg(rs.getInt("delete_flg"));
				task.setCreated_at(rs.getString("created_at"));
				task.setUpdated_at(rs.getString("updated_at"));
				return task;
			}
			
		};
		List<Task> listTasks = jdbcTemplate.query(sql, rowMapper);
		return listTasks;
	}

	@Override
	public String deleteTask(int id) {
		String sql = "UPDATE TASKS SET delete_flg = 1  where id = ? ";
		
		Object[] params = new Object[] {id};
		jdbcTemplate.update(sql, params);
		return "delete succesfull";
	}
	
	
}
