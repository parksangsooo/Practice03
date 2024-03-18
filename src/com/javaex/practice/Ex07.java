package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 숫자까지 반복
			for(int j = 1; j <= i; j++) { // 1부터 현재 i 값까지 반복하여, 현재 행의 숫자(i)를 i번 만큼 출력
				System.out.print(i); // 현재 행의 숫자를 출력
			}
			System.out.println(); // 각 행이 끝날 때마다 줄바꿈
		}
		sc.close();
	}

}
