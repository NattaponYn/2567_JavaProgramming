
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee ();
		Employee emp2 = new Employee ();
		
		
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorm", 38, 25.0);
		
		System.out.print("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.print("\nEmployee 2 Details");
		emp1.displayEmployeeDetails();


	}

}
