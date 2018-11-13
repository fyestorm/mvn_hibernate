package com.humanbooster.hibernate.dao;

import java.util.List;

import org.hibernate.Session;

import com.humanbooster.hibernate.business.Article;
import com.humanbooster.hibernate.business.Categorie;

public interface CategorieDAO {

	public List<Categorie> findAll();
	
	public Categorie findById(int idCategorie);
	
	public Session openCurrentSession();

	public Session openCurrentSessionWithTransaction();

	public void closeCurrentSession();

	public void closeCurrentSessionWithTransaction();
	
	public Categorie create(Categorie categorie);
}


