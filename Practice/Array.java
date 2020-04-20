package Practice;

public class Array {
	
	private int[] items;
	private int count;
	private int x;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void print() {
		for(int i=0; i<count; i++) {
			System.out.print(items[i]+" ");
		}
	}
	
	public void insert(int item) {
		//if the array is full, resize it
		//add the new value at the end
		items[count++] = item;
		
		if(items.length==count) {
			//create new array(twice thje size)
			int[] newItems = new int[count*2];
			//copy all the existing items
			for(int i=0;i<count;i++) {
				newItems[i] = items[i];
			}
		//set "items" to this new array
			items = newItems;
		}
	}
	public void removeAt(int index) {
		//validate the index
		if(index<=0||index>=count) {
			throw new IllegalArgumentException();
		}
		//shift the items to the left to fill
		for(int i=index; i<count;i++) {
			items[i] = items[i++];
		}
		count--;
	}
	public int indexOf(int item){
		//if we find it, return index
		//Otherwise, return -1
		for(int i=0;i<count;i++) {
			if(items[i] == item) {
				return i;
			}
		}
		return -1;
	}
}
