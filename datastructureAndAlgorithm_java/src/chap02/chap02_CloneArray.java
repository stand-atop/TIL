package chap02;

//�迭�� ����
public class chap02_CloneArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //a�� ����. clone() �޼ҵ�
		
		b[3] = 0; // a�� ������ b ��� �ϳ� ����
		
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
