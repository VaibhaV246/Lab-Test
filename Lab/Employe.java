
import java.util.*;
public class Employe {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println(" Salary of first employee");
		int employee1=sc.nextInt();
		
		System.out.println(" Salary of second employee");
		int employee2=sc.nextInt();
		
		
		int avg= 10000;
		System.out.println("Average Salary of third Employees : "+avg);
		
	
		int employee3=(avg*3)-(employee1+employee2);
		
		System.out.println("Salary of first Employee is : "+employee1);
		System.out.println("Salary of second Employee is : "+employee2);
		System.out.println("Salary of third Employee is : "+employee3);

				
		
		

	}

}