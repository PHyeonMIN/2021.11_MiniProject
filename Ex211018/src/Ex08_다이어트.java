import java.util.Scanner;

public class Ex08_다이어트 {

	public static void main(String[] args) {
		
		// 스캐너를 통해 입력
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.print("현재 몸무게 : ");
		int cw = sc.nextInt(); // 현재 몸무게를 저장하는 변수(current weight)
		System.out.print("목표 몸무게 : ");
		int gw = sc.nextInt(); // 목표 몸무게를 저장하는 변수(goal weight)
		// do-while문을 써보자.
		// do{실행문장} while(조건식);
	    int week = 1;
		do {
			System.out.print(week++ + "주차 감량 몸무게 : ");
			
			int lw = sc.nextInt();
			cw -= lw; // cw = cw - lw; // 현재 몸무게를 조정.
			
		}while(cw > gw);
		System.out.println(cw + "kg달성!! 축하합니다!!");
		

	}

}
