import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 final double BASE_SALARY =1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1;
		 
		 int sales;
		 double salary;
		 
		 while(true) {
			 System.out.print("Enter qross sales for the salesperson(for -1 to end): ");
			 sales = input.nextInt();
			 
			 if (sales==SENTINEL) {
				 break;
			 }
			 
			 salary = BASE_SALARY +(sales * COMMISSION_RATE);
			 
			 System.out.printf("The saleperson's salary is : $%,.2f%n%n",salary);
		 
		 }
		 System.out.println("bye");
		
		input.close();

	}

}
