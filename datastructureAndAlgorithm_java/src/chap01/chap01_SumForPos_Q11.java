package chap01;
import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력
public class chap01_SumForPos_Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양의 정수 num 의 자릿수를 출력합니다.");
		int num;
		
		do {
			System.out.println("num 값 : ");
			num = stdIn.nextInt();
			
			if( num <= 0) {
				System.out.println("양의 정수 값을 입력하세요.");
			}
		}while( num <= 0);
		
		int length = (int)(Math.log10(num)+1); // int형 자릿수를 구하기 위해서는 math함수를 사용해야함
		
		System.out.println("num의 자릿수는 " + length + "입니다.");
		
	}

}
