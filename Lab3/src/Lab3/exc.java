package Lab3;

public class exc {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			int result= a/b;
		} catch (Exception exe) {
			System.out.println(exe.getLocalizedMessage());
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			
		}
	}

}

