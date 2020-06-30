package com.stv.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stv.dao.TaskInfoDAO;
import com.stv.model.Task;

@Controller
public class HomeController {
	
	@Autowired
    private TaskInfoDAO taskInfoDAO;

	@RequestMapping("/")
	public ModelAndView listTask(ModelAndView model) throws IOException{
		List<Task> listTask = taskInfoDAO.getListTask();
	    model.addObject("listTask", listTask);
	    model.setViewName("home");
	 
	    return model;
	}
}

