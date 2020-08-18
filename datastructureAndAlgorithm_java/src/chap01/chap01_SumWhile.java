package chap01;
import java.util.Scanner;

public class chap01_SumWhile {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0; //합
		
		/*
		int i = 1;
		while(i <= n) { // i가 n보다 작거나 같으면 반복
			sum += i; // sum에 i를 더함
			i++; // i값을 1씩 증가
		}
		*/
		int i;
		for(i = 1; i <= n ; i++ ) {
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		// Q6. System.out.println("i의 값은 " + i + "입니다.");

	}

}
