package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Model.Dipendente;
import Model.Dirigente;
import Model.Fattorino;
import Model.Impiegato;

/**
 * Servlet implementation class GestionaleController
 */
@WebServlet("/router")
public class GestionaleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<Dipendente> dipendenti = new ArrayList<>();
	
	
	public GestionaleController() {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		dipendenti.add(new Fattorino("Mario", "Rossi"));
		dipendenti.add(new Impiegato("Giacomo", "Belli"));
		dipendenti.add(new Dirigente("Giulia", "Carmoni"));
		
		// TODO Auto-generated method stub
		response.getWriter()
		.append(dipendenti.toString());
	}

}
