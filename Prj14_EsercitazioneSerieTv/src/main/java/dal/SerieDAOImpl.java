package dal;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Serie;

public class SerieDAOImpl implements SerieDAO {
	
	private Connessione miaConn;// la mia classe connessione
	private Connection conn; // la connessione vera e propria
	private Statement statement; // contenitore per istruzioni sql
	private PreparedStatement ps; // evoluzione del contenitore
	private ResultSet rs; // contenitore risultati della query
	
	public SerieDAOImpl() {
		// TODO Auto-generated constructor stub
		this.miaConn = new Connessione();
		this.conn = miaConn.getConn();
	}
	
	
	
	

	@Override
	public void addSerie(Serie s) throws SQLException {
		// TODO Auto-generated method stub
		this.ps = this.conn.prepareStatement(ADD);
		this.ps.setString(1, s.getTitolo());
		this.ps.setString(2, s.getImmagine());
		this.ps.setString(3, s.getGenere());
		this.ps.setDouble(4, s.getRating());
		this.ps.setBoolean(5, s.isVisto());
		this.ps.execute();

	}

	@Override
	public void updateSerie(Serie s) throws SQLException {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void deleteSerie(Serie s) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSerieByIf(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Serie getSerieByID(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Serie> getSerie() throws SQLException {
		// TODO Auto-generated method stub
		List<Serie> serie = new ArrayList<>();
		statement = conn.createStatement();
		rs = statement.executeQuery(GET_ALL);
		while(rs.next()) {
			Serie temp = new Serie();
			temp.setId(rs.getInt("id"));
			temp.setTitolo(rs.getString("titolo"));
			temp.setImmagine(rs.getString("immagine"));
			temp.setGenere(rs.getString("genere"));
			temp.setRating(rs.getDouble("rating"));
			temp.setVisto(rs.getBoolean("visto"));
		    serie.add(temp);
			
		}
		return serie;
	}

}
