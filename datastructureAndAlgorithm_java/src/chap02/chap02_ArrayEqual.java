package chap02;
import java.util.Scanner;

//두 배열이 같은가
public class chap02_ArrayEqual {

	//두 배열 a,b의 모든 요소가 같은가
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) { //두 배열의 갯수가 같지 않다면
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {	//두 배열의 요소가 같지 않다면
				return false;
			}
		}
		return true;
	}
	
	//Q4. 배열 b의 모든 요소를 배열 a에 복사
	static void copy(int[] a, int[] b) {
		a = b.clone();		
	}
	/* Q4. 답
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[i];
	}*/
	
	//Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사
	static void rcopy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[b.length-i-1];
		}
	}
	
	/* Q5. 답
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	} 
	 */
	
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt(); //배열 a의 요솟수 입력
		
		int[] a = new int[na]; //요솟수가 na인 배열
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요솟수: ");
		int nb = stdIn.nextInt(); //배열 b의 요솟수 입력
		
		int[] b = new int[nb]; //요솟수가 nb인 배열
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a,b) ? "같습니다." : "같지 않습니다."));
		
	}

}
