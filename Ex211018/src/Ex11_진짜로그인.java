import java.util.Scanner;

public class Ex11_진짜로그인 {

	public static void main(String[] args) {
		
		// 스캐너를 사용
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("id를 입력해주세요 : ");
//		String id = sc.next(); // 콘솔창에서 다음에 오는 문자열을 읽어온다.
//		// id가 만약 Hello라면
//		// 로그인 성공! 출력
//		// id가 Hello가 아니라면
//		// 로그인 실패!! 출력
//		
//		if(id.equals("Hello")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
//		System.out.print("id를 입력해주세요 : ");
//		String id = sc.next();
//		System.out.print("비밀번호 : ");
//		String pw = sc.next();
//		
//		if(id.equals("Hello") && pw.contentEquals("1234")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
//		System.out.print("id를 입력해주세요 : ");
//		String id = sc.next();
//		System.out.print("비밀번호 : ");
//		String pw = sc.next();
//		
//		if(id.equals("Hello") && pw.contentEquals("1234")) {
//			System.out.println("로그인 성공");
//		}else if(id != "Hello" && pw != "1234"){
//			System.out.println("아이디와 비밀번호가 잘못되었습니다.");
//		}
		
//		while(true) {
//			System.out.print("id를 입력해주세요 : ");
//			String id = sc.next();
//			System.out.print("비밀번호 : ");
//			String pw = sc.next();
//			
//			if(id.equals("Hello") && pw.equals("1234")) {
//				System.out.println("로그인 성공");
//				break;
//			}else {
//				System.out.println("아이디와 비밀번호가 다릅니다.");
//			}
//		}
//		
//		System.out.println("프로그램이 종료 되었습니다.");
		
		while(true) {
			System.out.print("id를 입력해주세요 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			if(id.equals("Hello") && pw.equals("1234")) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("아이디와 비밀번호가 다릅니다.");
				System.out.print("계속 하시겠습니까? (Y/N) >> ");
				String yn = sc.next();
				if(yn.equals("Y")) {
					
				}else {
					System.out.println("종료");
				break;
				}
			}
				}
			}
		}
		


