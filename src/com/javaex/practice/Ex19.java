package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int bal = 0;
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1.예금| 2.출금| 3.잔고| 4. 종료");
			System.out.println("---------------------------");
			
			System.out.print("선택> ");
			int code = scan.nextInt();
		
		switch (code) {
		case 1: // 예금
			System.out.print("예금액> ");
			bal += scan.nextInt();
			break;
		case 2: // 출금
			System.out.print("출금액> ");
			int wit = scan.nextInt();
			if(wit <= bal) {
				bal -= wit;
			}
			break;
		case 3: // 잔고
			System.out.println("잔고액> "+bal);
			break;
		case 4: // 프로그램 종료
			System.out.println("프로그램 종료");
			return;
		default: // 다른 것 기입시에 출력
			System.out.println("다시 입력해 주세요.");
		}
		System.out.println();
		}
		
	}
}
