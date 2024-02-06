
public class Employee {
	int id;
	String name;
    String city;
	public void setID(int id1) {
		if(id1>0) {
			this.id = id1;
		}else {
			System.out.println("ID value is incorrect");
			id=0;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return name;
	}
	public void setCity(String city) {
		this.city= city;
	}
	@Override
	public String toString() {
		return " - [ID=" + id + ", Name=" + name + ", City=" + city + "]";
	}
}


