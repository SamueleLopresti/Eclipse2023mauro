package gioco;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class pfc
 */
@WebServlet ("/pfc")
public class Pfc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("scelta")!= null) {
			String sceltaUmano = request.getParameter("scelta");
			String sceltaPC = CartaForbiceSasso.chiediPC();
			String result = CartaForbiceSasso.valuta(sceltaUmano, sceltaPC);
			response.getWriter().append(result);

			
		}
	}

}
