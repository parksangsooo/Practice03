package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		for(x=0; x<4; x++) {
			for(y=2; y>0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//		외부 for 루프 (x 루프): 변수 x를 0부터 시작하여 3까지 증가시키면서 총 4번 반복합니다. 
//		즉, x의 값은 0, 1, 2, 3에 대해 각각 한 번씩 반복됩니다. 
//		이 루프는 내부 루프의 실행이 끝날 때마다 새로운 줄을 출력하며, 다음 반복으로 넘어갑니다.
//
//		내부 for 루프 (y 루프): 각 외부 루프의 반복마다 변수 y는 2에서 시작하여 1까지 감소합니다.
//		따라서 y 루프는 각 외부 루프 반복마다 두 번 실행되어, *을 두 번 출력합니다. 
//		y는 2에서 시작해 1까지 감소하므로, y의 값은 각 내부 루프 반복에서 2, 1이 됩니다.
//
//		결과적으로, 외부 for 루프가 총 4번 반복되고, 각 반복마다 내부 for 루프는 **를 출력한 후 줄바꿈을 합니다.
//		이로 인해 총 4줄의 **가 출력됩니다.

	}

}
