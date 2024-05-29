package Lab3;

public class throweg {
	public void add(int a) {
		if(a<3) {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
		throweg eg=new throweg();
		try {
			eg.add(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

