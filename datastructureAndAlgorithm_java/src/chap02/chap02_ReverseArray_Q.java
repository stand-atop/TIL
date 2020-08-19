package chap02;

import java.util.Scanner;

public class chap02_ReverseArray_Q {

	//배열요소 a[idx1]과 a[idx2]의 값을 바꿈 
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//Q2. 배열 요소 역순 정렬 과정을 나타내는 프로그램
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {			
			System.out.println("a[" + i + "]와  a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1);	 //교환
			for(int j = 0; j < a.length; j++) { 	//배열출력
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	//Q3. 배열 a의 모든 요소의 합계를 구하여 반환하는 메소드
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; 
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		//Q2. 배열 요소 역순 정렬 과정을 나타내는 프로그램
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();		
		reverse(x); 
				
		//Q3. 배열의 모든 요소의 합
		System.out.println("배열의 모든 요소의 합은 " + sumOf(x) + "입니다.");		
	}

}



