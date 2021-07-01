package bfs_dfs;

public class Dijkstra {
	private static int n;
	private static int maps[][];

	public Dijkstra(int n) {
		this.n = n;
		maps = new int[n][n];	 
	}

	public void input(int i, int j, int k) {
		maps[i][j] = k;
		maps[j][i] = k;
	}

	public static int[] solution(int s) {

		int distance[] = new int[n];
		boolean check[] = new boolean[n]; //boolean은  초기값 false

		for(int i = 0; i < distance.length; i++) { // distance 최대값으로 초기화
			distance[i] = Integer.MAX_VALUE;
		}

		distance[s] = 0;
		check[s] = true;

		for(int i = 0; i < n; i++) { //첫 연결노드 distance갱신
			if(!check[i] && maps[s][i] != 0) {
				distance[i] = maps[s][i];
			}
		}

		for(int a = 0; a < n-1; a++) { //다익스트라의 반복수는 n-1이면 된다.
			int min_distance = Integer.MAX_VALUE;
			int min_index = -1;

			for(int i = 0; i < n; i++) { // disance들 중 최소값 찾기
				if(!check[i] && min_distance > distance[i]) {
					min_distance = distance[i];
					min_index = i;

				}
			}

			check[min_index] = true;

			for(int i =0; i < n; i++) { //새로간 노드랑 연결된 distance 갱신
				if(!check[i] && maps[min_index][i] != 0) {
					if(distance[i] > distance[min_index] + maps[min_index][i]) {
						distance[i] = distance[min_index] + maps[min_index][i];
					}
				}
			}


		}

		return distance;

	}


	public static void main(String[] args) {
		Dijkstra d = new Dijkstra(8);
		d.input(0, 1, 3);
		d.input(0, 4, 4);
		d.input(0, 3, 4);
		d.input(1, 2, 2);
		d.input(2, 3, 1);
		d.input(3, 4, 2);
		d.input(4, 5, 4);
		d.input(3, 6, 6);
		d.input(6, 5, 3);
		d.input(2, 7, 3);
		d.input(5, 7, 2);

		int result[] = solution(0);

		for(int i = 0; i <result.length; i++) {
			System.out.printf(result[i] + " ");
		}

	}
}
