package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10행의 패턴 생성
        for (int row = 1; row <= 10; row++) {
            // 각 행에 대한 숫자 출력
            for (int col = row; col < row + 10; col++) {
                System.out.print(col + " ");
            }
            // 각 행이 끝나면 다음 줄로 넘어감
            System.out.println();
        }

	}

}
