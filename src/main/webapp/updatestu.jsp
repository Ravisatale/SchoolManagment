

<%@page import="SchoolManagment.Student"%>
<%@page import="java.io.PrintWriter"%>

<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String id = request.getParameter("id");
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
	EntityManager em = emf.createEntityManager();
	Student s=em.find(Student.class,id);
	%>

	<form action="update" method="post">
		id: <input type="text" value="<%=s.getId()%>" name="id">
		name: <input type="text" value="<%=s.getName()%>" name="name">
		Stream: <input type="text" value="<%=s.getStream()%>" name="stream">
		Fees: <input type="text" value="<%=s.getFees()%>"name="fees">
		<input type="submit">
	</form>




</body>
</html>