package Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Member.MemberPage;
import dao.CommentDao;
import jdbc.connection.ConnectionProvider;

public class CommentListService {

	private CommentDao commentDao = new CommentDao();
	
	public ReviewPage getMemberPage() {
		try(Connection conn = ConnectionProvider.getConnection()){
			List<MemberPage> member = commentDao.select(conn);
			return new ReviewPage(member);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
