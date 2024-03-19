package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
				
		for(int i = num; i > 0; i--) { // num부터 시작해서 1까지 감소.
			for(int j = 0; j < i; j++) { // 각 줄에 해당하는 별의 개수만큼 별을 출력. i가 감소함에 따라 출력하는 별의 개수도 감소.
				System.out.print("*"); // 현재 행의 숫자를 출력
			}
			System.out.println(); // 각 행이 끝날 때마다 줄바꿈
			sc.close();
		}
	}

}
