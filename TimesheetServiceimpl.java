package com.time.Service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.time.Model.Timesheet;
import com.time.Repository.TimesheetDAO;

@Service
public class TimesheetServiceimpl implements TimesheetService{

	@Autowired
	TimesheetDAO dao;
	public Timesheet addTimesheet(Timesheet timesheet) 
	{
		Timesheet time = dao.save(timesheet);
		
		return time;
	}
	@Override
	public List<Timesheet> finfdALLTimesheet() {
		// TODO Auto-generated method stub
		List<Timesheet> timesheet = dao.findAll();
		return timesheet;
	}
	@Override
	public Optional<Timesheet> findByTimesheetId(int timesheetid) {
		// TODO Auto-generated method stub
		return dao.findById(timesheetid);
	}
	@Override
	public List<Timesheet> fetchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object Timesheet(Object timesheet) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

		
		
}