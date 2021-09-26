package thirdOne;

import java.util.ArrayList;

public class Two {
	public static int[] solution(String[] grid) {

 		boolean[] light = new boolean[4];
		int row = grid.length;
		int col = grid[0].length();
		String[][] map = new String[row+2][col+2];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				map[i+1][j+1] = Character.toString(grid[i].charAt(j));
				System.out.println(map[i+1][j+1]);
			}
		}

		int count = 0;
		int re = 0;
		int num = 0;
		row = 1;
		col = 1; // 0 > 3 / 1 > 0 / 2 > 1 / 3 > 2   = l
				// 0 > 1 / 1 > 2 / 2 > 3 / 3 > 0
		int[] dx = { 0, 1, 0, -1};
		int[] dy = { -1, 0, 1, 0};
		ArrayList<Integer> list = new ArrayList<>();
		while(true) {
			if(row==1 && col==1) {
				if(light[count] == true) {
					list.add(re);
					re = 0;
					count = ++num;
					row = 1;
					col = 1;
					if(light[0] == true && light[1] == true && light[2] == true && light[3] == true ) break;
				}else {				
					light[count] = true;
					System.out.println("true");
				}
				
			}

			switch (map[row][col]) {

			case "L":
				count--;
				if(count == -1) count = 3;
				System.out.println("L");
				break;
			case "R":
				count++;
				if(count == 4) count = 0;
				System.out.println("r" +count);
				break;
			case "S":
				System.out.println("s");
				break;


			}	
			System.out.println("row " + row + " col " +col);
			System.out.println(count + " /" + (col + dx[count]) + " / " + (row + dy[count]));
			
			if(col + dx[count] == 0) {
				col = grid[0].length()+1;
				System.out.println("여기?1");
			}else if(col + dx[count] == grid[0].length()+1) {
				col = 0;
				System.out.println("여기?2");
			}else if(row + dy[count] == 0) {
				row = grid.length+1;

				System.out.println("여기?3");
			}else if(row + dy[count] == grid.length+1) {
				row = 0;

				System.out.println("여기?4");
			}
			row += dy[count];
			col += dx[count];
			
			re++;
		}

		int[] answer = new int[list.size()];
		answer[0] = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			
			answer[i] = list.get(i)-1;
		}
	
		return answer;
	}
	public static void main(String[] args) {


		//		int result = solution();
		//		System.out.println(result);
		//		
		String[] grid = {"SL","LR"};
		int[] result = solution(grid);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] +" ");
		}
	}
}
