package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dal.SerieDAO;
import dal.SerieDAOImpl;
import model.Serie;

public class SerieController {
	
	private List<Serie> serie ;
	private SerieDAO dao;

	public SerieController() {
		// TODO Auto-generated constructor stub
		this.serie = new ArrayList<>();
		this.dao = new SerieDAOImpl();
	}
	
	public List<Serie> getAll(){
		try {
			serie.clear();
			serie.addAll(dao.getSerie());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serie;
	}
	
	public void add(Serie s) {
		try {
			dao.addSerie(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
