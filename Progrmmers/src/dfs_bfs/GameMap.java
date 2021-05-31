package dfs_bfs;

public class GameMap {

	static int cnt = 0;
	static int[] dx;
	static int[] dy;
	static int[] dl;
	
	public static int solution(int[][] maps) {
		int answer = -1;
		
		dx = new int[maps.length * maps[0].length];
		dy = new int[maps.length * maps[0].length];
		dl = new int[maps.length * maps[0].length];

		int pos = 0;
		inqueue(0,0,1); //첫 좌표
		while(pos < cnt && (dx[pos] != maps[0].length - 1 || dy[pos] != maps.length -1)) {
			maps[dy[pos]][dx[pos]] = 0;
			if (dy[pos] > 0 && maps[dy[pos] - 1][dx[pos]] == 1) {
				inqueue(dx[pos], dy[pos] - 1, dl[pos] + 1);
			}
			if (dy[pos] <  maps.length -1 && maps[dy[pos] + 1][dx[pos]] == 1) {
				inqueue(dx[pos], dy[pos] + 1, dl[pos] + 1);
			}
			if (dx[pos] > 0 && maps[dy[pos]][dx[pos] - 1] == 1) {
				inqueue(dx[pos] - 1, dy[pos], dl[pos] + 1);
			}
			if (dx[pos] < maps[0].length - 1 && maps[dy[pos]][dx[pos] + 1] == 1) {
				inqueue(dx[pos] + 1, dy[pos], dl[pos] + 1);
			}
			
			pos++;

			System.out.println(dl[pos] + " / " + cnt + " / " + pos);
		}
		
		if(pos <= cnt) {
			answer = dl[pos];
		}
		
		return answer;
	}
	
	public static void inqueue(int x, int y, int l) {
		dx[cnt] = x;
		dy[cnt] = y;
		dl[cnt] = l;
		cnt++;
	}
	
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int result = solution(maps);
		System.out.println(result);
	}

}
