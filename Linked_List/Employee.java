package Linked_List;

public class Employee {

	private int eid;
	private float salary;
	private String name, gender;

	Employee(int eid, String name, String gender, float salary) {
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public void display_employee() {
		System.out.println("\nID:" + eid + "\tName:" + name + "\tGender:" + gender + "\tSalary:" + salary);
	}

	int get_eid() {
		return eid;
	}

	public void set_employee(int eid, String name, String gender, float salary) {
		this.eid = eid;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

}
