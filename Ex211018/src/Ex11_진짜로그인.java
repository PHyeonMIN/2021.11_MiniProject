import java.util.Scanner;

public class Ex11_��¥�α��� {

	public static void main(String[] args) {
		
		// ��ĳ�ʸ� ���
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("id�� �Է����ּ��� : ");
//		String id = sc.next(); // �ܼ�â���� ������ ���� ���ڿ��� �о�´�.
//		// id�� ���� Hello���
//		// �α��� ����! ���
//		// id�� Hello�� �ƴ϶��
//		// �α��� ����!! ���
//		
//		if(id.equals("Hello")) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
//		System.out.print("id�� �Է����ּ��� : ");
//		String id = sc.next();
//		System.out.print("��й�ȣ : ");
//		String pw = sc.next();
//		
//		if(id.equals("Hello") && pw.contentEquals("1234")) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
//		System.out.print("id�� �Է����ּ��� : ");
//		String id = sc.next();
//		System.out.print("��й�ȣ : ");
//		String pw = sc.next();
//		
//		if(id.equals("Hello") && pw.contentEquals("1234")) {
//			System.out.println("�α��� ����");
//		}else if(id != "Hello" && pw != "1234"){
//			System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
//		}
		
//		while(true) {
//			System.out.print("id�� �Է����ּ��� : ");
//			String id = sc.next();
//			System.out.print("��й�ȣ : ");
//			String pw = sc.next();
//			
//			if(id.equals("Hello") && pw.equals("1234")) {
//				System.out.println("�α��� ����");
//				break;
//			}else {
//				System.out.println("���̵�� ��й�ȣ�� �ٸ��ϴ�.");
//			}
//		}
//		
//		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
		while(true) {
			System.out.print("id�� �Է����ּ��� : ");
			String id = sc.next();
			System.out.print("��й�ȣ : ");
			String pw = sc.next();
			
			if(id.equals("Hello") && pw.equals("1234")) {
				System.out.println("�α��� ����");
				break;
			}else {
				System.out.println("���̵�� ��й�ȣ�� �ٸ��ϴ�.");
				System.out.print("��� �Ͻðڽ��ϱ�? (Y/N) >> ");
				String yn = sc.next();
				if(yn.equals("Y")) {
					
				}else {
					System.out.println("����");
				break;
				}
			}
				}
			}
		}
		


