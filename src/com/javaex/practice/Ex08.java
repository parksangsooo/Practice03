package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 구구단의 각 단을 출력합니다.
		for(int i = 1; i <= 9; i++) { // 1부터 9까지의 각 수에 대하여
            for(int j = 2; j <= 9; j++) { // 1부터 9까지 곱하는 수
                System.out.print(j + "*" + i + "=" + (i * j) + "\t"); // 가로로 출력
            }
            System.out.println(); // 각 단이 끝나면 줄바꿈
        }
    }
}