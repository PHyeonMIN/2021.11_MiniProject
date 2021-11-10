import java.util.Scanner;

public class Ex06_누적결과 {

	public static void main(String[] args) {
		
		// 숫자를 입력 받아 누적하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 누적값을 담을 변수.
		int num = 0; // 입력받는 숫자를 담을 변수.
		
		// while문 : 코드 반복 횟수를 모를 때 사용하는 반복문
		
		// -1이 아닌 경우에는 while문이 계속 동작.
		while(num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			// sum이라는 변수에 입력받은 num을 누적해서 더해주자.
			sum += num; // sum = sum + num;
			// sum을 출력해주자.
			System.out.println("누적 결과 : " + sum);
		}
		System.out.println("종료되었습니다.");
		
//		int i = 0;
//		while(i > -1) {
//			System.out.print("숫자 입력 : ");
//			i = sc.nextInt();
//			int sum = 0;
//			sum += i;
//			System.out.println("누적 결과 : " + sum);
//		}
//		System.out.println("종료되었습니다.");

	}

}
