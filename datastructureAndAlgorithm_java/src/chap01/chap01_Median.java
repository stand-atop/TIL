package chap01;
import java.util.Scanner;

// 3���� �������� �Է��ϰ� �߾Ӱ��� ���� ���� ���

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
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.print("c�� �� : ");
		int c = stdIn.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");
		
	}

}
