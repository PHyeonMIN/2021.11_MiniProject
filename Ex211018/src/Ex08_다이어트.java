import java.util.Scanner;

public class Ex08_���̾�Ʈ {

	public static void main(String[] args) {
		
		// ��ĳ�ʸ� ���� �Է�
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.print("���� ������ : ");
		int cw = sc.nextInt(); // ���� �����Ը� �����ϴ� ����(current weight)
		System.out.print("��ǥ ������ : ");
		int gw = sc.nextInt(); // ��ǥ �����Ը� �����ϴ� ����(goal weight)
		// do-while���� �Ẹ��.
		// do{���๮��} while(���ǽ�);
	    int week = 1;
		do {
			System.out.print(week++ + "���� ���� ������ : ");
			
			int lw = sc.nextInt();
			cw -= lw; // cw = cw - lw; // ���� �����Ը� ����.
			
		}while(cw > gw);
		System.out.println(cw + "kg�޼�!! �����մϴ�!!");
		

	}

}
