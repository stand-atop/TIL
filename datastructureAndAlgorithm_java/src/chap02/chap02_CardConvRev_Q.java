package chap02;

import java.util.Scanner;

public class chap02_CardConvRev_Q {
	
	//Q6. 배열의 앞쪽에 아랫자리가 아닌 윗자리를 넣는 메서드
	static void cardConv(int x, int r) {
		char[] a = new char[36];
		int digits = 0; //자릿수
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
	
	//Q7. 기수 변환 과정을 나타냄
	static void cardCon(int x, int r) {
		char[] a = new char[36];
		int digits = 0; //자릿수
		int z = 0; //직전 x값
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			System.out.print(r + "|       " + x);
			if(z%r == 1) {
				System.out.println("      ···1");
			}else if(z%r == 0) {
				System.out.println("      ···0");
			}else {
				System.out.println();
			}
			System.out.println(" + --------");
			if(x-r < 0) {
				System.out.println("         0       ···" + x);
			}
			
			a[digits++] = dchar.charAt( x % r );
			z = x;
			x /= r; 
		}while(x != 0);

		
		System.out.print(r + "진수로 ");
		for(int i = digits-1; i >= 0; i--) {
			System.out.print(a[i]);
		}		
		System.out.println("입니다.");
		
	}
	
	public static void main(String[] args) {
		cardConv(59,2);
		System.out.println("----------------");
		
		//Q7. 기수 변환 과정을 나타냄
		Scanner stdIn = new Scanner(System.in);
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환 후의 자릿 수
		int retry; //다시
		char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			//양의 정수 입력 받음
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while(no < 0); //정수가 0보다 작을 때 반복
			
			//2~36의 진수를 입력받음
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36) : ");
				cd = stdIn.nextInt();
			}while(cd < 2 || cd > 36);
			
			
			cardCon(no, cd);
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
			retry = stdIn.nextInt();
			
		}while(retry == 1);
		
		
	}

}
