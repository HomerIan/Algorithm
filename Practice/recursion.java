package Practice;
import java.util.Scanner;
public class recursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Age=0;
		String status,gender;
		System.out.print("Married or Unmarried?: ");
		status=in.nextLine();	
		
		if(status=="Married"|status=="married") {
			System.out.println("Driver Insured");
		}else if(status=="Unmarried"|status=="unmarried"){
			System.out.print("Male or Female?: ");
			gender = in.nextLine();
			
			if(gender=="Male"|gender=="male") {
				System.out.print("Enter Your Age: ");
				Age = in.nextInt();
				if(Age >=30) {
					System.out.println("Driver Insured");
				}else {
					System.out.println("Driver NOT Insured");
				}
			}if(gender=="Female"|gender=="female") {
				System.out.print("Enter Your Age: ");
				Age = in.nextInt();
				if(Age >=30) {
					System.out.println("Driver Insured");
				}else {
					System.out.println("Driver NOT Insured");
				}
			}
		}
		
	}
}
