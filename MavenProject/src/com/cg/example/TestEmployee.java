package com.cg.example;
import java.util.Scanner;


public class TestEmployee {
	
	public static void main(String[] args) throws EmployeeNotFoundException {
		Employee emp[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter employee "+(i+1)+" id,name, salary and skills");
			int id=sc.nextInt();
			String name=sc.next();
			float salary=sc.nextFloat();
			String skill=sc.next();
			String skills[]=skill.split(",");
			emp[i]=new Employee(id, name, salary, skills);
		}
		
		PrintEmployee.displayDetails(emp);
		MapEmployee.displaySkills(emp);
		System.out.println("Enter an ID to Search");
		System.out.print(SearchEmployee.search(emp,sc.nextInt()));
		{
			PrintEmployee.displayDetails(Salary);
			MapEmployee.displaySkills(emp);
			

	}

}


}
