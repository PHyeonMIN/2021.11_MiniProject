import java.util.Scanner;

public class Ex05_while��2 {

	public static void main(String[] args) {
		
		// while��  : �ݺ�Ƚ���� �������� �ʾ��� �� ���.
		
		//Ű����κ��� �Ϸ� ���� ������ 10���� ���� ���� ��� �Է¹޾ƶ�.
		// 10�̻� ��, �� �ڸ����� �Է¹����� "����Ǿ����ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num < 10) {
			
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}
		System.out.println("����Ǿ����ϴ�.");

	}

}
