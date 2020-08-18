package chap01;

public class chap01_median_Q4 {
	static int med3(int a, int b, int c) {
		int med = a;
		if(a >= b) {
			if(b >= c) {
				med = b;
			}else if(a <= c) {
				return med;
			}else {
				med = c;
			}
		}else if(a > c) {
			return med;
		}else if(b > c) {
			med = c;
		}else {
			med = b;
		}
		return med;
	}
	
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1)); //[A] a > b > c
		System.out.println("med3(3,2,2) = " + med3(3,2,2)); //[B] a > b = c
		System.out.println("med3(3,1,2) = " + med3(3,1,2)); //[C] a > c > b
		System.out.println("med3(3,2,3) = " + med3(3,2,3)); //[D] a = b > c
		System.out.println("med3(2,1,3) = " + med3(2,1,3)); //[E] c > a > b
		System.out.println("med3(3,3,2) = " + med3(3,3,2)); //[F] a = b > c
		System.out.println("med3(3,3,3) = " + med3(3,3,3)); //[G] a = b = c
		System.out.println("med3(2,2,3) = " + med3(2,2,3)); //[H] c > a = b
		System.out.println("med3(2,3,1) = " + med3(2,3,1)); //[I] b > a > c
		System.out.println("med3(2,3,2) = " + med3(2,3,2)); //[J] b > a = c
		System.out.println("med3(1,3,2) = " + med3(1,3,2)); //[K] b > c > a
		System.out.println("med3(2,3,3) = " + med3(2,3,3)); //[L] b = c > a
		System.out.println("med3(1,2,3) = " + med3(1,2,3)); //[M] c > b > a
	}

}
