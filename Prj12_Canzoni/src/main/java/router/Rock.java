package router;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.json.JSONArray;

import database.CanzoneDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

@WebServlet("/rock")
public class Rock extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter out = response.getWriter();
		
		CanzoneDAO cd = new CanzoneDAO();
	//	System.out.println(cd.getCanzoni().size());
//		for (Canzone c : cd.getCanzoni()) {
//		
//			out.println(c);
//
//		}
	JSONArray array = new JSONArray(cd.getCanzoni());
	
	response.setContentType("application/json");
	out.print(array.toString());
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("mi ha chiamato il REST client");
		String collect = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
		PrintWriter out = resp.getWriter();
		out.print(collect);
	}
	
	
	
	
	
	
	
	
}