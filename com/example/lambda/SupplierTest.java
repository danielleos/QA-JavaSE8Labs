package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author oracle
 */
public class SupplierTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Supplier<Employee> eSupp = e ->
    		System.out.println("Given name: " + e.getGivenName() + "\nSurName: " + e.getSurName()
    		+ "\nAge: " + e.getAge() + "\nGender: " + e.getGender() + "\nRole: " + e.getRole()
    		+ "\nDEPT: " + e.getDept() + "\nStart Date: " + e.getStartDate() + "\nSalary: " + e.getSalary()
    		+ "\nEmail: " + e.getEmail() + "\nPhoneNumber: " + e.getPhone() + "\nAddress: " + e.getAddress()
    		+ "\nCity: " + e.getCity() + "\nState: " + e.getState() + "\nCode: " + e.getCode());
      
    System.out.println("=== Print employee list before");
    eList.stream().forEach(Employee::printSummary);
    
    // Add new employee here
    
    System.out.println("\n=== Print employee list after");
    eList.stream().forEach(Employee::printSummary);
    
        
  }
}
