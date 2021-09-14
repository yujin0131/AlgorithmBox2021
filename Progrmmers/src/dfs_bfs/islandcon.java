package dfs_bfs;

public class islandcon {
	public static int solution(int n, int[][] costs) {
		int answer = 0;
		
		int[][] island = new int[n][n];
		int size = costs.length;
		boolean[][] check = new boolean[n][n];
		for(int i = 0; i < size; i++) {
			island[costs[i][0]][costs[i][1]] = costs[i][2];
			island[costs[i][1]][costs[i][0]] = costs[i][2];
		}
		
		
		// 0 1 2 0
		// 1 0 5 1
		// 2 5 0 8
		// 0 1 8 0
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0,1,1,},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		
		int result = solution(n, costs);
		System.out.println(result);
	}
}
