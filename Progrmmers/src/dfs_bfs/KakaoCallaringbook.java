package dfs_bfs;

public class KakaoCallaringbook {

	static int numberOfArea = 0;
	static int maxSizeOfOneArea = 0;
	static int cnt = 0;
	static boolean[][] picCheck;
	public static void bfs(int[][] picture, boolean[][] picCheck, int m, int n, int x, int y) {

		//if(picCheck[y][x]) return;
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};

		picCheck[y][x] = true;
		cnt++;

		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			System.out.println(nx + " " + ny + " ");
			
			if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
			
			if(picture[y][x] == picture[ny][nx] && !picCheck[ny][nx]) {
				bfs(picture, picCheck, m, n, nx, ny);
			}

		}
	}

	public static int[] solution(int m, int n, int[][] picture) {

		int x = 0;
		int y = 0;

		picCheck = new boolean[m][n];

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(picture[i][j] != 0 && !picCheck[i][j]) {
					numberOfArea++;
					bfs(picture, picCheck, m, n, j, i);
				}
				
				if(cnt > maxSizeOfOneArea) maxSizeOfOneArea = cnt;
				
				cnt = 0;
			}
		}
		bfs(picture, picCheck, m, n, x, y);


		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;



		return answer;
	}

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

		// 1 1 1 0
		// 1 2 2 0
		// 1 0 0 1
		// 0 0 0 1
		// 0 0 0 1
		// 0 0 0 3
		// 0 0 0 3

		int[] result = solution(m , n, picture);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

/*
  boolean[][] picCheck = new boolean[m][n];

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        qx.add(x);
        qy.add(y);
        picCheck[y][x] = true;
        if(picture[y][x] != 0) {
			map.put(picture[y][x], 1);
        }
        while(!qx.isEmpty()) {
        	x = qx.poll();
        	y = qy.poll();
        	System.out.println("오나");
        	for(int i = 0; i < 4; i++) {
        		int nx = x + dx[i];
        		int ny = y + dy[i];
        		System.out.println(nx + " " + ny + " ");
        		if(nx >= 0 && ny >= 0 && nx < n && ny < m && picCheck[ny][nx] == false) {
        			picCheck[ny][nx] = true;
        			qx.add(nx);
        			qy.add(ny);
        			if(!map.containsKey(picture[ny][nx]) && picture[ny][nx] != 0) {
        				map.put(picture[ny][nx], 1);
        			}else if(picture[ny][nx] != 0){
        				map.put(picture[ny][nx], map.get(picture[ny][nx])+1);
        			}

        			System.out.println("map : " +picture[ny][nx] + " "+ map.get(picture[ny][nx]));
        		}
        	}

        }

 */
