package chap02;

//배열의 복제
public class chap02_CloneArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //a를 복제. clone() 메소드
		
		b[3] = 0; // a를 복제한 b 요소 하나 변경
		
		int[] c = b;
		
		System.out.print("a = ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		System.out.print("\nb = ");
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
	}

}
