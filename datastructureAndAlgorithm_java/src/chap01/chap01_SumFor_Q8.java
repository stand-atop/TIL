package chap01;
import java.util.Scanner;

//���콺�� ����
public class chap01_SumFor_Q8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		int sum = (1 + n) * ( n / 2 ) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		//���콺 ������ Ȧ��/¦�� ���ο� ���� ����� �ٲ�, int�� ������ ���
		
		System.out.println(sum);
	}

}
