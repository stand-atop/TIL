package chap01;

//����ǥ ���
public class chap01_Multi99Table {

	public static void main(String[] args) {

		System.out.println("-----����ǥ-----");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
		
	}

}
