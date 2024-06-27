package lab2;

public class MyClassOne {
	private String name = "John";
	private String address = "Kathmandu";
	private int phone = 123;

	public static void main(String[] args) {
		MyClassOne Obj = new MyClassOne();
		String myName = Obj.name;
		String myAddress = Obj.address;
		int myPhone = Obj.phone;

		Obj.address = " Lalitpur ";
	
		
		System.out.println("Name: " + Obj.name + "\n" + "Address: " + Obj.address + "\n" + "Phone: " + Obj.phone);
	}
}
