package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x = 1; x < num; x++) { // 두 번째 삼각형에 대한 반복문에서 x가 num에 도달하기 전에 반복문을 종료
			for(int y = 0; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}