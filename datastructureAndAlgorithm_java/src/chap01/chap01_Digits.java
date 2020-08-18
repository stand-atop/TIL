package chap01;

import java.util.Scanner;

// 2자리의 양수(10-99)를 입력
public class chap01_Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력 : ");
			num = stdIn.nextInt();
		} while( num < 10 || num > 99);
		//}while( ! num >= 10 && num <= 99);
		//드모르간 법칙(De Morgan's laws) : 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다.
		
		System.out.println("변수 num의 값은 " + num + " 입니다.");
		
	}

}
