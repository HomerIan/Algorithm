package Practice;
import java.util.*;
public class ArrayAlgo {
	
	public static void main(String[] args) {
		
			Array num = new Array(3);
			num.insert(1);
			num.insert(2);
			num.insert(3);
			//num.removeAt(3);
			System.out.println(num.indexOf(4));
			num.print();
	}

}
