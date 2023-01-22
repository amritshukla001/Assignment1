import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int first=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int sec=sc.nextInt();
		
		//compare each bit of both number
		//whenever we find dissimilarity, print result and return
		
		 for(int i = 32; i >= 0; i--) {

	            //Fetch the current bit of both the numbers
	            int bitFN = (first >> i) & 1;
	            int bitSN = (sec >> i) & 1;
	            
	            if(bitFN == 1 && bitSN == 1) {
	                continue;
	            }
	            else if(bitFN == 0 && bitSN == 0){
	                continue;
	            }
	            //If first bit is greater for A then print A is greater 
	            else if(bitFN == 1 && bitSN == 0){
	                System.out.println("First number is greater than Second number");
	                return;
	            }
	            else if(bitFN == 0 && bitSN == 1){
	                System.out.println("Second number is greater than First Number");
	                return;
	            }
	            
	        }
	        System.out.println("A is equal to B");
	}

}
