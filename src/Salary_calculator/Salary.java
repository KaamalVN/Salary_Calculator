package Salary_calculator;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int weeks[]=new int[7];
		int total_hours=0;
		int Salary=0;
		for(int iterator=0;iterator<7;iterator++) {
			weeks[iterator]=scanner.nextInt();
			total_hours+=weeks[iterator];
		}
		Salary=total_hours*100;
		for(int iterator=0;iterator<7;iterator++) {
			if(weeks[iterator]>8) {
				Salary+=((weeks[iterator]-8)*15);
			}
		}
		if(total_hours>40) {
			Salary+=((total_hours-40)*25);
		}
		if(weeks[0]>0) {
			Salary+=(((weeks[0]*100)*50)/100);
		}
		if(weeks[6]>0) {
			Salary+=(((weeks[6]*100)*25)/100);
		}
		System.out.print(Salary);
		

	}

}
