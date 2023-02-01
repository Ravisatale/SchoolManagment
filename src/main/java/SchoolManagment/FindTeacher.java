package SchoolManagment;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/findteacher")
public class FindTeacher extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	
	String id=req.getParameter("id");
	
	Teacher t=em.find(Teacher.class, id);
	
	System.out.println(t.getId());
	System.out.println(t.getName());
	System.out.println(t.getSubject());
	System.out.println(t.getSal());
	
	RequestDispatcher re=req.getRequestDispatcher("teacher.html");
	re.forward(req, resp);
}
}
