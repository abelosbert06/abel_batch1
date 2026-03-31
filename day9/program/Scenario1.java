public class Scenario1{
	public static void main(String[] args) {
		Employee emp1 = new FullTimeEmployee(34);
		Employee emp2 = new PartTimeEmployee(35);

		IO.println(emp1.getSalary());
		IO.println(emp2.getSalary());

	}
}

abstract class Employee {
	int employee_id;

	Employee(int id){
		this.employee_id = id;	
	}
	
	abstract String getSalary();
}

class FullTimeEmployee extends Employee {
	
	FullTimeEmployee(int id){
		super(id);
	}

	int getId(){
		return this.employee_id;
	}

	String getSalary(){
		return "FUll time employee salary: 10000";
	}
}

class PartTimeEmployee extends Employee {
	
	PartTimeEmployee(int id){
		super(id);
	}

	int getId() {
		return this.employee_id + 300;
	}

	String getSalary() {
		return "Part time employee salary: 50000";
	}
}
