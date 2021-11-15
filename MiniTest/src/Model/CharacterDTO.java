package Model;

public class CharacterDTO {
	
	// 캐릭터 선택
	private String nick;
	private String id;
	private String type;
	private int g_chance;
	private int d_hp;
	private int c_age;
	private int ei;
	private int sn;
	private int tf;
	private int jp;
	
	SurveyDAO sdao = new SurveyDAO();
	
	public CharacterDTO(String id, String nick, String type) {
		this.nick = nick;
		this.type = type;
		this.id = id;
	}
	
	public CharacterDTO(String id, int d_hp, int g_chance) {
		this.id = id;
		this.d_hp = d_hp;
		this.g_chance = g_chance;
	}
	
	public CharacterDTO(String nick, int g_chance, int d_hp, int c_age, int ei, int sn, int tf, int jp, String type) {
		super();
		
		this.nick = nick;
		this.g_chance = g_chance;
		this.d_hp = d_hp;
		this.c_age = c_age;
		this.ei = ei;
		this.sn = sn;
		this.tf = tf;
		this.jp = jp;
		this.type = type;
	}
	
	public String getNick() {
		return nick;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public int getG_chance() {
		return g_chance;
	}

	public int getC_age() {
		
		return c_age;
	}

	public int getD_hp() {
		return d_hp;
	}

	public int getEi() {
		return ei;
	}

	public int getSn() {
		return sn;
	}

	public int getTf() {
		return tf;
	}

	public int getJp() {
		return jp;
	}

	
	

}
