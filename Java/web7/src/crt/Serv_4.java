package crt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.Calcular_4;

/**
 * Servlet implementation class Serv_3
 */
@WebServlet("/Serv_4")
public class Serv_4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Serv_4() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Calcular_4 obj4 = new Calcular_4();

		obj4.setNombre(request.getParameter("num_4A"),request.getParameter("num_4B"));
		
		
		
		request.setAttribute("OB_ACTUALIZADO_4", obj4);

		try (PrintWriter out = response.getWriter()) {
			RequestDispatcher a = request.getRequestDispatcher("index.jsp");
			a.forward(request, response);
		}
	}

}