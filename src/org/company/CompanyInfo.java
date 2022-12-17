package org.company;

public class CompanyInfo {
 public void companyName() {
	 System.out.println("Greens technology pvt ltd");
	 
 }
 public void companyId() {
	 System.out.println("100044");
 }
 public void companyAddress() {
	 System.out.println("Taramani");
	 
 }
 public static void main(String [] args) {
	 CompanyInfo ci = new CompanyInfo ();
	 ci.companyName();
	 ci.companyId();
	 ci.companyAddress();
 }
}
