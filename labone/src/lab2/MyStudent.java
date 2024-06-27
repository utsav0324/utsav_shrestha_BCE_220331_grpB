package lab2;

public class MyStudent {
	private String name = "Zake";
	private String address = "Kathmandu";
	private int phone = 123456789;

	public static void main(String[] args) {
		MyStudent Obj = new MyStudent();
		String myName = Obj.name;
		String myAddress = Obj.address;
		int myPhone = Obj.phone;

		System.out.println("Initial values:");
		System.out.println("Name: " +myName + "\n" +"Address: " +  myAddress + "\n" +"Phone: " +  myPhone);

		Obj.name = " jolie ";
		Obj.address = " Lalitpur ";
		Obj.phone = 987654321;
		System.out.println("\nUpdated values:");
		System.out.println("Name: "+Obj.name + "\n" +"Address: " +  Obj.address + "\n" + "Phone: "+ Obj.phone);
		
	

	
	
	
	
	
	
	
	
	
	
	}
}
/*
 * private String name; private String address; private int phone;
 * 
 * public MyStudent(String name, String address, int phone) { this.name = name;
 * this.address = address; this.phone = phone; }
 * 
 * public String getName() { return name; }
 * 
 * public String getAddress() { return address; }
 * 
 * public int getPhone() { return phone; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public void setAddress(String address) { this.address = address; }
 * 
 * public void setPhone(int phone) { this.phone = phone; }
 * 
 * public static void main(String[] args) {
 * 
 * MyStudent student = new MyStudent("Zake", "Kathmandu", 123456789);
 * 
 * System.out.println("Initial values:"); System.out.println("Name: " +
 * student.getName()); System.out.println("Address: " + student.getAddress());
 * System.out.println("Phone: " + student.getPhone());
 * 
 * student.setName("Jane"); student.setAddress("Bhaktapur");
 * student.setPhone(98765432);
 * 
 * System.out.println("\nUpdated values:"); System.out.println("Name: " +
 * student.getName()); System.out.println("Address: " + student.getAddress());
 * System.out.println("Phone: " + student.getPhone());
 * 
 * }
 * 
 * }
 */
