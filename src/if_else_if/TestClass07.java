package if_else_if;

import java.util.Scanner;

public class TestClass07 {
	public static void main(String[] args) {
		
		// 5조
		
//		1. 성명, 점수(JAVA, PYTHON, 영어)를 입력하여 총점, 평균 점수, 평점를 구하시오. (성적표 출력하기)
//		EX)
//		----------------------------
//		성적 입력
//		----------------------------
//		성명 >> 김진수
//		JAVA >> 90
//		PYTHON >> 91
//		영어 >> 85
//		----------------------------
//		김진수 개발자 성적표
//		----------------------------
//		과목	점수
//		JAVA	90점
//		PYTHON	91점
//		영어	85점
//
//		총점	266점
//		평점	88.66666666666667점
//		학점	B+
//		----------------------------
//		※ 평균학점
//		95~100 A+
//		90~94 A
//		85~89 B+
//		80~84 B
//		75~79 C
//		60~74 D
//		0~59 F
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int java, python, eng;
		String rank;
		
		System.out.println("----------------------------");
		System.out.println("성적 입력");
		System.out.println("----------------------------");
		System.out.println("성명 >>");
		name = sc.next();
		System.out.println("JAVA >> ");
		java = sc.nextInt();
		System.out.println("PYTHON >> ");
		python = sc.nextInt();
		System.out.println("영어 >> ");
		eng = sc.nextInt();
		System.out.println("----------------------------");
		System.out.println(name + "개발자 성적표");
		System.out.println("----------------------------");
		System.out.println("과목 점수");
		System.out.println("JAVA	" + java + "점");
		System.out.println("PYTHON	" + python + "점");
		System.out.println("영어	" + eng + "점");
		System.out.println();

		int sum = java + python + eng;
		double avr = sum / 3.0;
		
		if (avr <= 100 && avr >= 95)	rank = "A+";
		else if (avr >= 90) 			rank = "A";
		else if (avr >= 85) 			rank = "B+";
		else if (avr >= 80) 			rank = "B";
		else if (avr >= 75) 			rank = "C";
		else if (avr >= 60) 			rank = "D";
		else 							rank = "F";
		
		System.out.println("총점 " + sum);
		System.out.println("평점 " + avr);
		System.out.println("학점 " + rank);
		System.out.println("----------------------------");
		
		
		
		
		System.out.println("================================================");
//		2. 커피 가격이 4000원인데 10잔이상 주문을 하면 10% 할인을 해준다고 할때 커피의 가격은?
		
		int coffee;
		
		System.out.println("커피 수량 >> ");
		coffee = sc.nextInt();
		
		int pay = coffee * 4000;
		
		if (coffee >= 10) {
			pay *= 0.9;
		}
		System.out.println("커피가격 >> " + pay);
		
		
		
		
		System.out.println("================================================");
//		3. 과일가게에서 사과, 복숭아, 포도를 판매합니다. 사과는 개당 1000원, 복숭아는 1200원, 포도는 1400원에 판매합니다. 
//		사과, 복숭아, 포도 중 어떤 과일을 살것인지 입력받고 과일을 입력받으면 해당 과일은 개당 얼마인지 출력하고 
//		몇 개를 살것인지 갯수를 입력받아 과일의 총 가격이 얼마인지 출력하세요.
//		(다른 과일을 입력받으면 "저희 가게는 사과, 복숭아, 포도만 판매합니다."를 출력하시오)

//		ex)
//		어떤 과일을 구매하시겠습니까? 1.사과 2.복숭아 3.포도
//		입력 >> 1
//		사과는 개당 1000원입니다.
//		몇 개 구매하시겠습니까? 10
//		총 가격은 10000원입니다.
		
		int sel, mon = 0, all, n;
		String fru = null;
		
		System.out.println("어떤 과일을 구매하시겠습니까?");
		System.out.println("입력 >> ");
		sel = sc.nextInt();
		
		if (sel != 4) {
			if (sel == 1) {
				fru = "사과";
				mon = 1000;
				
			}
			else if (sel == 2) {
				fru= "복숭아";
				mon = 1200;
			}
			else if (sel == 3) {
				fru = "포도";
				mon = 1400;
			}
			System.out.println(fru + "는 개당" + mon +"원입니다" );
		}
		else {
			System.out.println("저희 가게는 사과, 복숭아, 포도만 판매합니다.");
		}
		
		System.out.println("몇 개 구매하시겠습니까? ");
		n = sc.nextInt();
		
		System.out.println("총 가격은"+ (n * mon) +"원입니다.");

	}
}
