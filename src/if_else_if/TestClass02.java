package if_else_if;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, sum;
		System.out.println("커피 수량: ");
		n = sc.nextInt();
		
		if (n > 10) {
			sum = 20000 + (n-10) * 1500;
		}else {
			sum = n * 2000;
		}
		System.out.println("금액 : " + sum);
		
		System.out.println("===========================");
		int num;
		
		System.out.println("정수 입력: ");
		num = sc.nextInt();
		
		if (num == 0){
			System.out.println("잘못된 입력");
		}else if (num % 12 == 0) {
			System.out.println("3의 배수 , 4의 배수");
		}else if (num % 3 == 0) {
			System.out.println("3의 배수");
		}else if (num % 4 == 0) {
			System.out.println("4의 배수");
		}else {
			System.out.println("해당사항없음");
		}
	}
}
