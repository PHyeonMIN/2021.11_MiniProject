package Controller;

import Model.CharacterDAO;
import Model.CharacterDTO;

public class CharacterCON {

	CharacterDAO dao = new CharacterDAO();
	CharacterDTO dto;
	int cnt = 0;
	
	
	
	
	
	// ĳ���� ����
	
	// ĳ���� 
	public void addNewC_CON(CharacterDTO dto) {
		int cnt = dao.addNewC(dto);
		if(cnt > 0) {
			System.out.println("ĳ���� ���� ����");
		}else {
			System.out.println("ĳ���� ���� ����");
		}
	}
	
	public void select_Con(String id) {
		
		cnt = dao.select(id);
		if(cnt > 0) {
			System.out.println(" ĳ���� ���� Ȯ�� "); 
		}else {
			System.out.println(" ĳ���Ͱ� �����ϴ�.");
		}
	}
	
	
	
	
	
}
