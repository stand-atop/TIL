package chap01;
import java.util.Scanner;

//가우스의 덧셈
public class chap01_SumFor_Q8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		int sum = (1 + n) * ( n / 2 ) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		//가우스 덧셈은 홀수/짝수 여부에 따라 산식이 바뀜, int는 정수만 계산
		
		System.out.println(sum);
	}

}
