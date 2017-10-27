package com.example.lambda;

import java.util.List;

/**
 * @author Oracle
 * Reuse lambda expressions
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();
    
    //8-1
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Mail All Sales Over 50");
    pl.stream()
    	.filter(p -> p.getDept().equals("Sales"))
    	.filter(p -> p.getAge() >= 50)
    	.forEach(p -> robo.roboMail(p));
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Text All Sales Over 50");
    pl.stream()
    	.filter(p -> p.getDept().equals("Sales"))
    	.filter(p -> p.getAge() >= 50)
    	.forEach(p -> robo.roboText(p));
    
    System.out.println();
    
    //8-2
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Executives");
    pl.stream()
    	.filter(p -> p.getDept().equals("Sales"))
    	.filter(p -> p.getRole().equals(Role.EXECUTIVE))
    	.forEach(p -> robo.roboMail(p));
    
    System.out.println();
    
    //8-3
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== All Sales Over 50");
    pl.stream()
    	.filter(p -> p.getDept().equals("Sales"))
    	.filter(p -> p.getAge() >= 50)
    	.forEach(p -> robo.roboMail(p));
    
    System.out.println();
    
    //8-4
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng under 65");
    pl.stream()
    	.filter(p -> p.getGender().equals(Gender.MALE))
    	.filter(p -> p.getDept().equals("Eng"))
    	.filter(p -> p.getAge() <= 65)
    	.forEach(p -> robo.roboMail(p));
  }
}
