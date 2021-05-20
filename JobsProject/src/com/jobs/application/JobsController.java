package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import java.util.List;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee normalEmployed = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(normalEmployed);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}


	public void payAllEmployeers() {
		
		List<AbsStaffMember> members = repository.getAllMembers();
		if(members != null && !members.isEmpty())
		{
			for (AbsStaffMember m : members) {
				m.pay();
			}
		}	
	}

	public String getAllEmployees() {
		
		StringBuilder result = new StringBuilder();
		List<AbsStaffMember> members = repository.getAllMembers();
		if(members != null && !members.isEmpty())
		{
			for (AbsStaffMember m : members) {
				if(m instanceof Employee)
				{
					Employee e = (Employee) m;
					result.append(e.toString());
				}
		}	
			
		return result.toString();
	}

	public void createVolunteer(String string, String string2, String string3) throws Exception {
		// TODO Auto-generated method stub
		Volunteer volunteer = new Volunteer(string, string2, string3,"Voluntario");
		repository.addMember(volunteer);
	}
	
	
	
}
