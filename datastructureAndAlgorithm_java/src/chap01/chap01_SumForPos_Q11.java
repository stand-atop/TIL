package chap01;
import java.util.Scanner;

//���� ������ �Է��ϰ� �ڸ����� ���
public class chap01_SumForPos_Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ���� num �� �ڸ����� ����մϴ�.");
		int num;
		
		do {
			System.out.println("num �� : ");
			num = stdIn.nextInt();
			
			if( num <= 0) {
				System.out.println("���� ���� ���� �Է��ϼ���.");
			}
		}while( num <= 0);
		
		int length = (int)(Math.log10(num)+1); // int�� �ڸ����� ���ϱ� ���ؼ��� math�Լ��� ����ؾ���
		
		System.out.println("num�� �ڸ����� " + length + "�Դϴ�.");
		
	}

}
