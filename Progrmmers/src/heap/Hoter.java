package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Hoter {

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int sco : scoville) {
			queue.add(sco);
		}

		int reSco = 0;
		while(queue.peek() < K && queue.size() > 1) {
			reSco = queue.poll() + queue.poll() * 2;
			queue.add(reSco);
			answer++;
		}
		
		answer = queue.peek() < K ? -1 : answer;
		return answer;
	}
	
	public static void main(String[] args) {
		int[] scoville = {1,2,3};
		int K = 11;
		int result = solution(scoville, K);
		System.out.println(result);
	}
}
