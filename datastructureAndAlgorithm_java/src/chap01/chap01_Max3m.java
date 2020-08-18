package chap01;
//3���� ������ ��� �ִ��� ���Ͽ� ���

public class chap01_Max3m {
	
	// a, b, c�� �ִ��� ���Ͽ� ��ȯ��
	static int max3(int a, int b, int c) {
		int max = a; //�ִ�
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		return max;
	}
	
	// Q1. �� ���� �ִ��� ���ϴ� �޼ҵ�
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		return max;
		
	}
	
	// Q2. �� ���� �ּڰ��� ���ϴ� �޼ҵ�
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
	
	// Q2. �� ���� �ּڰ��� ���ϴ� �޼ҵ�
		static int min4(int a, int b, int c, int d) {
			int min = a;
			if(b < min) {
				min = b;
			}
			if(c < min) {
				min = c;
			}
			if(d < min) {
				min = d;
			}
			return min;
		}
	
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1)); //[A] a > b > c
		System.out.println("max3(3,2,2) = " + max3(3,2,2)); //[B] a > b = c
		System.out.println("max3(3,1,2) = " + max3(3,1,2)); //[C] a > c > b
		System.out.println("max3(3,2,3) = " + max3(3,2,3)); //[D] a = b > c
		System.out.println("max3(2,1,3) = " + max3(2,1,3)); //[E] c > a > b
		System.out.println("max3(3,3,2) = " + max3(3,3,2)); //[F] a = b > c
		System.out.println("max3(3,3,3) = " + max3(3,3,3)); //[G] a = b = c
		System.out.println("max3(2,2,3) = " + max3(2,2,3)); //[H] c > a = b
		System.out.println("max3(2,3,1) = " + max3(2,3,1)); //[I] b > a > c
		System.out.println("max3(2,3,2) = " + max3(2,3,2)); //[J] b > a = c
		System.out.println("max3(1,3,2) = " + max3(1,3,2)); //[K] b > c > a
		System.out.println("max3(2,3,3) = " + max3(2,3,3)); //[L] b = c > a
		System.out.println("max3(1,2,3) = " + max3(1,2,3)); //[M] c > b > a
		
	}
	
}
