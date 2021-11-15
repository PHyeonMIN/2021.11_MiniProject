package Model;

public class MBTI_DTO {
	private String id;
	private String mbti;
	private String mbtiinf;

	public MBTI_DTO(String id, String mbti, String mbtiinf) {
		super();
		this.id = id;
		this.mbti = mbti;
		this.mbtiinf = mbtiinf;
	}

	public String getId() {
		return id;
	}

	public String getMbti() {
		return mbti;
	}

	public String getMbtiinf() {
		return mbtiinf;

	}

}
