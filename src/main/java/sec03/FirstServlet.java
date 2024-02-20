package sec03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//HttpServletRequest
		/* HTTP 서버릿에 대한 요청 정보를 제공하도록 서버릿Request 인터페이스를 확장합니다.
		   servlet 컨테이너는 HttpServletRequest 개체를 생성하고 이를 servlet의 서비스 메서드(doGet, doPost 등)에 인수로 전달합니다.  */
		System.out.println("여기는 FirstServlet");
		
		// dispatch 보내다
		//RequestDispatcher
		//클라이언트로부터 요청을 받아 서버의 임의의 리소스(예: 서블릿, HTML 파일 또는 JSP 파일)로 보내는 개체를 정의합니다.
		
		//request 1번
		RequestDispatcher dispatcher = request.getRequestDispatcher("second");
		dispatcher.forward(request, response);
		
	}   

}