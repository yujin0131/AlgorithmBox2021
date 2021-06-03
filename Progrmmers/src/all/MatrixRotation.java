package all;


public class MatrixRotation {
	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		int[][] matrix = new int[rows][columns];

		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};

		int start = 1;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = start++;
			}
		}


		for(start = 0; start < queries.length; start++) {
			int start_dx = queries[start][1] - 1;
			int start_dy = queries[start][0] - 1;
			int min = rows * columns;
			int temp = 0;
			int now_dx = start_dx;
			int now_dy = start_dy;

			for(int move = 0; move < 4; move++) {
				if(move % 2 == 0) { // 좌우 이동
					for(int i = 0; i < queries[start][3]-queries[start][1]; i++) {

						now_dx += dx[move];
						now_dy += dy[move]; 

						if(temp == 0) {
							temp = matrix[now_dy][now_dx]; 
							matrix[now_dy][now_dx] = matrix[start_dy][start_dx];

						}else {
							int temp2 = matrix[now_dy][now_dx];
							matrix[now_dy][now_dx] = temp;
							temp = temp2;
						}
						if(temp < min) min = temp;

					}
				}else {
					for(int i = 0; i < queries[start][2]-queries[start][0]; i++) {
						now_dy += dy[move];
						now_dx += dx[move];
						int temp2 = matrix[now_dy][now_dx];
						matrix[now_dy][now_dx] = temp;
						temp = temp2;
						if(temp < min) min = temp;
					}
				}
			}

		answer[start] = min;
		}

		return answer;
	}

	public static void main(String[] args) {
			int rows = 100;
			int colums =97;
				int[][] queries = {{1,1,100,97}};
//		int rows = 6;
//		int colums =6;
//		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int[] result = solution(rows, colums, queries);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

/*
 for(start = 0; start < queries.length; start++) {
			int y1 = queries[start][0];
			int x1 = queries[start][1];
			int y2 = queries[start][2];
			int x2 = queries[start][3];

			int min = rows * columns;
			for(int i = 0; i < columns; i++) {//y
				for(int j = 0; j < rows; j++) {//x
					if(y1-2 < i && i < y2 && x1-2 < j && j< x2) {
						if(i == y1-1) {
							rematrix[i][j] = j == x1-1 ? matrix[i+1][j] : matrix[i][j-1];
							if(rematrix[i][j] < min) min = rematrix[i][j];
						}else if(i < y2-1){
							if(j == x1-1) {
								rematrix[i][j] = matrix[i][j];
							}else {
								rematrix[i][j] = j == x2-1 ? matrix[i-1][j] : matrix[i][j];
							}
							if(rematrix[i][j] < min) min = rematrix[i][j];
						}else {
							rematrix[i][j] = j == x2-1 ? matrix[i-1][j] : matrix[i][j+1];
							if(rematrix[i][j] < min) min = rematrix[i][j];
						}

					}else {
						rematrix[i][j] = matrix[i][j];
					}

				}
			}

			answer[start] = min;
			for(int i = 0; i < columns; i++) {
				for(int j = 0; j < rows; j++) {
					matrix[i][j] = rematrix[i][j];
				}
			}
		} 
 */
