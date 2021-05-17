package stact_queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Printer {

	public static int solution(int[] priorities, int location) {
		int answer = 1;

		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < priorities.length; i++) {			
			q.add(priorities[i]);
			pq.add(priorities[i]);
		}

		while(q.size() > 0) {
			if(q.peek() != pq.peek()) {
				q.add(q.poll());
				location = location > 0 ? location-1 : q.size()-1;
				
			}else {
				if(location == 0)
					break;
				q.remove();
				pq.remove();
				location--;
				answer++;
			}
		}

		return answer;
	}



	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		int result = solution(priorities, location);

		System.out.println(result);
	}
}

/* 		2번째 푼 방법

 		int answer = 1;
		int check = 0;
		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < priorities.length; i++) {			
			q.add(priorities[i]);
			pq.add(priorities[i]);
		}

		while(q.size() > 0) {
			if(q.peek() != pq.peek()) {
				q.add(q.poll());
				if(check == location)
					location += q.size();
				check++;

			}else {
				if(location == check)
					break;
				q.remove();
				pq.remove();
				check++;
				answer++;
			}
		}

 */

/* 		처음 푼 방법
 		int answer = 1;

		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < priorities.length; i++) {			
			q.add(priorities[i]*10 + i);
			pq.add(priorities[i]);
		}

		while(q.size() > 0) {
			int check = q.peek() / 10;
			if(check != pq.peek()) {
				q.add(q.poll());

			}else {
				if(q.peek() % 10 == location)
					break;
				q.remove();
				pq.remove();
				answer++;
			}
		}
 */