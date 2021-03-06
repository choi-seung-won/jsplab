package Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.MemberPage;
import Service.CommentListService;
import Service.ReviewPage;
import mvc.command.CommandHandler;

public class CommentListHandler implements CommandHandler{
	
	private CommentListService commentService = new CommentListService();
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ReviewPage reviewPage = commentService.getMemberPage();
		req.setAttribute("reviewPage", reviewPage); 
		return "/aviato/themes/aviato/product-single.jsp";
	}
	
}
