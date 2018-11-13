package com.humanbooster.hibernate.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.humanbooster.hibernate.business.Categorie;
import com.humanbooster.hibernate.dao.CategorieDAO;
import com.humanbooster.hibernate.dao.impl.CategorieDAOImpl;

/**
 * Servlet implementation class CreationCategorie
 */
@WebServlet("/CreationCategorie")
public class CreationCategorieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CategorieDAO categorieDao = new CategorieDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationCategorieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("creationCategorie.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		categorieDao.openCurrentSessionWithTransaction();
		categorieDao.create(new Categorie(nom));
		categorieDao.closeCurrentSessionWithTransaction();
		response.sendRedirect("index");
	}

}
