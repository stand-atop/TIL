package chap02;
import java.util.Scanner;

//�� �迭�� ������
public class chap02_ArrayEqual {

	//�� �迭 a,b�� ��� ��Ұ� ������
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) { //�� �迭�� ������ ���� �ʴٸ�
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {	//�� �迭�� ��Ұ� ���� �ʴٸ�
				return false;
			}
		}
		return true;
	}
	
	//Q4. �迭 b�� ��� ��Ҹ� �迭 a�� ����
	static void copy(int[] a, int[] b) {
		a = b.clone();		
	}
	/* Q4. ��
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[i];
	}*/
	
	//Q5. �迭 b�� ��� ��Ҹ� �迭 a�� �������� ����
	static void rcopy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[b.length-i-1];
		}
	}
	
	/* Q5. ��
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	} 
	 */
	
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = stdIn.nextInt(); //�迭 a�� ��ڼ� �Է�
		
		int[] a = new int[na]; //��ڼ��� na�� �迭
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ�: ");
		int nb = stdIn.nextInt(); //�迭 b�� ��ڼ� �Է�
		
		int[] b = new int[nb]; //��ڼ��� nb�� �迭
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 a�� b�� " + (equals(a,b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		
	}

}
