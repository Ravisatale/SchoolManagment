package SchoolManagment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
private String id;
private String name;
private String subject;
private String sal;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSal() {
	return sal;
}
public void setSal(String sal) {
	this.sal = sal;
}


}
