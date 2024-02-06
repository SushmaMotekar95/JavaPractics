
public class Employeearray {
	public static void main(String args[])
	{
		Employeearray obj=new Employeearray();
	
		Employee[] stuArray = obj.addEmployeeInArray();
		System.out.println();
		System.out.println("*********Employee Information**********");
		System.out.println();
		obj.getStudent(stuArray); 
			
	}
	void getStudent(Employee[] arr) {
		for(int i=0; i<arr.length; i++) {
			Employee sObj = arr[i];
		
			System.out.println(sObj);
//			System.out.println("Employee ID is-"+sObj.id);
//			System.out.println("Employee Name is-"+sObj.name);
//			System.out.println("Employee City is-"+sObj.city);
			
		}
	}
		 Employee[]  addEmployeeInArray() {
			 Employee obj1 = new Employee();
			 obj1.setID(101);
			 obj1.setName("Neha");
			 obj1.setCity("Burhanpur");

			 Employee obj2 = new Employee();
			 obj2.setID(102);
			 obj2.setName("Jyoti");
			 obj2.setCity("Muktainagar");
			 
			 Employee obj3 = new Employee();
			 obj3.setID(103);
			 obj3.setName("Khushi");
			 obj3.setCity("Jalgaon");

			 Employee[] stuArray = new Employee[3];
			 stuArray[0] = obj1;
			 stuArray[1] = obj2;
			 stuArray[2] = obj3;
			 return stuArray;
			
		}
	

}
