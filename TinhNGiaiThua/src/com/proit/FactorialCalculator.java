package com.proit;

import java.util.Scanner;

public class FactorialCalculator {
	public int enterNumber() {
		Scanner sc= new Scanner(System.in);
		int num=1;
		do {
			System.out.println("nhap so lon hon 0");
			num= sc.nextInt();
			if (num<0) {
				System.out.println("vui long nhap lai");
			}
		} while (num<0);
		return num;
	}
	public int factorial(int n) {
		if (n==0) {
			return 1;
		}
		int f=1;
		for (int i = 1; i <=n; i++) {
			f*=i;
		}
		return f;
	}
	public static void main(String[] args) {
		FactorialCalculator obj= new FactorialCalculator();
		int num=obj.enterNumber();
		System.out.println("n= "+ num);
		int fact= obj.factorial(num);
		System.out.println("giai thua la: "+fact);
	}
}
