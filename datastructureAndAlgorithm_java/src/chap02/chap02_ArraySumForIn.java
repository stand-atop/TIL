package chap02;

//�迭�� ��� ����� ���� ���Ͽ� ���(Ȯ�� for��)
public class chap02_ArraySumForIn {

	public static void main(String[] args) {

		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		double sum = 0; //�հ�
		
		// for�� Ȯ�� : for-in��, for-each��
		for(double i : a) { 
			sum += i; //i�� �ε����� ��Ÿ���� ���� �ƴ� ��ĵ �� �� �ָ��ϰ� �ִ� ���, �� double�� �Ǽ� ���� ����Ŵ = �迭�� ���̸� ���� ��, iterater ���� ������� ��ĵ ����
		}
		
		System.out.println("��� ����� ���� " + sum + "�Դϴ�.");
		
	}

}
