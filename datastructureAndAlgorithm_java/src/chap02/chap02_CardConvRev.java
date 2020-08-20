package chap02;

import java.util.Scanner;

// 입력 받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타냄
public class chap02_CardConvRev {

	//정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환함
	static int cardConvR(int x, int r, char[] d) {

		int digits = 0; //변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장, charAt(): 문자열에서 임의의 문자를 엑세스하기 위한 String클래스의 메소드
			x /= r; // 몫
		}while(x != 0); //정수 x(몫)가 0이거나 0이 아닐 때 반복함
		
		return digits;
	}
	
	public static void main(String[] args) {
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
			
			dno = cardConvR(no, cd, cno); //no를 cd진수로 변환
			
			System.out.print( cd + "진수로는 ");
			for(int i = dno-1; i >= 0; i--) { //윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
			retry = stdIn.nextInt();
			
		}while(retry == 1);
		
	}

}
