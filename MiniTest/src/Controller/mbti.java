package Controller;

public class mbti {

	private int cnt =0;
	String[] MbtiQuery_E = new String[3];
	
	
	
	String[] Mbti = new String[4];
	
	public mbti(int num) {
		this.cnt=num;
	}
	
	
	public void Mbti_E() {
		MbtiQuery_E[0] = "�ݷ������� ��� ������ ������ �ϰ��������?\r\n" + 
							"1. ��å�ϱ� 2. ������ ���� �峭ġ��";
		
	}
	
	
	
	
	
	
	public int getCnt() {
		return cnt;
	}
	
	
	
	
	
	
	
	
}
