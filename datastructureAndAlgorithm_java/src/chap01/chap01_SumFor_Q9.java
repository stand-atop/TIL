package chap01;
import java.util.Scanner;

public class chap01_SumFor_Q9 {
//a, b ������ ���� ���Ͻÿ�
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
	
	/*������� ��
	static int sumof(int a, int b) {
		int min; // a, b�� ���� ���� ��
		int max; // a, b�� ū ���� ��

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // ��
		for (int i = min; i <= max; i++)
			sum += i;
		return (sum);
	}
	*/
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���մϴ�.");
		System.out.println("���� a, b�� �Է����ּ���.");
		System.out.println("a : ");
		int a = stdIn.nextInt();
		System.out.println("b : ");
		int b = stdIn.nextInt();
		int sum = sumof(a, b);
		
		System.out.println(a + "�� " + b + " ������ ���� " + sum + " �Դϴ�.");
	}

}








