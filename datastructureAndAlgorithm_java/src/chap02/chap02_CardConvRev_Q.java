package chap02;

import java.util.Scanner;

public class chap02_CardConvRev_Q {
	
	//Q6. �迭�� ���ʿ� �Ʒ��ڸ��� �ƴ� ���ڸ��� �ִ� �޼���
	static void cardConv(int x, int r) {
		char[] a = new char[36];
		int digits = 0; //�ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			a[digits++] = dchar.charAt( x % r );
			x /= r; 
		}while(x != 0);
		
		for(int i = digits-1; i >= 0; i--) {
			System.out.print(a[i]);
		}		
		System.out.println();
	}
	
	//Q7. ��� ��ȯ ������ ��Ÿ��
	static void cardCon(int x, int r) {
		char[] a = new char[36];
		int digits = 0; //�ڸ���
		int z = 0; //���� x��
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			System.out.print(r + "|       " + x);
			if(z%r == 1) {
				System.out.println("      ������1");
			}else if(z%r == 0) {
				System.out.println("      ������0");
			}else {
				System.out.println();
			}
			System.out.println(" + --------");
			if(x-r < 0) {
				System.out.println("         0       ������" + x);
			}
			
			a[digits++] = dchar.charAt( x % r );
			z = x;
			x /= r; 
		}while(x != 0);

		
		System.out.print(r + "������ ");
		for(int i = digits-1; i >= 0; i--) {
			System.out.print(a[i]);
		}		
		System.out.println("�Դϴ�.");
		
	}
	
	public static void main(String[] args) {
		cardConv(59,2);
		System.out.println("----------------");
		
		//Q7. ��� ��ȯ ������ ��Ÿ��
		Scanner stdIn = new Scanner(System.in);
		int no; //��ȯ�ϴ� ����
		int cd; //���
		int dno; //��ȯ ���� �ڸ� ��
		int retry; //�ٽ�
		char[] cno = new char[32]; //��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			//���� ���� �Է� ����
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdIn.nextInt();
			}while(no < 0); //������ 0���� ���� �� �ݺ�
			
			//2~36�� ������ �Է¹���
			do {
				System.out.print("� ������ ��ȯ�ұ��?(2~36) : ");
				cd = stdIn.nextInt();
			}while(cd < 2 || cd > 36);
			
			
			cardCon(no, cd);
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�) : ");
			retry = stdIn.nextInt();
			
		}while(retry == 1);
		
		
	}

}
