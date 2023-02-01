package SchoolManagment;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class updateStudent extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String Stream=req.getParameter("stream");
	String fees=req.getParameter("fees");
	
	Student s=new Student();
	
	s.setId(id);
	s.setName(name);
	s.setStream(Stream);
	s.setFees(fees);
	
	et.begin();
	em.merge(s);
	et.commit();
	
	RequestDispatcher rd=req.getRequestDispatcher("student.html");
	rd.forward(req, resp);
}
}
