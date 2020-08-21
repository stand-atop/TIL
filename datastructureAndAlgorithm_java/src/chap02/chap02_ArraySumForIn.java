package chap02;

//배열의 모든 요소의 합을 구하여 출력(확장 for문)
public class chap02_ArraySumForIn {

	public static void main(String[] args) {

		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		double sum = 0; //합계
		
		// for문 확장 : for-in문, for-each문
		for(double i : a) { 
			sum += i; //i는 인덱스를 나타내는 것이 아닌 스캔 할 때 주목하고 있는 요소, 즉 double형 실수 값을 가리킴 = 배열의 길이를 몰라도 됨, iterater 같은 방법으로 스캔 가능
		}
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
		
	}

}
