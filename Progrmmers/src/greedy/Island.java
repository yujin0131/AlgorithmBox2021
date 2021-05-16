package greedy;
/* https://programmers.co.kr/learn/courses/30/lessons/42861 */

public class Island {
	
	public static int solution(int n, int[][] costs) {
		int answer = 0; 
		int cost[][] = new int[n][n];
		
		for(int i = 0; i < costs.length; i++) {
			int a = costs[i][0];
			int b = costs[i][1];
			cost[a][b] = costs[i][2];
		}
		
		int[] distance = new int[n];
		boolean[] check = new boolean[n];
		
		for(int i = 0; i < distance.length; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		distance[0] = 0;
		check[0] = true;
		
		for(int i = 0; i < n; i++) {
			if(!check[i] && cost[0][i] != 0) {
				distance[i] = cost[0][i];
			}
		}
		
		for(int a = 0; a < n-1; a++) {
			int min_distance = Integer.MAX_VALUE;
			int min_index = -1;
			
			for(int i = 0; i < n; i++) {
				if(!check[i] && min_distance > distance[i] ) {
					min_distance = distance[i];
					min_index = i;
				}
			}
			
			check[min_index] = true;
			
			for(int i = 0; i < n; i++) {
				if(!check[i] && cost[min_index][i] != 0) {
					if(distance[i] > distance[min_index] + cost[min_index][i]) {
						distance[i] = distance[min_index] + cost[min_index][i];
					}
				}
			}
		}
		
		answer = distance[n-1];
	
		return answer;
		
		
		
	}
	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		
		int result = solution(n, costs);
		System.out.println(result);
	}
}
