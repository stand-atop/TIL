package chap02;

import java.util.Scanner;

// �迭 ����� �ִ�
public class chap02_MaxOfArray {

	//�迭 a�� �ִ��� ����
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i ++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.println("��� �� : ");
		int num = stdIn.nextInt(); //�迭�� ��ڼ��� �Է¹���
		
		int[] height = new int[num]; //��ڼ��� num�� �迭 ����
		
		for(int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] = ");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("�ִ��� " + maxOf(height) + " �Դϴ�.");
		
	}

}
