import java.util.Scanner;

public class Ex01_��� {

	public static void main(String[] args) {
		// ��� : ����� �ݴ�. '��' ���ڷ� �������� �������� 0�� �Ǵ� ��.
		// ��) 8�� ��� : 1, 2, 4, 8
		
		// 8�� ����� ���Ͻÿ�.
		
		// for���� ���ؼ� 1���� 8���� �˻�!
//		for(int i = 1; i<=8; i++) {
//			if(8 % i == 0) {
//				System.out.println(i);
//			}
			// i�� 8�� ������� ��� �˱�?
			// 8�� i�� ������� ��� �˱�?
			// 16�� ¦������(2�� �������) ��� �˾ҳĸ�
			// 16�� 2�� ������ �������� 0�̸� -> 2�� ����̴�.
//		}
		// ���� ��� 2�� 8�� ������ 2�� ���!
		
//		for(int i = 1; i<=8; i++) {
//			if(8 % i == 0) {
//				System.out.println(i);
//			}
//		}
		
		// 32�� ��� ���ϱ�
		
//		for(int i = 1; i <= 32; i++) {
//			if(32 % i ==0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// ��ĳ�ʸ� ���ؼ� ������ �Է�
		// "������ �Է��ϼ��� : " ��� ������ ���
		// num�̶�� ������ ���� ����!
		// "num�� ����� : "
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.print(num+"�� ����� : ");
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
