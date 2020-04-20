package DivAndCon;

public class TowerOfHanoi {

	static void TowerOfHanoi(int n,char from_rod,char to_rod, char aux_rod) {
		
		if(n==1) {
			System.out.println("Move disk 1 from rod "+from_rod+" to rod "+to_rod);
			return;
		}
		
		TowerOfHanoi(n-1,from_rod,aux_rod,to_rod);
		System.out.println("Move disk "+n+" from rod "+from_rod+" to rod "+to_rod);
		TowerOfHanoi(n-1,from_rod,to_rod,aux_rod);
	}
	
	public static void main(String[] args) {
		TowerOfHanoi(3,'A','B','C');
	}

}
