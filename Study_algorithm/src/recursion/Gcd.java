package recursion;

public class Gcd {

	public static int gcd(int x, int y) {
		System.out.println("gcd : " + x + " " +y);
		if(y==0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
		
	}
	
	public static void main(String[] args) {
		
		int x = 8;
		int y = 22;
		int gcd = gcd(x, y);
		System.out.println(gcd);
		
		System.out.println("=========");
		int[] arr = {12,7,24,16,8}; // 3 6 4
		int start = 0;
		int end = arr.length;
		int gcdarr = gcdarr(arr, start, end);
		System.out.println(gcdarr);
	}
	
	public static int gcdarr(int[] arr, int start, int end) {
		System.out.println("gcdarr : " +arr.length + " " + start+ " " + end);
		
		if(end == 1) {
			return arr[start];
		}else if(end == 2){;
			return gcd(arr[start], arr[start+1]);
		}else {
			return gcd(arr[start], gcdarr(arr, start+1, end-1));
		}
	
	}
}
