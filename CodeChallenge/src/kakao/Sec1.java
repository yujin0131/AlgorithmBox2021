package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


class Node{
	int x;
	int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sec1 {
	public static int solution(int[][] map) {
		ArrayList list = new ArrayList();
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		boolean[][] visit = new boolean[map.length][map[0].length];
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(1,1));
		visit[0][0] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			int cnt = map[node.x][node.y]+1;
			for(int i = 0; i < 4; i++) {
				int xx = node.x+dx[i];
				int yy = node.y+dy[i];
				if(0<=xx &&xx <map[0].length && 0 <=yy && yy <map.length ) {
					if(map[xx][yy]!=0 && !visit[xx][yy]) {
						visit[xx][yy] = true;
						map[xx][yy]=cnt;
						q.offer(new Node(xx,yy));
					}
				}
			}
		}
		
		return 0;
	}
	

	
	public static void main(String[] args) {
		int[][] map = {{1,1,1,1,1,1},{0,0,1,0,0,1},{1,1,1,0,1,1},{1,0,0,0,1,0},{1,1,1,0,1,0},{0,0,1,1,1,1}};
		int result = solution(map);
		System.out.println(result);
		System.out.println(map[map.length-1][map[0].length-1]);
	}
}
