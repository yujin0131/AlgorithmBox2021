package greedy;

/* https://programmers.co.kr/learn/courses/30/lessons/76503 */

public class Weight {
	private static int[][] weight;

	/* 트리
	 * 	01010 
		00000 
		00010 
		00001 
		00000 
	 */
	public static long solution(int[] a, int[][] edges) {
		long answer = -1;	
		int s = a.length;
		weight = new int[s][s];
		
		for(int i = 0; i < edges.length; i++) {
			int x = edges[i][0];
			int y = edges[i][1];
			weight[x][y] = 1;
		}
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		if(sum == 0) {
			
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] a = {-5,0,2,1,2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};

		long result = solution(a, edges);
		System.out.println(result);
	}
}
