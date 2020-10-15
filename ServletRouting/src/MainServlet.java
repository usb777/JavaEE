

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/admin/list","/admin/user" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public MainServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String action = request.getServletPath();
System.out.println("ACTION = "+action);
    	
		switch (action) 
		  {
			case "/admin/list":	listUser(request, response);		break;
			case "/admin/user":   showUser(request, response);		break;
		
			default:	listUser(request, response);		break;
			
		  }
    }
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException
	{
		processRequest(request,  response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		processRequest(request,  response);
	}
	
	
	
	private void listUser(HttpServletRequest request, HttpServletResponse response)		throws  IOException, ServletException 
	{
		List<String> listUser = new ArrayList<String>();
		listUser.add("Dzen");
		listUser.add("Dzima");
		listUser.add("Andrew");
		
		
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/index.jsp");
		dispatcher.forward(request, response);
	}
	

	private void showUser(HttpServletRequest request, HttpServletResponse response)		throws  IOException, ServletException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("user", "Dzmitry SAmoila, id ="+id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/index.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	
	

}
