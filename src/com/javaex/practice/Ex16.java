package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		int sum = 0; // 5의 배수의 합.
		int count = 0; // 5의 배수의 갯수
		
		// 5의 배수인지 확인. 갯수 세어야 함.
		
		for(int i = 5; i <= input; i += 5) {
			count++;
			sum += i;
		}
		System.out.println("5의배수 개수: " + count + "\n5의배수 합: " + sum);
        
        sc.close();
		}

}
