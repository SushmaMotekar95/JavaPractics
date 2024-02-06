
public class EmployeeAnotherarray {
	void printArray(Employee[] arr) {
		
		System.out.println("Inside StudentAnother class ");
		
		for (Employee sObj : arr) {
			
//			System.out.println("Roll No is-"+sObj.id);
//			System.out.println("Name is-"+sObj.name);
//			System.out.println("City is-"+sObj.name);
			System.out.println(sObj.toString());
		}
		
	}

}
