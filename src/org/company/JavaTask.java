package org.company;

public class JavaTask {
 
	 public static void main(String[]args) {
int n= 12321;
int i=0,j=0,a=n;
while(a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;
}
if (j==n) {
	System.out.println("its palindrome number");
}else {
	System.out.println("not palindrome");
}
}
}
