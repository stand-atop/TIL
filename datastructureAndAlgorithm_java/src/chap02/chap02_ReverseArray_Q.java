package chap02;

import java.util.Scanner;

public class chap02_ReverseArray_Q {

	//�迭��� a[idx1]�� a[idx2]�� ���� �ٲ� 
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//Q2. �迭 ��� ���� ���� ������ ��Ÿ���� ���α׷�
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {			
			System.out.println("a[" + i + "]��  a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
			swap(a, i, a.length - i - 1);	 //��ȯ
			for(int j = 0; j < a.length; j++) { 	//�迭���
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
	
	//Q3. �迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼ҵ�
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; 
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		//Q2. �迭 ��� ���� ���� ������ ��Ÿ���� ���α׷�
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();		
		reverse(x); 
				
		//Q3. �迭�� ��� ����� ��
		System.out.println("�迭�� ��� ����� ���� " + sumOf(x) + "�Դϴ�.");		
	}

}



