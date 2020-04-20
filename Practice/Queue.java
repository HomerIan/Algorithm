package Practice;
import java.util.*;
	class Queue {
		
		private int arr[];         // array to store queue elements
	    private int front;         // front points to front element in the queue
	    private int rear;          // rear points to last element in the queue
	    private int capacity;      // maximum capacity of the queue
	    private int count;         // current size of the queue
	    
	    // Constructor to initialize queue
	    Queue(int size){
	        
	    	arr = new int[size];
	        capacity = size;
	        front = 0;
	        rear = -1;
	        count = 0;
	    }	 
	    // Utility function to remove front element from the queue
	    public void dequeue(){
	 
	        front = (front + 1) % capacity;
	        count--;
	    }
	    // Utility function to add an item to the queue
	    public void enqueue(int value){	 
	     rear = (rear + 1) % capacity;
	        arr[rear] = value;
	        count++;
	    }
	 
	    // Utility function to return front element in the queue
	    public int peek(){
	    		
	        return front;
	    }
	 
	    // Utility function to return the size of the queue
	    public int size(){
	        
	    	return count;
	    }
	 
	    // Utility function to check if the queue is empty or not
	    public Boolean isEmpty(){
	        
	    	return (size() == 0);
	    }
	 
	    // Utility function to check if the queue is empty or not
	    public Boolean isFull(){
	        
	    	return (size() == capacity);
	    }
	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
			boolean YN=true;
			char quest;
			System.out.print("Enter Queue size: "); 
				int size= in.nextInt();
				System.out.println("\rQueue size: " + size);
				//size of the QUEUE
				Queue q = new Queue(size);
			
		while(YN) {
			System.out.print("\tMENU\n"+
					"1.Enqueue\n"+
					"2.Dequeue\n"+
					"3.CHECK EMPTY/FULL\n"+
					"4.Display\n"+
					"5.Exit\n"+
					"Choice: ");
						char choice = in.next().charAt(0);
		switch(choice) {
			case '1': System.out.println("\tENQUEUE");
				
				if(q.isFull()) {
					System.out.println("-----OVERFLOW-----");
				}else {
					System.out.print("Insert Value: "); 
					int value= in.nextInt();
					 q.enqueue(value);
					 System.out.println("SUCCESSFULLY ADDED!");
				}
				/*System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}*/
				break;
			case 2: System.out.println("\tDEQUEUE");
				if(q.isEmpty()) {
					System.out.println("-----UNDERFLOW-----");
				}else {
					q.dequeue();
					System.out.println("SUCCESSFULLY DELETED!");
				}
				/*System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}*/
				break;
			case 3: System.out.println("\tCHECK EMPTY/FULL "
					+ "(Determine if QUEUE is EMPTY)");
				if(q.isEmpty()) {
					System.out.println("QUEUE IS EMPTY!");
				}else {
					System.out.println("QUEUE IS FULL!");
				}
				/*System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}*/
				break;
			case 4: System.out.print("\tDISPLAY");
				System.out.println("QUEUE SIZE :"+size);
				System.out.println("Front: "+q.peek());
				System.out.println("Rear: "+q.size());
				
				/*System.out.print("would you like to try another set of input? [Y/N] : ");
				quest=in.next().charAt(0);
					if(quest=='N'||quest=='n') {
					YN=false;
				}*/
				break;
			case 5: System.out.println("THANK YOU PO! EXIT IS THIS WAY ->");
				break;
			}        
		}		
	}
}
