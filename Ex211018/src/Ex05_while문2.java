import java.util.Scanner;

public class Ex05_while문2 {

	public static void main(String[] args) {
		
		// while문  : 반복횟수가 정해지지 않았을 때 사용.
		
		//키보드로부터 일력 받은 정수가 10보다 작을 때만 계속 입력받아라.
		// 10이상 즉, 두 자리수를 입력받으면 "종료되었습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num < 10) {
			
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
