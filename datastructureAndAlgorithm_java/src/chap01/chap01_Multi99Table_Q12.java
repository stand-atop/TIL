package chap01;

//Q12, Q13. ����ǥ, ����ǥ
public class chap01_Multi99Table_Q12 {

	public static void main(String[] args) {
		//����ǥ
		System.out.println("����ǥ");
		System.out.print(" |");
		for(int k = 1; k <= 9; k++) {
			System.out.printf("%3d", k);
		}
		System.out.println();
		System.out.println("---+-------------------------");
		
		for(int i = 1; i <= 9 ; i++) {
			System.out.print(i + "|");
			for(int j = 1; j <= 9 ; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		//����ǥ
		System.out.println("����ǥ");
		System.out.print(" |");
		for(int k = 1; k <= 9; k++) {
			System.out.printf("%3d", k);
		}
		System.out.println();
		System.out.println("---+-------------------------");
		
		for(int i = 1; i <= 9 ; i++) {
			System.out.print(i + "|");
			for(int j = 1; j <= 9 ; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}

}
