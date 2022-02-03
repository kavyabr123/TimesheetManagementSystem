package com.time.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.time.Model.Timesheet;

public interface TimesheetDAO extends JpaRepository<Timesheet,Integer> {



	
	
}
