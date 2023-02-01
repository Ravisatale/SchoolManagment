package SchoolManagment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ganu")
public class LoginPrincipal extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
	 EntityManager em=emf.createEntityManager();
	 
	String email=req.getParameter("email");
	String pass=req.getParameter("password");
	
	Query q=em.createQuery("select u from Prinicipal u where u.email=?1 and u.pass=?2");
	
	q.setParameter(1, email);
	q.setParameter(2, pass);
	
	List<Prinicipal> prinicipal=q.getResultList();
	
	if(prinicipal.size()>0)
	{
		 RequestDispatcher rd= req.getRequestDispatcher("success.html");
		    rd.forward(req, resp);
	}
	else
	{
		PrintWriter pw=resp.getWriter();
		pw.write("invlid ");
    	RequestDispatcher rd=req.getRequestDispatcher("login.html ");
		rd.include(req, resp);
		
	}
	
}
}
