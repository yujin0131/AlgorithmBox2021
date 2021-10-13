package davio;

import java.util.ArrayList;


public class Four {
	private static int cnt;
	private static ArrayList<Integer> list;
	private static int answer = 0;
	public static int solution(int[] nums) {
        
        int size = nums.length;
        boolean[] check = new boolean[size];
     
        list = new ArrayList<Integer>();
        comb(nums, check, 0, size, 3);
        
        
        return answer;
    }
	

	public static void comb(int[] nums, boolean[] check, int start, int n, int r) {
		if(r == 0) {
			int num = 0;
			for(int i = 0; i < n; i++) {
				if(check[i]) {
					num += nums[i];
				}
			}
			
			int size = (int)Math.sqrt(num);
			boolean primeCheck = true;
			for(int i = 2; i <= size; i++) {
				if(num % i == 0) {
					primeCheck = false;
					break;
				}
			}
			answer = primeCheck == true ? answer+1 : answer;
			
			
		}else {
			
			for(int i = start; i< n; i++) {
				check[i] = true;
				comb(nums, check, i + 1, n , r - 1);
				check[i] = false;
				
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int result = solution(nums);
		System.out.println(result);
	}
}
