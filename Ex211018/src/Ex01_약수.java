import java.util.Scanner;

public class Ex01_약수 {

	public static void main(String[] args) {
		// 약수 : 배수의 반댓말. '그' 숫자로 나눴을때 나머지가 0이 되는 수.
		// 예) 8의 약수 : 1, 2, 4, 8
		
		// 8의 약수를 구하시오.
		
		// for문을 통해서 1부터 8까지 검사!
//		for(int i = 1; i<=8; i++) {
//			if(8 % i == 0) {
//				System.out.println(i);
//			}
			// i가 8의 약수인지 어떻게 알까?
			// 8이 i의 배수인지 어떻게 알까?
			// 16이 짝수인지(2의 배수인지) 어떻게 알았냐면
			// 16을 2로 나눠서 나머지가 0이면 -> 2의 배수이다.
//		}
		// 예를 들어 2가 8의 약수라면 2를 출력!
		
//		for(int i = 1; i<=8; i++) {
//			if(8 % i == 0) {
//				System.out.println(i);
//			}
//		}
		
		// 32의 약수 구하기
		
//		for(int i = 1; i <= 32; i++) {
//			if(32 % i ==0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// 스캐너를 통해서 정수를 입력
		// "정수를 입력하세요 : " 라는 문구가 출력
		// num이라는 변수에 정수 저장!
		// "num의 약수는 : "
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print(num+"의 약수는 : ");
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
