package crt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.Calcular_1;

/**
 * Servlet implementation class Serv_1
 */
@WebServlet("/Serv_1")
public class Serv_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Serv_1() {
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
		Calcular_1 obj_1 = new Calcular_1();

		obj_1.setNombre(request.getParameter("num_1"));
		
		
		request.setAttribute("OB_ACTUALIZADO_1", obj_1);

		try (PrintWriter out = response.getWriter()) {
			RequestDispatcher a = request.getRequestDispatcher("index.jsp");
			a.forward(request, response);
		}
	}

}
