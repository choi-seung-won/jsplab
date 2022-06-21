package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Member.MemberPage;
import jdbc.JdbcUtil;

public class CommentDao {

	public CommentDao insert(Connection conn, MemberPage member) {

		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("insert into ");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(pstmt);
		}
		return null;

	}
	
	public List<MemberPage> select(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("select * from Testing order by mNO desc");
			/*
			 * pstmt.setInt(1,startRow); pstmt.setInt(2, size);
			 */
			rs = pstmt.executeQuery();
			List<MemberPage> result = new ArrayList<>();
			while(rs.next()) {
				result.add(convertMember(rs));
			}
			return result;
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
	}

	private MemberPage convertMember(ResultSet rs)throws SQLException {
		return new MemberPage(rs.getInt("mNo"),rs.getString("mId"),rs.getString("pw"),rs.getString("reviews"));
	}

}