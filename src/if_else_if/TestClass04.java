package if_else_if;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {

		//1조
		
//		#1
//		점수를 입력받아 등급을 출력하는 프로그램을 작성해보자.(if문 이용)
//		(단, 점수는 0~100점까지만 입력 가능하며, 그 외의 점수를 입력하면 “잘못된 입력”이라는 메시지 출력 후, 종료)
//		◈ [90점 이상 : A등급], [80점 이상 : B등급], [70점 이상 : C등급], [60점 이상 : D등급], [60점 미만 : F등급]
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.println("점수 입력: ");
		score = sc.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("잘못된 입력");
		}else if(score >= 90){
			System.out.println("A 등급");
		}else if(score >= 80){
			System.out.println("B 등급");
		}else if(score >= 70){
			System.out.println("C 등급");
		}else if(score >= 60){
			System.out.println("D 등급");
		}else {
			System.out.println("F 등급");
		}
		
//		#2
//		임의의 정수 2개를 입력받아 두 수를 비교하여 큰 수가 50을 초과하면 "최대 정수 입니다."를 출력하고 프로그램을 종료합니다.
//		초과하지 않는다면 바로 프로그램을 종료합니다.
//		조건1 : 단, IF문만 사용하며 딱 한 번만 사용해야 합니다. (else와 else if 사용 금지)
//		조건2 : 정수형 변수 2개 이외의 변수 선언은 불가합니다.

		int n1, n2;
		
		System.out.println("두 수 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if ((n1 > n2)?  (n1 > 50) : (n2 > 50)) {
				System.out.println("최대 정수 입니다");
		}
		
		
//		#3
//		최소 1시간 부터 최대 8시간까지 이용 가능한 카페가 있다.
//		이용시간 1시간당 요금은 10,000원 이며
//		3시간 이상 이용시 10% 할인, 5시간 이용시 20% 할인을 진행하고 있다.
//		이용시간에 따른 금액을 출력하시오.
//		(단, 가능하지 않은 이용 시간일 경우 가능한 이용시간을 알려주세요)
//		ex) 1시간 --> 10,000원/ 3시간 --> 27,000원/ 5시간 --> 40,000원/ 그 외 "잘못 입력" 출력
		
		int time;
		
		System.out.println("이용시간 >> ");
		time = sc.nextInt();
		
		if (time <= 8 && time >= 1) {
			if (time >= 5) {
				System.out.println("요금 : " + (time * 10000)*0.8);
			}else if (time >= 3) {
				System.out.println("요금 : " + (time * 10000)*0.9);
			}else {
				System.out.println("요금 : " + (time * 10000));
			}
		}else {
			System.out.println("이용시간은 1시간~8시간");
		}		
		
		
//		#4
//		포도, 사과, 오렌지, 딸기란 메뉴를 가진 음료자판기 만들기
//		포도(1) 선택시 "포도 음료가 나왔습니다." 출력
//		사과(2) 선택시 "사과 음료가 나왔습니다." 출력
//		오렌지(3) 선택시 "오렌지 음료가 나왔습니다." 출력
//		딸기(4) 선택시 "딸기 음료가 나왔습니다." 출력
//		없는 메뉴 선택 시 "메뉴에 없는 음료입니다." 출력
		
		int sel;
		String drink;
		
		System.out.println("메뉴 >> ");
		sel = sc.nextInt();
		
		if (sel == 1) {
			drink = "포도 음료가 나왔습니다.";
		}else if (sel == 2) {
			drink = "사과 음료가 나왔습니다.";
		}else if (sel == 3) {
			drink = "오렌지 음료가 나왔습니다.";
		}else if (sel == 4) {
			drink = "딸기 음료가 나왔습니다.";
		}else {
			drink ="메뉴에 없는 음료입니다";
		}
		System.out.println(drink);
		
	}
}
