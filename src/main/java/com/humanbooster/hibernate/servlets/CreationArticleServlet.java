package com.humanbooster.hibernate.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.humanbooster.hibernate.business.Article;
import com.humanbooster.hibernate.business.Categorie;
import com.humanbooster.hibernate.dao.ArticleDao;
import com.humanbooster.hibernate.dao.CategorieDAO;
import com.humanbooster.hibernate.dao.impl.ArticleDaoImpl;
import com.humanbooster.hibernate.dao.impl.CategorieDAOImpl;

/**
 * Servlet implementation class CreationServlet
 */
@WebServlet("/CreationArticle")
public class CreationArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CategorieDAO categorieDao = new CategorieDAOImpl();
	private ArticleDao articleDao = new ArticleDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreationArticleServlet() {
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
		categorieDao.openCurrentSessionWithTransaction();
		List<Categorie> categories = categorieDao.findAll();
		request.setAttribute("categories", categories);
		categorieDao.closeCurrentSessionWithTransaction();
		request.getRequestDispatcher("creationArticle.jsp").include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idCategorie = 0;
		Categorie categorie = null;
		String designation = request.getParameter("designation");
		idCategorie = Integer.valueOf(request.getParameter("categorie"));
		int nbPoints = Integer.valueOf(request.getParameter("nbPoints"));
		int stock = Integer.valueOf(request.getParameter("stock"));

		categorieDao.openCurrentSessionWithTransaction();
		if (idCategorie != 0) {
			 categorie = categorieDao.findById(idCategorie);
		}
		categorieDao.closeCurrentSessionWithTransaction();

		
		
		articleDao.openCurrentSessionWithTransaction();
		if (idCategorie == 0) {
			articleDao.create(new Article(designation, null, nbPoints, stock));
		} else {
			articleDao.create(new Article(designation, categorie, nbPoints, stock));
		}
		articleDao.closeCurrentSessionWithTransaction();

		response.sendRedirect("index");
	}

}
