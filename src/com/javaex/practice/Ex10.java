package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
       
		 System.out.print("숫자를 입력하세요.\n");
		 System.out.print("숫자: ");
		 int maxNumber = scanner.nextInt(); // 최대값 비교를 위해 첫 정수 입력받기
		 
		 // 4개의 정수 입력받기
       
        for (int i = 1; i <= 4; i++) {
           System.out.print("숫자: ");
           int currentNumber = scanner.nextInt();
           
            // 입력받은 수가 최대값보다 크면 최대값 갱신
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        // 가장 큰 수 출력
        System.out.println("최대값은 " + maxNumber + "입니다.");

        scanner.close();
	}

}
