package SchoolManagment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prinicipal {
	@Id
 private int id;
 private String name;
 private String age;
 private String email;
 private String pass;
 private String mbn;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getMbn() {
	return mbn;
}
public void setMbn(String mbn) {
	this.mbn = mbn;
}


}
