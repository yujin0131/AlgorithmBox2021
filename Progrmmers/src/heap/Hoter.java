package heap;

import java.util.ArrayList;
import java.util.Collections;

public class Hoter {

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int temp : scoville) {
			list.add(temp);
		}

		int min = 0;
		while(min <= K) {
			min = Collections.min(list);
			int index = list.indexOf(min);
			list.remove(index);
			int next_min = Collections.min(list);
			int next_index = list.indexOf(next_min);
			
			min = min + (next_min * 2);
			list.remove(next_index);
			list.add(min);
			
			answer++;
			if(list.size() == 1 && list.get(0) < K) {
				answer = -1;
				break;
			}
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
