package chap01;
import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력

public class chap01_Median {

	static int med3(int a, int b, int c) {
		if( a >= b ) {
			if( b > c ) {
				return b; //A,B,F,G
			}else if ( a <= c ) {
				return a; //D,E,H
			}else {
				return c; //C
			}
		}else if ( a > c) {
			return a; //I
		}else if (b > c ) {
			return c; //J,K
		}else {
			return b; //L,M
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
		
	}

}
