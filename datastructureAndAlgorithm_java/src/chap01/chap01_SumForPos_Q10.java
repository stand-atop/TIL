package chap01;
import java.util.Scanner;

// a, b �� ������ �Է��ϰ� b-a�� ���
public class chap01_SumForPos_Q10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ������ ���̸� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		int b;
		
		do {
			System.out.println("b�� �� : ");
			b = stdIn.nextInt();
			if(a > b) {
				System.out.println("a���� ū ���� �Է��ϼ���.");
			}
		}while (a > b);
		
		int result = b - a;
		
		System.out.println("b - a = " + result + "�Դϴ�."); 
		
	}

}
