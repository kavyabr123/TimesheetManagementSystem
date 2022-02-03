package com.time.Model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Timesheets")
public class Timesheet {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int timesheetid;
    private int prjid;
    private int empid;
    private int noofhrs;
	private String approved;
	
	@Column(name="approver_name",nullable=false)
	@Size(min=2,message="User name have atleast twocharacter")
	private String approvedby;

	public Timesheet(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Timesheet(int i, int j, int k, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getTimesheetid() {
		return timesheetid;
	}

	public void setTimesheetid(int timesheetid) {
		this.timesheetid = timesheetid;
	}

	public int getPrjid() {
		return prjid;
	}

	public void setPrjid(int prjid) {
		this.prjid = prjid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getNoofhrs() {
		return noofhrs;
	}

	public void setNoofhrs(int noofhrs) {
		this.noofhrs = noofhrs;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public String getApprovedby() {
		return approvedby;
	}

	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}

	@Override
	public String toString() {
		return "Timesheet [timesheetid=" + timesheetid + ", prjid=" + prjid + ", empid=" + empid + ", noofhrs="
				+ noofhrs + ", approved=" + approved + ", approvedby=" + approvedby + "]";
	}
	

}