package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SurveyDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	MemberDTO dto;
	MemberDAO dao = new MemberDAO();
	SurveyDTO sdto;
	int cnt = 0;
	boolean result = false;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "nextlevel";
			String pw = "1234";

			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int UpdateCnt(int q_cnt, String id) {
		connect();

		try {
			String sql = "Update character set Q_cnt=? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, q_cnt);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cnt;
	}

	public int BringCnt(String id) {
		connect();
		int cnt = 1;
		try {
			String sql = "Select Q_cnt from character where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

//			while (rs.next()) {
//				rs.getInt(1);
//			}
			while (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;

	}

	public void BringQuery(String id) {
		connect();
		String query = "";

		try {
			String sql = "Select Question from survey where Row_num=(select Q_cnt from character where id =?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			while (rs.next()) {
				query = rs.getString(1);
			}
			String[] query1 = query.split(",");
			for (int i = 0; i < query1.length; i++) {
				System.out.println(query1[i]);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int Update_EI(String id, int num) {
		connect();
		try {
			String sql = "Update Character set EI_Point=? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Update_SN(String id, int num) {
		connect();
		try {
			String sql = "Update Character set SN_Point=? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Update_TF(String id, int num) {
		connect();
		try {
			String sql = "Update Character set TF_Point=? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Update_JP(String id, int num) {
		connect();
		try {
			String sql = "Update Character set JP_Point=? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Bring_EI(String id) {
		int EI = 0;
		connect();

		try {
			String sql = "Select EI_point from character where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			rs = psmt.executeQuery();

			while (rs.next()) {
				EI = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EI;
	}

	public int Bring_SN(String id) {
		int SN = 0;
		connect();

		try {
			String sql = "Select SN_point from character where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			rs = psmt.executeQuery();

			while (rs.next()) {
				SN = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SN;
	}

	public int Bring_TF(String id) {
		int TF = 0;
		connect();

		try {
			String sql = "Select TF_point from character where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			rs = psmt.executeQuery();

			while (rs.next()) {
				TF = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return TF;
	}

	public int Bring_JP(String id) {
		int JP = 0;
		connect();

		try {
			String sql = "Select JP_point from character where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			rs = psmt.executeQuery();

			while (rs.next()) {
				JP = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JP;
	}

	public int Update_mbti(String id, String mbti) {
		connect();
		try {
			String sql = "Update mbti set mbti =? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mbti);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public String Bring_mbti(String id) {
		String mbti = "";
		connect();
		try {
			String sql = "Select Type from character where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			mbti = rs.getString(1);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mbti;

	}

	public int Update_G_life(String id, int num) {
		connect();
		try {
			String sql = "Update character set G_chance=? where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Bring_G_life(String id) {
		connect();
		try {
			String sql = "Select G_chance from character where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Bring_hp(String id) {
		connect();
		int cnt = 0;
		try {
			String sql = "Select D_HP from character where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Bring_age(String id) {
		connect();
		int cnt = 0;
		try {
			String sql = "Select c_age from character where id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				cnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int Update_mbtiInfor(String inf, String id) {
		int cnt = 0;
		connect();
		try {
			String sql = "update mbti set mbtiinf=? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inf);
			psmt.setString(2, id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cnt;

	}

}
