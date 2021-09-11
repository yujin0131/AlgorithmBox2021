package thirdOne;

import java.util.Arrays;

public class One {

	public static int solution(int[] numbers) {
	      int answer = 0;
			Arrays.sort(numbers);
			int size = numbers.length;
			int count = 0;
			
			for(int i = 0; i < 10; i++) {
				if(count < size && i == numbers[count]) {
					
					count++;
				}else {
					answer += i;
				}
			
			}
	        return answer;
	    }

	public static void main(String[] args) {
		//		
		//		
		////		int result = solution();
		////		System.out.println(result);
		int[]numbers = {1,2,3,4,6,7,8,0};
		int result = solution(numbers);
		//		for(int i = 0; i < result.length; i++) {
		System.out.println(result);
		//		}
	}
}
