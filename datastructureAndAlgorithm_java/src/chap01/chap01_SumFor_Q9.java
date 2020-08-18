package chap01;
import java.util.Scanner;

public class chap01_SumFor_Q9 {
//a, b 사이의 합을 구하시오
	static int sumof(int a, int b) {
		int sum = 0;
		if(a < b) {
			while( a <= b) {
				sum += a;
				
				a++;
			}
		}else if (a > b) {
			while(a >= b) {
				sum += b;
				
				b++;
			}
		}else {
			sum = a;
		}
		return sum;
	}
	
	/*답안지의 답
	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // 합
		for (int i = min; i <= max; i++)
			sum += i;
		return (sum);
	}
	*/
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.println("정수 a, b를 입력해주세요.");
		System.out.println("a : ");
		int a = stdIn.nextInt();
		System.out.println("b : ");
		int b = stdIn.nextInt();
		int sum = sumof(a, b);
		
		System.out.println(a + "와 " + b + " 사이의 합은 " + sum + " 입니다.");
	}

}








