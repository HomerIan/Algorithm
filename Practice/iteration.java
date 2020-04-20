package Practice;
import java.util.Scanner;
public class iteration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=0;
		boolean YN=true;
		char quest;
		
		System.out.print("Enter Number: ");
		num=in.nextInt();
		
			while(YN){
			System.out.println("CHOICES\n"
					+"1. FACTORIAL\n"
					+"2. SUMMATION\n"
					+"3. Fibonacci\n"
					+"4. EXIT\n");
			System.out.print("CHOOSE: ");
			int choice = in.nextInt();
			
			switch(choice){
			case 1: System.out.println("FACTORIAL");
				System.out.println("FACTORIAL of "+num+" is "+fact(num));
				System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}
				break;
			case 2: System.out.println("SUMMATION");
				System.out.println("SUMMATION OF "+num+" is "+summ(num));
				System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}
				break;
			case 3: System.out.println("Fibonacci");
				System.out.print("Enter first number: ");
				int num1 = in.nextInt();
				System.out.print("Enter Second number: ");
				int num2 = in.nextInt();
				fib(num,num1,num2);
				System.out.println();
				System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}
				break;
			case 4: System.out.print("EXIT");
				YN=false;
				break;
				}
			
			}

			}
			static int fact(int num){
				int factorial=1;
				for(int i=num;i>0;i--){
				factorial*=i;
				}
				return factorial;
			}
			static int summ(int num){
				int sum=0;
				for(int i=1;i<=num;i++){
				sum+=i;
				}
				return sum;
			}
			static void fib(int num, int num1,int num2){
				System.out.print(num1+" "+num2);
				int fib=0;
				for(int i=2;i<num;i++){
				fib=num1+num2;
				System.out.print(" "+fib);
				num1=num2;
				num2=fib;
				}
			}
}
