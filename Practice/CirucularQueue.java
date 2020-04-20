package Practice;
import java.util.*;
import java.util.Queue;
public class CirucularQueue {

	public static void main(String[] args) {
		int front=-1, rear=-1;
		boolean close=true,anotherOne=true;
	
		Scanner sci= new Scanner (System.in);
		System.out.print("Enter Queue size: "); int size= sci.nextInt();
		System.out.println("\rQueue size: " + size);
		//int queue[]= new int[size];
		Queue<Integer> queue = new LinkedList<>(); 
		while(close) {
		System.out.print("\tMENU\n"+
							"1.Enqueue\n"+
							"2.Dequeue\n"+
							"3.check EMPTY (Determine if QUEUE is EMPTY)\n"+
							"4.check FULL  (Determine if Stack is FULL)\n"+
							"5.Display\n"+
							"6.Exit\n"+
							"Choice: ");
			char lang= sci.next().charAt(0);

		switch(lang){
				case '1': System.out.println("\r\tENQUEUE");
				if(queue.size()>=size) {
				System.out.println("-----OVERFLOW-----");
				}else {
					front=0;
					rear=0;
				System.out.print("Insert Value: "); 
					int value= sci.nextInt();
					System.out.println("SUCCESSFULLY ADDED!");
						queue.add(value);
						System.out.println(queue);
						System.out.println("Front: "+((LinkedList<Integer>) queue).indexOf(queue.peek()));
						System.out.println("Rear: "+((LinkedList<Integer>) queue).indexOf(queue.size()));
				}
				break;
		
			case '2': System.out.println("\tDEQUEUE");
				if (queue.isEmpty()){
					System.out.println("-----UNDERFLOW-----");
				}else{
					queue.remove();
					System.out.println("SUCCESSFULLY DELETED!");
					System.out.println(queue);
					System.out.println("Front: "+((LinkedList<Integer>) queue).indexOf(queue.peek()));
					int QueueSize = queue.size();
					System.out.println("Rear: "+(QueueSize-=1));
					}
					break;
		
			case '3': System.out.println("\t\tUNDERFLOW");
				if(rear==0){
					System.out.println("TRUE");
				}else if (rear==size){
					System.out.println("FALSE");
				}else{
					System.out.println("TRUE");
				}
				break;
		
			case '4': System.out.println("\t\tOVERFLOW");
				if(rear<=0){
					System.out.println("FALSE");
				}else if (rear==size){
					System.out.println("TRUE");
				}else{
					System.out.println("FALSE");
				}
				break;
		case '5': int i=0; 
			System.out.println("\r\tDISPLAY");
			if(rear==0) {
				System.out.println("NO QUEUE FOUND");
			}else{
				System.out.print("\rQUEUE CONTENT: ");
				System.out.println(queue);
				System.out.println("Front: "+queue.peek());
				System.out.println("Rear: "+queue.size());
				}
				break;
		
		case '6': System.out.println("\rEXIT");
				close=false; break;
				default: System.out.println("Invalid");
				}
			}
	}

}
