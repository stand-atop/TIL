package chap01;
import java.util.Scanner;

public class chap01_SumWhile {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0; //��
		
		/*
		int i = 1;
		while(i <= n) { // i�� n���� �۰ų� ������ �ݺ�
			sum += i; // sum�� i�� ����
			i++; // i���� 1�� ����
		}
		*/
		int i;
		for(i = 1; i <= n ; i++ ) {
			sum += i;
		}

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		// Q6. System.out.println("i�� ���� " + i + "�Դϴ�.");

	}

}
