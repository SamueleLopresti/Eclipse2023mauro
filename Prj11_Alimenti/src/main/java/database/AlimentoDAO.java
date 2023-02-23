package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Alimento;

public class AlimentoDAO {
	
	Connessione connessione = new Connessione();
	Statement statement;//serve per scrivere le istruzioni al DB
	ResultSet rs;// serve per immagazinare i risultati provenienti dal DB
	
	
	public ArrayList<Alimento> getAlimenti(){
		String query = "select * from alimenti";
		ArrayList<Alimento> scatola = new ArrayList<>();
		try {
			statement = connessione.getConn().createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				String prodotto = rs.getString("prodotto");
				Alimento a = new Alimento();
				a.setProdotto(rs.getString("prodotto"));
				a.setCategoria(rs.getString("categoria"));
				scatola.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scatola;
		
	}
	


}
