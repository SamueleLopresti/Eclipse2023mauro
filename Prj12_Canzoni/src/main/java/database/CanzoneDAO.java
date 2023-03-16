package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAO  {
	
	Connessione connessione = new Connessione();
	Statement statement;
	ResultSet rs;
	public List<Canzone> getCanzoni(){
		
		List<Canzone> temp = new ArrayList<>();
		String sql = "select * from canzoni";
		try {
			System.out.println("entro nel metodo");
			statement = connessione.getConn().createStatement();
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				Canzone c = new Canzone();
				c.setId(rs.getInt("id"));
				c.setCanzone(rs.getString("canzone"));
				c.setCantanti(rs.getString("cantanti"));
				System.out.println(c);
				temp.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		

		
		
		
		
		return temp;
	}

}

