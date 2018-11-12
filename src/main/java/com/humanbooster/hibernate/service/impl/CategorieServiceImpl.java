package com.humanbooster.hibernate.service.impl;

import java.util.List;


import com.humanbooster.hibernate.business.Categorie;
import com.humanbooster.hibernate.dao.CategorieDAO;
import com.humanbooster.hibernate.dao.impl.CategorieDAOImpl;
import com.humanbooster.hibernate.service.CategorieService;

public class CategorieServiceImpl implements CategorieService{

	private CategorieDAO categorieDao = new CategorieDAOImpl();
	
	public List<Categorie> recupereCategorie() {
		categorieDao.openCurrentSession();
		List<Categorie> categories = categorieDao.findAll();
		System.out.println("Nombre d'articles en base: " + categories.size());
		categorieDao.closeCurrentSession();
		return categories;
	}

}
