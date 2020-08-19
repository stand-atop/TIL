package chap02;
import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값을 나타냄(랜덤 값)
public class chap02_MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {

		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		/*
		System.out.print("사람 수 : ");
		int num = stdIn.nextInt();
				
		int[] height = new int[num];
		*/
		
		// Q1. 키뿐만 아니라 사람 수도 난수로 생성
		System.out.println("사람의 수는 아래와 같습니다.");
		int num = rand.nextInt(101); //사람 수 랜덤
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num]; //사람의 수 만큼 배열 생성		
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90); //요소의 값 랜덤 입력
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + " 입니다.");
		
	}

}
