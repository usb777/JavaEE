

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtherServlet
 */
@WebServlet(name = "OtherServlet", urlPatterns = {"/admin/other","/admin/notother" })
public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OtherServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String action = request.getServletPath();

    	
		switch (action) 
		  {
			case "/admin/other":	showOther(request, response);		break;
			case "/admin/notother":	showNotOther(request, response);		break;	
		  }
    }
    
    private void showOther(HttpServletRequest request, HttpServletResponse response)		throws  IOException, ServletException 
	{
		
		request.setAttribute("other", "Other User");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/index.jsp");
		dispatcher.forward(request, response);
	}
	
    private void showNotOther(HttpServletRequest request, HttpServletResponse response)		throws  IOException, ServletException 
  	{
  		
  		request.setAttribute("notother", "NOT Other User");
  		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/index.jsp");
  		dispatcher.forward(request, response);
  	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		processRequest(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		processRequest(request,  response);
	}

}
