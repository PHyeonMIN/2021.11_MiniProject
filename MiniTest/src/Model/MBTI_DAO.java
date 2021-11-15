package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class MBTI_DAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
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

	public ArrayList<MBTI_DTO> MBTI_selectAll() {
		
		connect();
		ArrayList<MBTI_DTO> info = new ArrayList<MBTI_DTO>();
		
		try {
			
			String sql = "select * from mbti where mbti is not null";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id =rs.getString(1);
				String mbti =rs.getString(2);
				String mbtiinf = rs.getString(4);
				
				info.add(new MBTI_DTO(id,mbti,mbtiinf));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return info;
		
	}


}
