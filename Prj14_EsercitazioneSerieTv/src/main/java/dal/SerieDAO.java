package dal;

import java.sql.SQLException;
import java.util.List;

import model.Serie;

public interface SerieDAO {
	
	String TABELLA ="serietv";
	String ADD ="insert into " + TABELLA + " (titolo,immagine,genere,rating,visto) values (?,?,?,?,?)";
	String GET_ONE ="select * from " + TABELLA + " where id = ?";
	String GET_ALL ="select * from " + TABELLA;
	String UPDATE ="update " + TABELLA + " set titolo=? ,immagine=? ,genere=? ,rating=? ,visto=? ";
	String DELETE ="delete from " + TABELLA + " where id =?";
	
	void addSerie (Serie s) throws SQLException;
	void updateSerie (Serie s) throws SQLException;
	void deleteSerie (Serie s) throws SQLException;
	void deleteSerieByIf (int id) throws SQLException;
	Serie getSerieByID (int id) throws SQLException;
	List<Serie> getSerie () throws SQLException;
	

}
