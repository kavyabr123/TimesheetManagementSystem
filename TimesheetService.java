package com.time.Service;



import java.util.List;
import java.util.Optional;

import com.time.Model.Timesheet;

public interface TimesheetService {
	
	public Timesheet addTimesheet(Timesheet timesheet);

	public List<Timesheet> finfdALLTimesheet();

	public Optional<Timesheet> findByTimesheetId(int timesheet);

	List<Timesheet> fetchById(int id);

	public Object Timesheet(Object timesheet);

	

	
}
