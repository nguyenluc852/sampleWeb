package com.stv.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.stv.model.Task;

class TaskInfoDAOTest {
	DriverManagerDataSource dataSource;
	private TaskInfoDAO dao;
	
	@BeforeEach
	void setupBeforeEarch() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/sampledb");
	    dataSource.setUsername("root");
	    dataSource.setPassword("nguyenluc1@");
	    dao = new TaskDAOImpl(dataSource);
	}
	
	@Test
	void testEditTask() {
		fail("Not yet implemented");
	}

	@Test
	void testGetListTask() {
	    List<Task> listTask = dao.getListTask();
	    for (Task task : listTask) {
	    	System.out.println(task);
		}
	    
		assertTrue(listTask.size() > 0);
	}

	@Test
	void testDeleteTask() {
		fail("Not yet implemented");
	}

}
