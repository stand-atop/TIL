package chap01;

import java.util.Scanner;

// 2�ڸ��� ���(10-99)�� �Է�
public class chap01_Digits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		do {
			System.out.println("�Է� : ");
			num = stdIn.nextInt();
		} while( num < 10 || num > 99);
		//}while( ! num >= 10 && num <= 99);
		//��𸣰� ��Ģ(De Morgan's laws) : �� ������ �����ϰ� ������ ��������, ������ �������� �ٲٰ� �ٽ� ��ü�� �����ϸ� ������ ���ǰ� ����.
		
		System.out.println("���� num�� ���� " + num + " �Դϴ�.");
		
	}

}
