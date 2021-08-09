package dfs_bfs;

import java.util.HashMap;

public class VisitLang {
	public static int solution(String dirs) {

		
		int x = 0;
		int y = 0;
        int now_x = x;
        int now_y = y;
        String now = "";
        HashMap<String,String> map = new HashMap<>();
        
        for(int i = 0; i < dirs.length(); i++) {
        	now = String.valueOf(dirs.charAt(i));
        	
        	now_x = x;
        	now_y = y;
        	
        	if(now.equals("D")) {
        		now_y++;
        	}else if(now.equals("R")) {
        		now_x++;
        	}else if(now.equals("U")) {
        		now_y--;
        	}else if(now.equals("L")) {
        		now_x--;
        	}
        	if(!(Math.abs(now_x) > 6 || Math.abs(now_y) > 6)) {
        		
        	}
        	
        	
        int answer = map.size();
          
        return answer;
    }
	
	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		int result = solution(dirs);
		System.out.println(result);
	}
}


/*
 public static int solution(String dirs) {

        int[][] load = new int[11][11];
        int now_x = 5;
        int now_y = 5;
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int move = 0;
        String now = "";
        
        HashMap<String,String> map = new HashMap<>();
        
        for(int i = 0; i < dirs.length(); i++) {
        	now = String.valueOf(dirs.charAt(i));
        	if(now.equals("D")) {
        		move = 0;
        	}else if(now.equals("R")) {
        		move = 1;
        	}else if(now.equals("U")) {
        		move = 2;
        	}else if(now.equals("L")) {
        		move = 3;
        	}
        	
        	if(now_x + dx[move] > -1 && now_x + dx[move] < 10 && now_y + dy[move] > -1 && now_y + dy[move] < 10) {
        		
        		
        		if(!((map.containsKey(now_x + "" + now_y) && map.get(now_x + "" + now_y).equals(now_x + dx[move] + "" + now_y+dy[move])) || 
        				(map.containsKey(now_x + dx[move] + "" + now_y+dy[move]) && map.get(now_x + dx[move] + "" + now_y+dy[move]).equals(now_x + "" + now_y)))){
        			
        			map.put(now_x + "" + now_y, now_x + dx[move] + "" + now_y+dy[move]);

        		}
        		now_x += dx[move];
        		now_y += dy[move];
        		
        		
        	}
        }
        
        int answer = map.size();
        
        return answer;
    }
    */
