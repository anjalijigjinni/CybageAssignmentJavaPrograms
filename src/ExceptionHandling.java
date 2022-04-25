
public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;

		}

		catch (ArithmeticException e) {
			System.out.println("Arthimetic Exception occurs");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch (Exception e) {
			System.out.println("Exception occurs");
		}
		
		try {
			
			String str=null;
			System.out.println(str.length());
			
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception occurs");
		}
		
		
		

	}

}
