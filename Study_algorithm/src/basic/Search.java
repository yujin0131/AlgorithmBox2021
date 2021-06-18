package basic;

public class Search {
	public static int linear(int[] arr, int n) {
		int fi = 0; //first_index
		int li = arr.length-1; //last_index
		do {
			int mi = (fi + li) / 2; // middle_index
			if(arr[mi] == n) {
				return mi;
			}else if(arr[mi] < n){
				fi = mi +1;
			}else {
				li = mi -1;
			}
		}while(fi <= li);
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,7,15,28,29,31,39,58,68,70,95};
		int n = 39;
		
		int result = linear(arr, n);
		System.out.println(result);
	}
}
