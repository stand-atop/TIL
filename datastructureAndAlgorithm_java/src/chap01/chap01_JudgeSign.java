package chap01;
import java.util.Scanner;
// �Է��� �������� ������� �������� 0���� �Ǵ�

public class chap01_JudgeSign {
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int n = stdIn.nextInt();
		/*
		if(n > 0) {
			System.out.println("�� ���� ����Դϴ�.");
		}else if(n < 0) {
			System.out.println("�� ���� ���� �Դϴ�.");
		}else {
			System.out.println("�� ���� 0�Դϴ�.");
		}
		*/
		
		if(n == 1) {
			System.out.println("�� ���� 1 �Դϴ�.");
		}else if(n == 2) {
			System.out.println("�� ���� 2 �Դϴ�.");
		}else if(n == 3) {
			System.out.println("�� ���� 3 �Դϴ�.");
		}else
			; //���鹮 - �ƹ��͵� �������� �ʴ� ����
	}

}
