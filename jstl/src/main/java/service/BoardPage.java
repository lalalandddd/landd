package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardPage implements MainActive{
	@Override
	public String action(HttpServletRequest req,HttpServletResponse res) {
		//String title=req.getParameter("title");
		//String writer=req.getParameter("writer");
		//String content=req.getParameter("content");
		return "board/board.jsp";
	}

}
