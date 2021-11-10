
public class Ex09_무한반복문 {

	public static void main(String[] args) {
		
		// 무한반복문을 활용하여 1부터 100까지 출력.
		
		int i = 1;
		
		while(true) {
			
			System.out.print(i + " ");
			i++;
			
			// i가 101이면 while문을 종료.
			if(i == 101) {
				break; // whitch, for, while문을 빠져나오는 명령어
			}
		}
		
		
//        while(i <= 100) {
//			
//			System.out.print(i + " ");
//			i++;
//		}

	}

}
