
public class Ex03_약수2 {

	public static void main(String[] args) {
		
		// 코드 효율을 위한 tip
		// 1부터 32까지 약수를 구하고자 함
		
		for(int i = 1; i<=16; i++) {
			
			// i가 32의 약수인지 검사.
			// 32가 i의 배수인지 검사.
			
			if(32 % i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(32);

	}

}
