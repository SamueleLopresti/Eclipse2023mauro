package collegamento;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Todo;

import java.io.IOException;
import java.util.Scanner;

import controller.TodoCtrl;

/**
 * Servlet implementation class GestioneCollegamento
 */
@WebServlet("/router")
public class GestioneCollegamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String leggiStringa (String domanda) {
		System.out.println(domanda);
		Scanner input= new Scanner(System.in);
		return input.nextLine();
		
	}
	 TodoCtrl ctrl = new TodoCtrl(5);
	
	public GestioneCollegamento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		for (int i = 0; i < ctrl.getAll().length; i++) {
			ctrl.add(leggiStringa("cosa vuoi comprare"));
		}
		
		
		for (Todo t : ctrl.getAll()) {
			response.getWriter().append("*** " + t);
		}
		
	}

}
