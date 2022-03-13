package com.emailgenerator.driver;
//importing class property to use the data members and corresponding data
import com.emailgenerator.model.Employee;
import com.emailgenerator.service.EmailService;
import java.util.Scanner;

public class EmailDriver {

public static void main(String [] args) {
	Employee employee=new Employee("Uprant","Sharma");
	
	EmailService es=new EmailService();
		String generateEmailId;
		char[] genPswd;
	
System.out.println("Enter the department ID as you want");
System.out.println("1 Information Technology");
System.out.println("2 HR");
System.out.println("3 Admin");
System.out.println("4 Legal");
Scanner sc=new Scanner(System.in);
int option =sc.nextInt();

//Defining the department as initialization name of Domain for email ID

if(option ==1) {
	generateEmailId=es.generateEmailId(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),
			"it");
	genPswd=es.genPswd();
	es.credential(employee, generateEmailId, genPswd);
}
	
else if(option ==2) {
	generateEmailId=es.generateEmailId(employee.getFirstName().toLowerCase()
			,employee.getLastName().toLowerCase(),"hr");
	genPswd=es.genPswd();
	es.credential(employee, generateEmailId, genPswd);
}
else if(option ==3) {
	generateEmailId=es.generateEmailId(employee.getFirstName().toLowerCase()
			,employee.getLastName().toLowerCase(),"admin");
	genPswd=es.genPswd();
	es.credential(employee, generateEmailId, genPswd);
}
else {
	generateEmailId=es.generateEmailId(employee.getFirstName().toLowerCase()
			,employee.getLastName().toLowerCase(),"legal");
	genPswd=es.genPswd();
	es.credential(employee, generateEmailId, genPswd);
}
 
}
}
