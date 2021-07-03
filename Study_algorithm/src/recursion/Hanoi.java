package recursion;

public class Hanoi {
	static int count = 0;
	
	public static int move(int disk, int x, int y) {
		
		System.out.println("==================");
		if(disk > 1) {
			System.out.println("오나1 : " + disk + " " + x + " " + y);
			move(disk - 1, x, 6 - x - y);
		}
		
		count++;
		System.out.println("중간1 : " + disk + " " + x + " " + y);	
		if(disk > 1){
			System.out.println("오나2 : " + disk + " " + x + " " + y);
			move(disk - 1, 6 - x - y, y);
		}
		
			
		
		return count;
	}
	
	public static void main(String[] args) {
		int disk = 4;
		
		int result = move(disk, 1, 3);
		System.out.println(result);
	}
}
