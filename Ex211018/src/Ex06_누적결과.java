import java.util.Scanner;

public class Ex06_������� {

	public static void main(String[] args) {
		
		// ���ڸ� �Է� �޾� �����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // �������� ���� ����.
		int num = 0; // �Է¹޴� ���ڸ� ���� ����.
		
		// while�� : �ڵ� �ݺ� Ƚ���� �� �� ����ϴ� �ݺ���
		
		// -1�� �ƴ� ��쿡�� while���� ��� ����.
		while(num != -1) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			// sum�̶�� ������ �Է¹��� num�� �����ؼ� ��������.
			sum += num; // sum = sum + num;
			// sum�� ���������.
			System.out.println("���� ��� : " + sum);
		}
		System.out.println("����Ǿ����ϴ�.");
		
//		int i = 0;
//		while(i > -1) {
//			System.out.print("���� �Է� : ");
//			i = sc.nextInt();
//			int sum = 0;
//			sum += i;
//			System.out.println("���� ��� : " + sum);
//		}
//		System.out.println("����Ǿ����ϴ�.");

	}

}
