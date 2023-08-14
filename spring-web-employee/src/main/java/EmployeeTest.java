

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.seed.employee.Employee;
import com.seed.employee.contract.ContractBasedEmployee;
import com.seed.employee.contract.ContractTechnicalAssociate;
import com.seed.employee.dao.EmployeeRepository;
import com.seed.employee.permanent.PermanentEmployee;
import com.seed.employee.permanent.ProjectManager;
import com.seed.employee.permanent.TechnicalAssociate;

public class EmployeeTest {

	private EmployeeCreate empCreate;
	PermanentEmployee pe2, pe3;
	ContractBasedEmployee ce2;
	TechnicalAssociate e1;
	ProjectManager e2;
	ContractTechnicalAssociate e3;
	

	@BeforeEach
	public void callBefore() {
		empCreate = new EmployeeCreate();
		pe2 = new ProjectManager("Jack", "Smith", "D", new GregorianCalendar(2023, 10, 20),3,Arrays.asList("PMI"));
		pe3 = new TechnicalAssociate("David", "Williams", "C", new GregorianCalendar(2023, 10, 30),3,3,Arrays.asList("SCJP","SCBCD"));
		ce2 = new ContractTechnicalAssociate("Jeff", "Brown", "B", new GregorianCalendar(2024, 1, 20), "Susan",50, 500,Arrays.asList("SCWCD","SCJP"));
		e1 = new TechnicalAssociate("David", "Williams","A", new GregorianCalendar(2024, 1, 20),3,3,Arrays.asList("SCJP","SCBCD"));
		e2 = new ProjectManager("Jack", "Smith","C", new GregorianCalendar(2023, 10, 30),3,Arrays.asList("PMI"));
		e3 = new ContractTechnicalAssociate("Jeff", "Brown","A", new GregorianCalendar(2023, 10, 20), "Susan",50, 500,Arrays.asList("SCWCD","SCJP"));
		empCreate.addEmployee(pe2);	
		empCreate.addEmployee(pe3);	
		empCreate.addEmployee(ce2);
	}
	
	@Test
	public void testNoOfEmp() {
		PermanentEmployee pe4 = new PermanentEmployee("kishu", "Patel","B", new GregorianCalendar(2023, 8, 18));
		ContractBasedEmployee ce3 = new ContractBasedEmployee("Zeal", "Patel","C", new GregorianCalendar(2023, 10, 25),"Robert",40,400);
		empCreate.addEmployee(pe4);
		empCreate.addEmployee(ce3);
		assertEquals(5, empCreate.getNoEmployee());
	}
	
	@Test
	public void testDisplay() {
		empCreate.displayEmployee();
		assertEquals(3, empCreate.getNoEmployee());
	}
	@Test
	public void testSalarypta() {
		assertEquals(18000, e1.calculateSalary(),0.00);
	}
	
	@Test
	public void testSalarypm() {
		assertEquals(30000, e2.calculateSalary(),0.00);
	}
	
	@Test
	public void testSalarycta() {
		assertEquals(48000, e3.calculateSalary(),0.00);
	}
	
	
}