package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		외부 for 루프 (x 루프): 변수 x를 0부터 시작하여 3까지 증가시키면서 총 4번 반복합니다.
//		즉, x는 0, 1, 2, 3의 값을 갖게 됩니다. 이 루프는 내부 루프가 전체 실행된 후, 새로운 줄(\n)을 출력하며 다음 반복으로 넘어갑니다.
//
//		내부 for 루프 (y 루프): 각 외부 루프의 반복마다, 
//		변수 y는 0부터 시작하여 1까지 증가시키면서 총 2번 반복합니다.
//		즉, y는 0, 1의 값을 갖게 됩니다. 이 루프는 *을 출력하며, y 루프의 각 반복마다 옆으로 *을 하나씩 추가합니다. 따라서, 내부 루프는 각 외부 루프의 반복마다 **를 출력합니다.
//
//		결과적으로, 외부 for 루프가 총 4번 반복되고, 
//		각 반복마다 내부 for 루프는 **를 출력한 후 줄바꿈을 합니다. 
//		이로 인해 총 4줄의 **이 출력됩니다.
//
//		이 프로그램은 별표(*)를 사용하여 2열 4행의 직사각형 패턴을 생성합니다.
//		내부 루프(y 루프)는 각 행에 별표를 몇 개 출력할지 결정하고, 
//		외부 루프(x 루프)는 총 몇 행이 될지를 결정합니다.

	}

}