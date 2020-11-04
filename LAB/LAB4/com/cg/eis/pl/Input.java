
package com.cg.eis.pl;

import com.cg.eis.service.Service;
import java.util.ServiceConfigurationError;
import com.cg.eis.bean.Employee;

public class Input {

	public static void main(String[] args) {

		Service service = new Service();
	
		Employee newEmployee =  service.getEmployeeDetails();
		String insuranceScheme = service.findInsuranceScheme(newEmployee);
		newEmployee.setInsuranceScheme(insuranceScheme);
		service.displayDetails(newEmployee);
	}

}