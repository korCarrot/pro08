package sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("여기는 FirstServlet" + request);
		
		//request가 2번 (클라이언트 요청 -> first -> 클라이언트 -> 다른 페이지)
		
		// 1)redirect 방법
		
//		response.sendRedirect("http://www.naver.com"); //Sends a temporary redirect response to the client using thespecified redirect location URL and clears the buffer.
//		response.sendRedirect("http://localhost:8090/pro08/second");
//		response.sendRedirect("second");
		response.sendRedirect("second?name=hong");

		
		
		// 2)refresh 방법
//		response.addHeader("Refresh", "1;url=second");	//1초 후에 url로 이동 / 이름이 refresh가 아니면 이동이 안되는..
//		response.addHeader("Refresh", "5;url=http://www.naver.com");
//		Collection<String> coll = response.getHeaderNames();
//		System.out.println(coll);
		
		// 3)자바스크립트의 location 객체
//		PrintWriter pw = response.getWriter();
//		pw.write("<script>"
//				+ "location.href = 'second'"	//속성값이라 ''넣어주는거 주의
//				+ "</script>");
		
		
		
	}   

}