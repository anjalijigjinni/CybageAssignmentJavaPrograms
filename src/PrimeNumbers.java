import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		 int maxnum;
		 System.out.println("Enter how many numbers you want to print ");
		 Scanner sc = new Scanner(System.in);
		 maxnum = sc.nextInt();
		
		 
		 for(int num =2; num <= maxnum ; num++)
		 {
			 boolean isPrime = true ;
			 for(int i =2 ; i<=num/2; i++)
			 {
				 
				 if(num%i==0)
				 {
					 isPrime = false;
					 break;
				 }
			 }
			 
			 if(isPrime==true)
			 {
				 System.out.println(num);
			 }
			 
		 }
		 
		

	}

}
