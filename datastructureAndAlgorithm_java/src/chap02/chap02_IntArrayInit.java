package chap02;
// ���� �ڷ����� int���� �迭(������ڼ��� 5: �迭 �ʱ��ڿ� ���� ����)

public class chap02_IntArrayInit {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5}; //�迭 �ʱ��ڿ� ���� ����
		
		for(int i = 0; i < a.length; i ++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}

}
