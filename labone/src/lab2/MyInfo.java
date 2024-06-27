package lab2;

public class MyInfo {
	private String Name = "Zake";
	private String Address = "kathmandu";
	private int Number = 123456789;
	
	public static void main(String[] args) {
		MyInfo Info=new MyInfo();
		String myName=Info.Name;
		String myAddress=Info.Address;
		int myPhone=Info.Number;
		System.out.println(myName +"\n" +myAddress + "\n"+myPhone);
		
		Info.Name="Jolie";
		Info.Address="Lalitpur";
		Info.Number=987654321;
		System.out.println( Info.Name+" "+Info.Address+" "+Info.Number);
	
	}
}
