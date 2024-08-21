package exception_handling;

public class Test_exception {
	
	public void add() throws NameNotFoundException,ValueNotException {
		int a=5;
		
		if(a==5) {
			throw new NameNotFoundException("Please provide valid input");
		}
		if(a==6) {
			throw new ValueNotException("insert vales");
		}
		System.out.println("Hi");

	}
	
	public static void main(String[] args)  {
		Test_exception t=new Test_exception();
		try {
			t.add();
		} catch (NameNotFoundException e) {

			e.printStackTrace();
		} catch (ValueNotException e) {
			
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Welcome");
	}
	

}
