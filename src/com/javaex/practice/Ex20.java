package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
	        boolean numPlay = true;

	        while (numPlay) {
	            // 1부터 100 사이의 랜덤한 숫자 생성
	            int answer = (int)(Math.random() * 100) + 1;
	            System.out.println("====================================");
	            System.out.println("\t[숫자 맞추기 게임 Start!]");
	            System.out.println("====================================");

	            while (true) {
	                System.out.print(">>");
	                int guess = scanner.nextInt();

	                if (guess < answer) {
	                    System.out.println("더 높게");
	                } else if (guess > answer) {
	                    System.out.println("더 낮게");
	                } else {
	                    System.out.println("맞았습니다.");
	                    break;
	                }
	            }

	            System.out.print("게임을 종료하시겠습니까?(y/n) >>");
	            String input = scanner.next().toLowerCase();
	            if(input.equals("y")) {
	                numPlay = false;
	                System.out.println("====================================");
		            System.out.println("\t[숫자 맞추기 게임 End!]");
		            System.out.println("====================================");
	            }
	        }

	        scanner.close();
	    }

	

	}

