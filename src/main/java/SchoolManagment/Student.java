package SchoolManagment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private String id;
private String name;
private String stream;
private String fees;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFees() {
	return fees;
}
public void setFees(String fees) {
	this.fees = fees;
}


}
