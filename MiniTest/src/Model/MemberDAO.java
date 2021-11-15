package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	int cnt = 0;
	MemberDTO dto;

	public void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String id = "nextlevel";
			String pw = "1234";

			conn = DriverManager.getConnection(url, id, pw);

		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}

	public int Insert(MemberDTO dto) {	// 회원가입부분
		connect();
		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		

		try {
		
			String sql = "insert into member values(?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			cnt = psmt.executeUpdate();
			
			sql = "insert into character (id) values(?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			
			sql = "insert into mbti (id) values(?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		return cnt;

	}

	public boolean Login(String id, String pw) {	//로그인부분
		connect();
		boolean result = false;
		
		try {
			String sql = "Select * from member where id=? and pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			result = rs.next();
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	
	
}
