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
@WebServlet("/ravi")
public class InserData extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	String name=req.getParameter("name");
	String age=req.getParameter("age");
	String email=req.getParameter("email");
	String pass=req.getParameter("password");
	String mbn=req.getParameter("mobile");
	
	Prinicipal p=new Prinicipal();
    p.setName(name);
    p.setAge(age);
    p.setEmail(email);
    p.setPass(pass);
    p.setMbn(mbn);
    
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    et.begin();
    em.persist(p);
    et.commit();
    
    RequestDispatcher rd= req.getRequestDispatcher("Login2.html");
    rd.forward(req, resp);
}
}
