package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = scan.nextInt();
		
		for(int i = 1; i <= input; i++){
			if(input % i == 0){
		    	System.out.println(i + "는 약수 입니다.");
		    }
		}
		scan.close();
	}

}
