package all;

import java.util.Arrays;

public class LeastMultiple {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
    	int raw = arr1.length;
    	int column = arr2[0].length;
        int[][] answer = new int[raw][column];
        
        for(int i = 0; i < raw; i++) {
        	for(int j = 0; j < column; j++) {
        		answer[i][j] = racol(arr1, arr2, i, j);
        	}
        }
        return answer;
    }
	
    public static int racol(int[][] arr1, int[][] arr2, int i, int j) {
    	int result = 0;
    	
    	int r = 0;
    	while(r < arr1[i].length) {
    		result += arr1[i][r] * arr2[r++][j]; 
    	}
    	
    	return result;
    }
    
    
	public static void main(String[] args) {
		int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
		
		int[][] result = solution(arr1, arr2);
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
