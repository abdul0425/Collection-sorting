package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpUtils {

//	Creating List of employees
	public static List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Rivu", 26000.00));
		empList.add(new Employee(201, "Sasthi", 20000.00));
		empList.add(new Employee(301, "Abdul", 30000.00));
		empList.add(new Employee(401, "Keerthana", 22000.00));
		empList.add(new Employee(501, "Bubai", 40000.00));
		empList.add(new Employee(601, "Anjani", 60000.00));
		empList.add(new Employee(701, "Akhil", 65000.00));

		return empList;
	}

//	Sorting based on empName in ascending order
	static void sortEmpByName(List<Employee> list) {
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		};

		Collections.sort(list, comp);
	}

//	Sorting based on empSalary in ascending order
	static void sortEmpBySalary(List<Employee> list) {
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary() - o2.getSalary());
			}
		};
		Collections.sort(list, comp);
	}

//	Sorting based on empName in descending order
	static void sortEmpByNameReverse(List<Employee> list) {
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getEmpName().compareTo(o1.getEmpName());
			}
		};

		Collections.sort(list, comp);
	}

//	Sorting based on empSalary in descending order
	static void sortEmpBySalaryReverse(List<Employee> list) {
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getSalary() - o1.getSalary());
			}
		};
		Collections.sort(list, comp);
	}

//	printing list of employees
	static void printEmpList(List<Employee> list) {
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
