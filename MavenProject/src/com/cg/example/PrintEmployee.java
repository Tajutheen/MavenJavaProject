package com.cg.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class PrintEmployee {
	

	public static void displayDetails(Employee[] emp) {
		ArrayList<Employee> employeearray=new ArrayList<>();
		for(int i=0;i<emp.length;i++)
			employeearray.add(emp[i]);
		
		System.out.println("Printing Employee Details in forward direction");
		ListIterator<Employee> listIterator=employeearray.listIterator();
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		System.out.println("printing Employee in Reverse Order");
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
		System.out.println("*************************************************");
		System.out.println("After sorting on the basis of Salary");
		Collections.sort(employeearray,new SalaryComparator());
		Iterator it=employeearray.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("*****************************************************");
		
	}

}



