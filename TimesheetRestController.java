package com.time.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.time.Exception.RecordNotFoundException;
import com.time.Model.Timesheet;
import com.time.Service.TimesheetService;
import com.time.Service.TimesheetServiceimpl;




@RestController
@RequestMapping("/timesheet")
public class TimesheetRestController {
    @Autowired
	TimesheetService service;
	
	@PostMapping
	public ResponseEntity<Integer> createStudent(@Validated @RequestBody Timesheet timesheet) {
		//System.out.println("Rest");
		Timesheet t = service.addTimesheet(timesheet);
		System.out.println(t);
		return new ResponseEntity<Integer>(t.getTimesheetid(),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Timesheet>> fetchStudents() {
		
		List<Timesheet> timesheet = service.finfdALLTimesheet();
		return  ResponseEntity.ok().body(timesheet);
		
	}
	
	@GetMapping("/{timesheetid}")
	public ResponseEntity<Timesheet> getTimesheetById(@PathVariable int timesheetid) {
		Optional<Timesheet> timesheet = service.findByTimesheetId(timesheetid);
		if(timesheet.isPresent()) {
			return new ResponseEntity<>(timesheet.get(), HttpStatus.OK);
		}
		else {
			throw new RecordNotFoundException("Record Not Found..");
		}
	}
	
	
	
}
