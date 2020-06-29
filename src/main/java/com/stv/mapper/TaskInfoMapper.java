package com.stv.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stv.model.Task;


public class TaskInfoMapper implements RowMapper<Task> {
	@Override
	public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String title = rs.getString("title");
		String scheduled_date = rs.getString("scheduled_date");
		String compleate_date = rs.getString("compleate_date");
		int priority = rs.getInt("priority");
		boolean isComplete = rs.getBoolean("isComplete");
		int delete_flg = rs.getInt("delete_flg");
		String created_at = rs.getString("created_at");
		String updated_at = rs.getString("updated_at");
		return new Task(id, title, scheduled_date, compleate_date, priority, isComplete,delete_flg, created_at, updated_at);
	}

}
