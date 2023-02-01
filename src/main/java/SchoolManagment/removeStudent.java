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
import javax.swing.border.EtchedBorder;

@WebServlet("/remove")
public class removeStudent extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	String id=req.getParameter("id");
	
	Student s=em.find(Student.class, id);
	et.begin();
	em.remove(s);
	et.commit();
	
	RequestDispatcher rd=req.getRequestDispatcher("student.html");
	rd.forward(req, resp);
}
}
