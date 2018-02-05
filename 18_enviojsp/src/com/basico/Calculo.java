package com.basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculo
 */
@WebServlet("/Calculo")
public class Calculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String c = request.getParameter("ciudades");
		request.getSession().setAttribute("ciudades", c);
		
		
		String u = request.getParameter("unidades");	
		request.setAttribute("unidades", u);
		getServletContext().getRequestDispatcher("/segunda.jsp").forward(request, response);
		
		
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String codigo = request.getParameter("codigo");
		request.setAttribute("codigo", codigo);
		getServletContext().getRequestDispatcher("/codigo.jsp").forward(request, response);
		
		
		
		
	}


}