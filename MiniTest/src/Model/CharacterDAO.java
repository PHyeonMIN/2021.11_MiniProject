package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class CharacterDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	SurveyDAO sdao = new SurveyDAO();
	Random ran = new Random();
	int cnt = 0;

	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "nextlevel";
			String db_pw = "1234";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 새 캐릭터 생성
	public int addNewC(CharacterDTO dto) {
		int result = 0;
		try {
			connect();
			String id = dto.getId();
			String nick = dto.getNick();
			String type = dto.getType();
			String sql = "update character set nick = ?, type = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			psmt.setString(2, type);
			psmt.setString(3, id);
			cnt = psmt.executeUpdate();
			result++;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int select(String id) {
		int result = 0;
		connect();
		try {
			String sql = "select * from character where id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setNString(1, id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String nick = rs.getString(2);
				String type = rs.getString(3);
				int c_age = rs.getInt(4);
				int g_chance = rs.getInt(5);
				int d_hp = rs.getInt(6);
				int ei = rs.getInt(7);
				int sn = rs.getInt(8);
				int tf = rs.getInt(9);
				int jp = rs.getInt(10);
				System.out.println("닉네임\t캐릭터타입\t캐릭터나이\t성장기회\t일상체력\tEI\tSN\tTF\tJP");
				System.out.println(nick + "\t" + type + "\t" + c_age + "\t" + g_chance + "\t" + d_hp + "\t" + ei + "\t"
						+ sn + "\t" + tf + "\t" + jp);
//				System.out.printf("%s%s%d%d%d%d%d%d%d%n", nick, type, c_age, g_chance, d_hp, ei, sn, tf, jp);
				result++;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	// 놀아주기(성장기회 증가)
	public int hangout_chance(String id, int g_chance) {
		int result = 0;
//		int g_chance = sdao.Bring_G_life(id);
//		g_chance++;
		try {
			connect();

			String sql = "update character set g_chance = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, g_chance);
			psmt.setNString(2, id);
			cnt = psmt.executeUpdate();
			result++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	// 놀아주기(일상체력(체력 변동))
	public int hangout_hp(String id, int d_hp) {
		int result = 0;
//		int d_hp = sdao.Bring_hp(id);
//		int a = ran.nextInt(2);
//		if(a==0) {
//			d_hp =-10;
//		}else if(a==1) {
//			d_hp=-20;
//		}
		try {
			connect();

			String sql = "update character set d_hp = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, d_hp);
			psmt.setNString(2, id);
			cnt = psmt.executeUpdate();
			result++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String My_Character(String id) {
		String check = null;
		connect();
		try {
			String sql = "select nick from character where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setNString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				check = rs.getString(1);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;

	}

	public void c_age(String id, int c_age, int Q_cnt) {
		int result = 0;
		
		// System.out.println(Q_cnt);

		c_age = 10 + Q_cnt / 2;
		//System.out.println(c_age);
		connect();

		try {

			String sql = "update character set c_age =? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, c_age);
			psmt.setString(2, id);
			
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	public String BringType(String id) {
		connect();
		String type = null;
		try {
			String sql = "Select type from character where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				type = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
	}
}
