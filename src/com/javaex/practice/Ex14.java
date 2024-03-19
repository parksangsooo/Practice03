package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			sum += i;
			if(i<input) {
				System.out.print(i + "+");					
			}else {
				System.out.print(i);
			}
			
		}
		System.out.println();
		System.out.println("결과값: " + sum);
		sc.close();

	}

}
