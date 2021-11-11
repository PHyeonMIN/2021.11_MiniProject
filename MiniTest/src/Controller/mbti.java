package Controller;

public class mbti {

	private int cnt =0;
	String[] MbtiQuery_E = new String[3];
	
	
	
	String[] Mbti = new String[4];
	
	public mbti(int num) {
		this.cnt=num;
	}
	
	
	public void Mbti_E() {
		MbtiQuery_E[0] = "반려동물과 놀고 싶을때 무엇을 하고싶은가요?\r\n" + 
							"1. 산책하기 2. 집에서 같이 장난치기";
		
	}
	
	
	
	
	
	
	public int getCnt() {
		return cnt;
	}
	
	
	
	
	
	
	
	
}
