package collection;

import java.util.List;

public class EmpDriver {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = EmpUtils.getEmpList();
		EmpUtils.sortEmpByName(empList);
		EmpUtils.printEmpList(empList);
		System.out.println("******************************************************");
		EmpUtils.sortEmpBySalary(empList);
		EmpUtils.printEmpList(empList);
		System.out.println("******************************************************");
		EmpUtils.sortEmpByNameReverse(empList);
		EmpUtils.printEmpList(empList);
		System.out.println("******************************************************");
		EmpUtils.sortEmpBySalaryReverse(empList);
		EmpUtils.printEmpList(empList);
		System.out.println("******************************************************");
	}

}
