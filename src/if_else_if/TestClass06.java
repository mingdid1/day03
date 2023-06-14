package if_else_if;

import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		
		// 4조
		
//		✨ 1번 문제 
//		시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int score;
		char rank;
		
		System.out.println("점수 입력 : ");
		score = sc.nextInt();
		
		if (score <= 100 && score >= 90)	rank='A';
		else if (score >= 80) 				rank='B';
		else if (score >= 70) 				rank='C';
		else if (score >= 60)	 			rank='D';
		else								rank='F';
		
		System.out.println(rank);
		
		
		
//		✨ 2번 문제
//
//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
//		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		
//		입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//		출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

		int year;
		
		System.out.println(">>> ");
		year = sc.nextInt();
		
		if (year % 400 == 0) {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("1");
			}
		}else {
			System.out.println("0");
		}
		
		
//		✨ 3번 문제
//		세 개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램을 작성하세요. 단, if 문만을 사용하여 구현해야 합니다.
	
//		예시
//		입력 및 출력:
//		입력: 5, 9, 3
//		출력: 9
//
//		입력: 12, 12, 12
//		출력: 12
//
//		입력: -2, -10, -5
//		출력: -2

		int n1, n2, n3;
		
		System.out.println("세 수 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int max = n1;
		if (n2 > max)	max = n2;
		if (n3 > max) 	max = n3;
		
		
		System.out.println(max);

	}
}
