import java.util.Scanner;

public class Ex07_Ȧ¦���� {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int num = 0; // ��ĳ�ʷκ��� �Է¹��� ������ �����ϴ� ����
		int odd = 0; // Ȧ�� ������ �����ϴ� ����
		int even = 0; // ¦�� ������ �����ϴ� ����
		
		while(num != -1) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			
			// �Է¹��� ���� num�� ¦����� -> even 1����
			// Ȧ����� -> odd�� 1����
			
			if(num % 2 == 0) {
				even++; // even += 1; // even = even + 1;
			}else {
				odd++;
			}
			System.out.println("¦�� ���� : " + even);
			System.out.println("Ȧ�� ���� : " + odd);
		}
		System.out.println("����Ǿ����ϴ�.");
		
//		int num = 0;
//		
//		while(num != -1) {
//			System.out.print("���� �Է� : ");
//			num = sc.nextInt();
//			if(num % 2 == 0) {
//				System.out.println("¦�� ���� : " + num);
//			}else if (num % 2 == 1) {
//				System.out.println("Ȧ�� ���� : " + num);
//			}
//		}
//		System.out.println("����Ǿ����ϴ�.");

	}

}
