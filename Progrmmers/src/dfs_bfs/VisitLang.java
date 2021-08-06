package dfs_bfs;

public class VisitLang {
	public static int solution(String dirs) {
        int answer = 0;
        
        int[][] load = new int[11][11];
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int i = 0; i < dirs.length(); i++) {
        	String now = String.valueOf(dirs.charAt(i));
        	System.out.println(now);
        	//System.out.println("오나");
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String dirs = "ULURRDLLU";
		int result = solution(dirs);
		System.out.println(result);
	}
}
