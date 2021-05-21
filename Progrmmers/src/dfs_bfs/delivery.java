package dfs_bfs;

/* https://programmers.co.kr/learn/courses/30/lessons/12978 */

public class delivery {
	public static int solution(int N, int[][] road, int K) {
		int answer = 0;
		int[][] order = new int[N][N];

		for(int i = 0; i < road.length; i++) {
			int a = road[i][0]-1;
			int b = road[i][1]-1;

			if(order[a][b] != 0 ) {
				order[a][b] =road[i][2] < order[a][b] ? road[i][2] : order[a][b];
				order[b][a] =road[i][2] < order[b][a] ? road[i][2] : order[b][a];
			}else {
				order[a][b] = road[i][2];
				order[b][a] = road[i][2];
			}
		}

		int distance[] = new int[N];
		boolean visit[] = new boolean[N];

		for(int i = 0; i < N; i++)
			distance[i] = Integer.MAX_VALUE;

		distance[0] = 0;
		visit[0] = true;

		for(int i = 0; i < N; i++) {
			if(!visit[i] && order[0][i] != 0) 
				distance[i] = order[0][i];
		}

		for(int a = 0; a < N-1; a++) {
			int min_distance = Integer.MAX_VALUE;
			int min_index = 0;


			for(int i = 0; i < N; i++) {
				if(!visit[i] && min_distance > distance[i]) {
					min_distance = distance[i];
					min_index = i;
				}
			}
			visit[min_index] = true;

			for(int i = 0; i < N; i++) {
				if(!visit[i] && order[min_index][i] != 0) {				
					if(distance[i] > distance[min_index] + order[min_index][i])
						distance[i] = distance[min_index] + order[min_index][i];
				}
			}
		}

		for(int i = 0; i < distance.length; i++) {
			if(distance[i] <= K)
				answer++;
		}

		return answer;
	}

	public static void main(String[] args) {

		int N = 6;
		int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
		int K = 4;

		int result = solution(N, road, K);
		System.out.println(result);

	}
}
