package if_;

import java.util.Scanner;

public class TestClass04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("수 입력: ");
		num = sc.nextInt();
		
		if (num % 3 == 0 ) {
			System.out.println(num + "은 3의 배수이다");
		}
		else {
			System.out.println(num + "은 3의 배수가 아니다");
		}
		
		
		System.out.println("========================");
		int n1, n2, n3;
		
		System.out.println("세 수 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		System.out.print("제일 큰 수: ");
		if (n1 > n2 && n1 >n3) {
			System.out.println(n1);
		}
		if (n2 > n1 && n2 >n3) {
			System.out.println(n2);
		}
		if (n3 > n1 && n3 >n2) {
			System.out.println(n3);
		}
		
//	   if( n1 > n2 ) {
//	      max =  n1;
//	   }
//	   if( n2 > n1 ) {
//	      max =  n2;
//	   }
//	   if( n3 > max ) {
//	      max = n3;
//	   }
//	   System.out.println( "max : "+max);
//	   
//	   if(n1 > n2 && n1 > n3) {
//	      System.out.println( n1 );
//	   }
//	   if( n2 > n1 && n2 > n3) {
//	      System.out.println( n2 );
//	   }
//	   if( n3 > n1 && n3 > n2) {
//	      System.out.println( n3 );
//	   }
	
		System.out.println("========================");
		
		int num1, num2;
		
		System.out.println("두 수 입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 > num2 && num1 % 2 == 0) {
			System.out.println(num1 + "(이)가 큰수이며 짝수이다");
		}
		if (num2 > num1 && num2 % 2 == 0) {
			System.out.println(num2 + "(이)가 큰수이며 짝수이다");
		}
		else {
			System.out.println("홀수");
		}
		
		
		
	}
}
