package com.humanbooster.hibernate.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.humanbooster.hibernate.business.Categorie;
import com.humanbooster.hibernate.dao.CategorieDAO;
import com.humanbooster.hibernate.dao.impl.CategorieDAOImpl;


/**
 * Servlet implementation class CreationServlet
 */
@WebServlet("/Creation")
public class CreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CategorieDAO categorieDao = new CategorieDAOImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		categorieDao.openCurrentSessionWithTransaction();
		List<Categorie> categories = categorieDao.findAll();
		request.setAttribute("categories", categories);
		categorieDao.closeCurrentSessionWithTransaction();
		request.getRequestDispatcher("creationArticle.jsp").include(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
