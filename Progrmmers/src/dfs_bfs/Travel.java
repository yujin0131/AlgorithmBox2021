package dfs_bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class Travel {

	public static String[] solution(String[][] tickets) {
		//Queue<String> q = new LinkedList<>();
		List<String> list = new ArrayList<>();
		String first = "ICN";
		boolean check[] = new boolean[tickets.length+1];
		int min_i = 0;
		int count = 0;
		while ( count < tickets.length) {

			//q.add(first);
			list.add(first);
			
			min_i = -1;
			String min_t = "";
			
			for(int i = 0; i < tickets.length; i++) {
				if( !check[i] && tickets[i][0].equals(first)) {
					if(min_i != -1 && min_t.compareTo(tickets[i][1]) < 0) {
						continue;
					}
					min_i = i;
					min_t = tickets[i][1];
				}
			}
			
			first = min_t;
			check[min_i] = true;
			count++;
		
		}
		
		list.add(tickets[min_i][1]);
		//q.add(tickets[min_i][1]);
		
//		String[] answer = new String[q.size()];

//		for(int i = 0; i < answer.length; i++) {
//			answer[i] = q.poll();
//		}
		String[] answer = list.toArray(new String[list.size()]);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		return answer;
	}


	public static void main(String[] args) {

		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String result[] = solution(tickets);


	}
}
