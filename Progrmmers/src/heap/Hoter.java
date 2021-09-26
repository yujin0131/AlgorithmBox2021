package heap;

import java.util.ArrayList;

public class Hoter {

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int temp : scoville) {
			list.add(temp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		int result = solution(scoville, K);
		System.out.println(result);
	}
}
