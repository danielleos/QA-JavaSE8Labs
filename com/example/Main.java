package com.example;

public class Main {
  public static void main(String[] args) {
    /*PeerSingleton peerList01 = PeerSingleton.getInstance();
    PeerSingleton peerList02 = PeerSingleton.getInstance();
    for(String hostName:peerList01.getHostNames()) {
    	System.out.println("Host Name: " + hostName);
    }
    System.out.println();
    for(String hostName:peerList02.getHostNames()) {
    	System.out.println("Host Name: " + hostName);
    }
    */

	  Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000.00);
	  Employee john = new Employee("John Deer", "Staff", "HR", 55000.00);
	  
	  System.out.println("Jane's Withholding: " + jane.getWithholding());
	  System.out.println("John's Bonus: " + john.getBonus());
  }  
}
