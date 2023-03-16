package IntegrationLayer;

import java.io.IOException;

import org.json.JSONArray;

import controller.SerieController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/api/serie")
public class SerieRest extends HttpServlet{
	
	private SerieController service;

	public SerieRest() {
		this.service = new SerieController();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		JSONArray array = new JSONArray(service.getAll());
		
		response.setContentType("application/json");	
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		response.getWriter().append(array.toString());
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    doGet(request, response);
		
	}
	
	

}