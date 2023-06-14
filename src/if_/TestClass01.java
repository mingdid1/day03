package if_;

import java.util.Scanner;

public class TestClass01 {
	
	public static void main(String[] args) {
		/*
			if(조건식) {
				종속문장
			}
			다음문장
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.종료");
		System.out.println(">>> : ");
		num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("쉬운게임 실행");
		}
		if (num == 2) {
			System.out.println("어려운게임 실행");
		}
		if (num == 3) {
			System.out.println("게임 종료");
		}
		
	}
}
