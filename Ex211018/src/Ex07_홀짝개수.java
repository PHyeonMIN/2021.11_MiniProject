import java.util.Scanner;

public class Ex07_홀짝개수 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int num = 0; // 스캐너로부터 입력받은 정수를 저장하는 변수
		int odd = 0; // 홀수 개수를 저장하는 변수
		int even = 0; // 짝수 개수를 저장하는 변수
		
		while(num != -1) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			// 입력받은 숫자 num이 짝수라면 -> even 1증가
			// 홀수라면 -> odd가 1증가
			
			if(num % 2 == 0) {
				even++; // even += 1; // even = even + 1;
			}else {
				odd++;
			}
			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);
		}
		System.out.println("종료되었습니다.");
		
//		int num = 0;
//		
//		while(num != -1) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num % 2 == 0) {
//				System.out.println("짝수 개수 : " + num);
//			}else if (num % 2 == 1) {
//				System.out.println("홀수 개수 : " + num);
//			}
//		}
//		System.out.println("종료되었습니다.");

	}

}
