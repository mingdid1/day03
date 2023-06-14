package if_else_if;

import java.util.Scanner;

public class TestClass05 {
	public static void main(String[] args) {
	
		
		// 2조
		
//		문제 1.
//		BMI 지수 구하기
//		BMI 지수의 계산식 -> BMI = 체중(kg) / (키(m) * 키(m))
//		BMI 지수에 따른 정보
//		      - 18.5 미만 : 저체중
//		      - 18.5 이상 ~ 23 미만 : 정상
//		      - 23 이상 ~ 25 미만 : 과체중
//		      - 25 이상 ~ 30 미만 : 비만
//		      - 30 이상 : 고도비만
//
//		체중, 키를 입력 받아서 BMI 지수를 구하고 저체중, 정상, 과체중, 비만 나타내기
//
//		예시
//		키를 입력하세요(cm단위)	170
//		몸무게를 입력하세요(kg)	50
//		17.301038062283737는 저체중입니다

		Scanner sc = new Scanner(System.in);
		int height;
		int weight;
		
		System.out.println("키 입력 >> ");
		height = sc.nextInt();
		System.out.println("몸무게 입력 >> ");
		weight = sc.nextInt();
		
		double bmi = weight / ((height * 0.01)*(height * 0.01));
		
		if (bmi >= 30) 			System.out.println(bmi + " 고도비만");
		else if (bmi >= 25) 	System.out.println(bmi + " 비만");
		else if (bmi >= 23) 	System.out.println(bmi + " 과체중");
		else if (bmi >= 18.5) 	System.out.println(bmi + " 정상");
		else 					System.out.println(bmi + " 저체중");
		
		
//		문제2.
//		** 가위바위보 게임 **
//		추가 개념 <랜덤수 구하기>
//		Math.random()
//		사용하면 0.0 에서 1 사이의 double 랜덤수를 얻을 수 있다
//		Math.random() * 숫자
//		: 입력한 숫자보다 작지만 무한히 가까운 수들이 만들어진다.
//		예시) Math.random() * 12
//		: 12보다 작지만 무한히 가까운 수들이 만들어 진다.
//		0.9 * 12 = 10.8
//		0.99 * 12 = 11.88
//		0.999 * 12 = 11.988
//		...
//		 == > (int) Math.random() * (최댓값-최소값+1) + 최소값
//		예시) 1 ~ 12까지의 랜덤 숫자 10가지 출력
//		(int) (Math.random() * (12-1+1)) + 1
//		→ (int) (Math.random() * 12) + 1
//		가위바위보 게임에서는 세개의 수 중 1가지의 랜덤숫자가 필요하므로
//		(int)(Math.random()*3)+1; 이런 식으로 나타낼 수 있다.
		
//		Q. 위의 랜덤함수를 이용해서 가위바위보 게임 만들기 
		
//		예시
//		=======가위 바위 보 게임 ======
//		가위(1), 바위(2), 보(3)중에 숫자 하나를 입력하세요
//
//		가위 바위 보! ==> 2
//		===========
//		비겼습니다
//		============

		int me;
		
		System.out.println("가위(1), 바위(2), 보(3)중에 숫자 하나를 입력하세요 >> ");
		me = sc.nextInt();
		
		int you = (int)(Math.random()*3)+1;
		if (me == you) {
			System.out.println("비겼습니다");
		}else if (me > you) {
			System.out.println("이겼습니다");
		}else {
			System.out.println("졌습니다");
		}
		
		
//		문제 3.
//		세자리수 정수를 입력 받아 그 정수의 백의자리,십의자리,일의자리가 같은지 판별하세요
//		 ex) 999 입력 -> 999는 백의자리,십의자리,일의자리 정수가 같습니다
//		 996 입력 -> 996은 백의자리,십의자리,일의자리 정수가 같지 않습니다.
		
		int num;
		
		System.out.println("세자리 수 입력 >>> ");
		num = sc.nextInt();
		
		int n1, n2, n3;
		
		n1 = num / 100;
		n2 = num % 100 / 10;
		n3 = num % 10;
		
		if (n1 == n2 && n1 == n3) {
			System.out.println("세자리의 수가 같습니다");
		}else {
			System.out.println("세자리의 수가 같지 않습니다");
		}
		
		
		
	}
}
