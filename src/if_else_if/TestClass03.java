package if_else_if;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		

//		시험 점수 3개를 입력받아 평균을 구하여 출력하고, 평균에 따라 등급 나누기
//		(90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 그 외에는 F)
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.println("국어 점수: ");
		kor = sc.nextInt();
		System.out.println("영어 점수: ");
		eng = sc.nextInt();
		System.out.println("수학 점수: ");
		math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avr = sum / 3.0;
		char ch;
		
		if (avr <= 100 && avr >= 90)	ch = 'A';
		else if (avr >= 80) 		ch = 'B';
		else if (avr >= 70) 		ch = 'C';
		else 						ch = 'F';
		
		System.out.println("성적은 " + ch);
		
		
		System.out.println("============================================");
		
//		문제 : 학생 A, B, C, D, E가 돌아가면서 청소를 한다. 
//		A가 1일, B가 2일, C가 3일, D가 4일, E가 5일, A가 6일...
//		총 30일까지 있는 것으로 생각하고 1 ~ 30까지의 값을 입력하면 그 날에 누가 청소를 하는지 출력하시오.
//		※입력한 값이 1보다 작고 30보다 크면 잘못 입력했다고 출력하도록 하기
	
		int day;
		
		System.out.println("날짜를 입력하세요: ");
		day = sc.nextInt();
		
		if (day < 1 || day > 30)	System.out.println("잘못 입력하셨습니다.");
		else if (day % 5 == 0)		System.out.println("당번 : E");	
		else if (day % 5 == 1)		System.out.println("당번 : A");
		else if (day % 5 == 2)		System.out.println("당번 : B");
		else if (day % 5 == 3)		System.out.println("당번 : C");
		else if (day % 5 == 4)		System.out.println("당번 : D");
		
		
		System.out.println("===============================================");
//		수를 입력받고 윤년을 구하시오
//		(4의 배수=윤년, 4의 배수 중 100의 배수는 =평년, 
//		100의 배수이면서 400의 배수는 윤년, 나머지는 평년)
		
		int year;
		
		System.out.println(">>> ");
		year = sc.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("윤년");
		}else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}
}
