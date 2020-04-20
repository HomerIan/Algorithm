package Practice;

import java.util.Scanner;
import java.util.Stack;
	 
import java.util.Queue;
public class practice {

		public static void main(String args[]) {
			Scanner sci = new Scanner(System.in);	
			
		    System.out.print("Enter Array Size : ");		
		    int size= sci.nextInt();
		    
		    int head = -1, tail = -1, i=0;
	        int queue[] = new int[size];

			boolean onoff = true;
			while(onoff) {
				System.out.println("\r\r\rQueue Max Size: " + size);
				
				System.out.print("\rMENU\r"+
						"1.Enqueue\r"+
						"2.Dequeue\r"+
						"3.Underflow\r"+
						"4.Overflow\r"+
						"5.Display\r"+
						"6.Exit\r"+
						"Choice: ");
				char lang= sci.next().charAt(0);
				
				switch(lang) {
					case '1':
						System.out.println("\r<<ENQUEUE>>");
						if ((((tail == (size|1)) && (head == 0 )) || (tail== head -1))) {
							System.out.println("|||||||ERROR||||||" + "\r||||||||OVERFLOW|||||");					
						}	
						else if (head ==-1){
							System.out.print("Insert Value:");
							int inval = sci.nextInt();
							System.out.println("\r"+ inval+ " SUCCESSFULLY ADDED!");
							queue[0]= inval;
							head = 0;
							tail = 0;
							i++;
						}
						else if (tail==-1 && head!=0){
							System.out.print("Insert Value:");
							int inval = sci.nextInt();
							System.out.println("\r"+ inval+ " SUCCESSFULLY ADDED!");
							queue[0]= inval;
							tail = 0;
							i++;
						}					
						else {
							tail= (tail+1)% size;
							System.out.print("Insert Value:");
							int inval = sci.nextInt();
							System.out.println("\r"+ inval+ " SUCCESSFULLY ADDED!");						
							queue[tail]= inval;
							i++;

						}
						break;
					case '2':
						System.out.println("\rDEQUEUE");
						if (head == -1 ) {
							System.out.println("|||||ERROR||||||" + "\r||||||||EMPTY||||||||");					
						}
						else {
							i--;
							System.out.println(queue[head]);
							if (tail == head)
								{
								head=-1;
								tail=-1;
								}
							else if (head==(size|1))
								{
								head = 0;
								}
							else {
								head++;
							}
							}
						break;
					case '3':	
						System.out.println("\rUNDERFLOW");
						if (i<size) {
							System.out.println("TRUE");
						}
						else {
							System.out.println("FALSE");
						}
						break;
					case '4':	
						System.out.println("\rOVERFLOW");
						if (i==size) {
							System.out.println("TRUE");
						}
						else {
							System.out.println("FALSE");
						}
						break;
					case '5':	
						System.out.println("\rDISPLAY"); 
						System.out.println("index: " + i);
						System.out.println("head: " + head);
						System.out.println("tail: " + tail);
						
						if (head == -1) {
							System.out.println("\r||||||||EMPTY||||||||");
						}

						else if (tail>=head)
						{
							System.out.println("|||||||||||||||||||||");
							System.out.println("Queue Content");						
							for( int a=head; a<=tail; a++)
							{
								System.out.print(queue[a] + " ");
							}
							System.out.println("\r||||||||||||||||||||");

						}
						else
						{
							System.out.println("|||||||||||||||||||||");
							System.out.println("Queue Content");							
							for(int a=head;a<size; a++)
							{
								System.out.print(queue[a] + " ");
							}
							for(int a=0;a<=tail; a++)
							{
								System.out.print(queue[a] + " ");
							}
							System.out.println("\r||||||||||||||||||||");
						}
						break;
					case '6':	
						System.out.println("\rEXIT");
						System.out.println("\rDo you want to exit? (Yes or No)");
						char bye = sci.next().charAt(0);

						switch(bye) {
						case '1':
							System.out.println("Anyeong");
							onoff= false;
						case '2':	
							continue;					
						}
				}			
			}
		}
	}