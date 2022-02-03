package com.time;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.time.Model.Timesheet;
import com.time.Repository.TimesheetDAO;
import com.time.Service.TimesheetService;


@RunWith(SpringRunner.class)
@SpringBootTest
class TimeSheetManagementSystemApplicationTests {

	@Autowired
	private TimesheetService service;

	@MockBean
	private TimesheetDAO repository;

	private Object Timesheet;

	// fetchAllEmployee
	@Test
	public void getTimesheetTest() {
		when(repository.findAll()).thenReturn(
				Stream.of(new Timesheet(21,2022,4,"pass","komal"), new Timesheet(21,2023,4,"pass","kavya"))
						.collect(Collectors.toList()));

		assertEquals(2, service.finfdALLTimesheet().size());
	}

	

	
}