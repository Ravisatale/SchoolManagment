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

@WebServlet("/addteacher")
public class TeacherAdd extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String subject=req.getParameter("subject");
	String salary=req.getParameter("salary");
	
	Teacher t=new Teacher();
	t.setId(id);
	t.setName(name);
	t.setSubject(subject);
	t.setSal(salary);
	
	et.begin();
	em.persist(t);
	et.commit();
	
	RequestDispatcher re=req.getRequestDispatcher("teacher.html");
	re.forward(req, resp);
}
}
