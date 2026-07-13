package com.abc;
import java.util.*;
public class new_triangle {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n= scanner.nextInt();
	
	for(int i=n;i>0;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
  }
};
