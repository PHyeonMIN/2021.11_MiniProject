package Model;

public class SurveyDTO {

	private int cnt=0;
	private String E;
	private String I;
	private String N;
	private String S;
	private String F;
	private String T;
	private String P;
	private String J;
	private int query=0;

	public SurveyDTO(int cnt) {
		this.cnt = cnt;
	}

	public int getCnt() {
		return cnt;
	}

	public String getE() {
		return E;
	}

	public String getI() {
		return I;
	}

	public String getN() {
		return N;
	}

	public String getS() {
		return S;
	}

	public String getF() {
		return F;
	}

	public String getT() {
		return T;
	}

	public String getP() {
		return P;
	}

	public String getJ() {
		return J;
	}

	public int getQuery() {
		return query;
	}

}
