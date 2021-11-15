package Controller;

import Model.CharacterDAO;
import Model.CharacterDTO;

public class CharacterCON {

	CharacterDAO dao = new CharacterDAO();
	CharacterDTO dto;
	int cnt = 0;
	
	
	
	
	
	// 캐릭터 생성
	
	// 캐릭터 
	public void addNewC_CON(CharacterDTO dto) {
		int cnt = dao.addNewC(dto);
		if(cnt > 0) {
			System.out.println("캐릭터 생성 성공");
		}else {
			System.out.println("캐릭터 생성 실패");
		}
	}
	
	public void select_Con(String id) {
		
		cnt = dao.select(id);
		if(cnt > 0) {
			System.out.println(" 캐릭터 상태 확인 "); 
		}else {
			System.out.println(" 캐릭터가 없습니다.");
		}
	}
	
	
	
	
	
}
