package bfs;

import java.util.LinkedList;
import java.util.Queue;

import sun.security.provider.certpath.Vertex;

public class Bfs {
	public static void main(String[] args) {
		/*	
		  	def solution(v):
		    result = [0, 0, 0]
		    dx = [0, 1, 0, -1]
		    dy = [1, 0, -1, 0]
		    visited = [[0 for j in range(len(v)+2)] for i in range(len(v)+2)]
		    q = []

		    for i in range(len(v)):
		        for j in range(len(v)):

		            if visited[i][j] == 0:
		                typeNum = v[i][j]
		                q.append([i, j])
		                while True:
		                    if len(q) == 0:
		                        result[typeNum] += 1
		                        break
		                    else:
		                        qindex = q.pop(0)
		                        qx = qindex[0]
		                        qy = qindex[1]
		                        for idx in range(4):
		                            nextX = qx + dx[idx]
		                            nextY = qy + dy[idx]
		                            if nextX < len(v) and nextX >= 0 and nextY >= 0 and nextY < len(v):
		                                if v[nextX][nextY] == typeNum and visited[nextX][nextY] == 0:
		                                    q.append([nextX, nextY])
		                                    visited[nextX][nextY] = 1
		    # if visited[len(v)-1][len(v)-1] == 0:
		    #    result[v[len(v)-1][len(v)-1]] += 1
		    print(result)

		    # 이자식은 BFS로 큐써서 같은 숫자 판별해서 더해서 어레이인덱스값에 더해주기
		solution([[0, 0, 1, 1], [1, 1, 1, 1], [2, 2, 2, 1], [0, 0, 0, 2]])
		
		*/
	}
}
