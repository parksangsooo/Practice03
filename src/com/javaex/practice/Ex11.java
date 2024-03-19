package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다
//		-예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 )
//		b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다
//		예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
				
		int input = sc.nextInt();
		int sum = 0;
		
		if(input % 2 == 0) { // 짝수
			for(int i = 2; i <= input; i+=2) { // 짝수기 때문에 2부터 시작
				sum += i;
			}				
			}else { //홀수
			for(int i = 1; i<= input; i+=2)	{ // 홀수기 때문에 1부터 시작
				sum += i;
			}
		}
		 System.out.println("결과값: " + sum);
		 sc.close();
	}

}
