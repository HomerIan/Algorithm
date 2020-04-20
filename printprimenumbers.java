package DivAndCon;

public class printprimenumbers {

	public static void findprimenumbers(int start,int end) {
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int n) {
		
		if(n%2==0) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		findprimenumbers(1,50);

	}

}
