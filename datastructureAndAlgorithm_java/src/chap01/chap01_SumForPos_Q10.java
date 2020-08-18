package chap01;
import java.util.Scanner;

// a, b 두 정수를 입력하고 b-a를 출력
public class chap01_SumForPos_Q10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("두 정수의 차이를 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		int b;
		
		do {
			System.out.println("b의 값 : ");
			b = stdIn.nextInt();
			if(a > b) {
				System.out.println("a보다 큰 값을 입력하세요.");
			}
		}while (a > b);
		
		int result = b - a;
		
		System.out.println("b - a = " + result + "입니다."); 
		
	}

}
