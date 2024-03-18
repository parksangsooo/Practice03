package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
		
//		변수 초기화: int i = 1;는 변수 i를 1로 초기화하고, 
//		boolean flag = true;는 flag 변수를 true로 설정하여 while 루프를 제어하는 데 사용됩니다.
//
//		while 루프: while(flag) 루프는 flag 변수의 값이 true인 동안 반복됩니다.
//
//		if 조건문: 루프 내부에서 if(i>=5) 조건문을 통해 i의 값이 5 이상이 되는 순간 flag 변수를 false로 설정합니다. 
//		이는 루프를 종료시키기 위한 조건입니다.
//
//		출력 및 증가: System.out.println(i);는 현재 i의 값을 출력하고, i=i+1;은 i의 값을 1 증가시킵니다.
//
//		루프 종료 조건: i의 값이 5에 도달했을 때 flag가 false로 설정되어 다음 반복에서 while 루프가 종료됩니다.
//		그러나 중요한 점은 i가 5에 도달했을 때도 System.out.println(i);가 실행되어 i의 값이 5인 경우도 출력된다는 것입니다.
//		따라서, 1부터 5까지의 숫자가 각각 새로운 줄에 출력됩니다.
//
//		코드의 로직은 i를 1부터 시작하여 1씩 증가시키면서, i가 5 이상이 될 때까지 숫자를 출력하고 있습니다.
//		i가 5 이상인 경우에 flag를 false로 설정하여 루프를 종료시킵니다. 
//		따라서, 1부터 5까지의 숫자가 출력된 후 프로그램이 종료됩니다.

	}

}
