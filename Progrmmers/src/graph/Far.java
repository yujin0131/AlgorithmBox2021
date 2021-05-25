package graph;

public class Far {
	public static int solution(int n, int[][] edge) {
		int answer = 0;

		int node[][] = new int[n][n];

		for(int i = 0; i < edge.length; i++) {
			int x = edge[i][0] - 1 ;
			int y = edge[i][1] - 1;

			node[x][y] = node[y][x] = 1;
		}

		boolean visit[] = new boolean[n];
		int distance[] = new int[n];

		for(int i = 1; i < distance.length; i++) {
			distance[i] =  50001;
		}

		visit[0] = true;

		for(int i = 1; i < n; i++) {
			if(!visit[i] && node[0][i] == 1) {
				distance[i] = 1;
			}
		}

		for(int a = 0; a < n-1; a++) {
			int min_dis =  20001;
			int min_index = -1;

			for(int i = 0; i < n; i++) {
				if(!visit[i] && min_dis > distance[i]) {
					min_dis = distance[i];
					min_index = i;
				}
			}
			visit[min_index] = true;


			for(int i = 0; i < n; i++) {
				if(!visit[i] && node[min_index][i] == 1) {
					if(distance[i] > distance[min_index] + 1) {
						distance[i] = distance[min_index] + 1;
					}
				}
			}
		}


		int far = 0;
		for(int i = 0; i < n; i++) {
			if(distance[i] > far) {
				far = distance[i];
				answer = 1;
			}else if(distance[i] == far) {
				answer++;
			}
		}


		return answer;
	}

	public static void main(String[] args) {
		int n = 6;
		int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};

		int result = solution(n, edge);
		System.out.println(result);
	}
}
