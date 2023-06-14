package if_else_if;

public class TestClass01 {
	
	public static void main(String[] args) {
		/*
		 	if(조건식)
		 		종속문장
		 	else if(조건식)
		 		종속문장
		 	else if(조건식)
		 		종속문장
		 	   ....
		 	else
		 		종속문장
		 */
		int num = 150;
		if (num > 100)
		{
			System.out.println("100보다 크다");
		}else if (num > 70) {
			System.out.println("70보다 크다");
		}else if (num > 50) {
			System.out.println("50보다 크다");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음문장 실행");
	}
}

