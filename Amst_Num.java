import java.util.*;
public class Amst_Num {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ene=ter a number :");
		int n = s.nextInt();
		int rem ,sum = 0;
		int temp = n;
		while (n!=0)
		{
            rem = n%10;
            sum = sum +rem*rem*rem ;
            n = n/10;
            
		}
		if(sum == temp)
       System.out.println("Amrstrong number.");
		else 
			System.out.println("Not a Amrstrong number. ");
	}

}
