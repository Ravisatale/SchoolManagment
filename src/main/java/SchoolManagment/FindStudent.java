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

@WebServlet("/find")
public class FindStudent extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	String id=req.getParameter("id");
	
	Student s=em.find(Student.class, id);
	System.out.println(s.getId());
	System.out.println(s.getName());
	System.out.println(s.getStream());
	System.out.println(s.getFees());
	
	RequestDispatcher rd=req.getRequestDispatcher("student.html");
	rd.forward(req, resp);
}
}
