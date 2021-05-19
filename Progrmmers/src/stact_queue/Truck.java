package stact_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 1;

		Queue<Integer> wait = new LinkedList<>();
		Queue<Integer> current = new LinkedList<>();
		Queue<Integer> end = new LinkedList<>();
		int time[] = new int[truck_weights.length];
		for(int i = 0; i < truck_weights.length; i++) 
			wait.add(truck_weights[i]);

		int count = wait.size();
		int num = wait.poll();
		int start = 0;
		
		while(end.size() < count) {
			if(num != 0 && sum(current, num) <= weight) {
				current.add(num);
				num = wait.size() == 0 ? 0 : wait.poll();
			}

			for(int i = start; i < start + current.size(); i++) {
				time[i]++;
			}
			
			if(time[start] == bridge_length) {
				end.add(current.poll());
				start++;
			}
			answer++;
		}

		return answer;
	}

	public static int sum(Queue c, int num) {
		int sum = num;
		int size = c.size();
		if(size != 0){
			for(int i = 0; i < size; i++) {
				sum += (int) c.peek();
				c.add(c.poll());
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};

		int result = solution(bridge_length, weight, truck_weights);
		System.out.println("결과 : " + result);
	}
}
