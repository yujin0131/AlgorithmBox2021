package recursion;

public class Lcm {

	public static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
		
	}
	
	public static int solution(int[] arr) {

		int start = 0;
		int end = arr.length;
		int gcd = gcdarr(arr, start, end);
		int answer = gcd;
		
		System.out.println(answer);
		
		for(int i = 0; i < arr.length; i++) {
			answer *= arr[i] / gcd;
		}
		
		return answer;
	}

	public static void main(String[] args) {

		int[] arr = {3,4,9,16}; // 3 6 4
		
		int result = solution(arr);
		System.out.println(result);
		

	}

	public static int gcdarr(int[] arr, int start, int end) {

		if(end == 1) {
			return arr[start];
		}else if(end == 2){;
		return gcd(arr[start], arr[start+1]);
		}else {
			return gcd(arr[start], gcdarr(arr, start+1, end-1));
		}

	}
}
