
public class Ex02_누적합 {

	public static void main(String[] args) {
		
		// 1부터 100까지 합을 구해주세요.
//	    int sum = 0;
//		
//		for(int i = 1; i<=100; i++) {
//			
//			// i가 1, 2, 3, 4, 5,  ..., 99, 100
//			// sum이라는 변수에 1부터 하나씩 누적해서 더해주면 된다.
//			sum += i; // sum = sum + i;
//			
//		}
//		System.out.println(sum);
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
