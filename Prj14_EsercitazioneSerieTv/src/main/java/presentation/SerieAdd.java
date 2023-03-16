package presentation;

import java.io.IOException;

import controller.SerieController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Serie;

@WebServlet ("/add")
public class SerieAdd extends HttpServlet{
	
	private SerieController service;

	public SerieAdd() {
		this.service = new SerieController();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		request.getRequestDispatcher("form.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
		//response.getWriter().append(service.getAll().toString());
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("titolo")!= null) {
			String titolo = request.getParameter("titolo");
			String immagine = request.getParameter("immagine");
			String genere = request.getParameter("genere");
			double rating = Double.parseDouble(request.getParameter("rating"));
			//boolean visto = Boolean.parseBoolean(request.getParameter("visto"));
			int intVisto = Integer.parseInt(request.getParameter("visto"));
			boolean visto = (intVisto == 1)? true:false;
			Serie temp = new Serie();
			temp.setTitolo(titolo);
			temp.setImmagine(immagine);
			temp.setGenere(genere);
			temp.setRating(rating);
			temp.setVisto(visto);
		    service.add(temp);
			
		}
		
	    doGet(request, response);
		
	}
	
	

}