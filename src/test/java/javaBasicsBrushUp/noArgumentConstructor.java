package javaBasicsBrushUp;

public class noArgumentConstructor {

	// no argument constructor where a constructor created with no parameter
	
	int employeeId;
	String employeeName;
	
	noArgumentConstructor(){
		employeeId = 1;
		employeeName = "Sathish";
	}
	
	public static void main(String[] args) {
		
		noArgumentConstructor accessObj = new noArgumentConstructor();
		System.out.println(accessObj.employeeId);
		System.out.println(accessObj.employeeName);
		
	}
}
