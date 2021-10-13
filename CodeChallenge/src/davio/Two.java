package davio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Two {
	public static long solution(int[][] rectangles) {
	    long answer = 0;
	    int size = rectangles.length;
	    Arrays.sort(rectangles, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return o2[3]-o1[3];
				else return o1[0] - o2[0];
			}

		});
	    for(int i = 0; i < size; i++) {
	    	System.out.println(rectangles[i][0] + " " + rectangles[i][1] +" " + rectangles[i][2] + " " + rectangles[i][3]);
	    }
	   
	    int hMin = rectangles[0][1];
	    int hMax = rectangles[0][3];
	    int h = hMax - hMin;
	    for(int i = 0; i < size; i++) {
	    	System.out.println(hMax  + " " + hMin);
	    	while(rectangles[i][0] == rectangles[i+1][0]) {
	    		System.out.println("여기");
	    		if(rectangles[i+1][1] <= rectangles[i][3]) {
	    			hMax = rectangles[i+1][3];
	    			h = hMax - hMin;
	    			System.out.println(hMax  + " " + hMin);
	    			System.out.println(" 여기 :  " + 1 + " " + h);
	    		}else {
	    			System.out.println(" 여기 :  " + 2);
	    			h += rectangles[i+1][3] - rectangles[i+1][1];
	    		}
	    		
	    		if(rectangles[i+1][3] < rectangles[i][1]) {
	    			hMin = rectangles[i+1][3];
	    			h = hMax - hMin;
	    			System.out.println(" 여기 :  " + 3 + " " + h);
	    		}else {
	    			System.out.println(" 여기 :  " + 4);
	    			h += rectangles[i+1][3] - rectangles[i+1][1];
	    		}
	    		i++;
	    	}
	    	answer += h; 
	    	System.out.println(answer);
	    }
	    
	    
	    
	    
	    return answer;
	} 
	
	public static void main(String[] args) {
		int[][] rectangles = {{1, 1, 6, 5}, {4, 3, 8, 6},  {2, 4, 5, 7}, {2, 0, 4, 2},{7, 5, 9, 7}};
		long result = solution(rectangles);
		System.out.println(result);
	}
}
//
//public static long solution(int[][] rectangles) {
//    long answer = 0;
//    int size = rectangles.length;
//    int[] max = {Integer.MAX_VALUE,Integer.MAX_VALUE,0,0};
//    for(int i = 0; i < size; i++) {
//    	if(max[0] > rectangles[i][0]) max[0] = rectangles[i][0];
//    	if(max[1] > rectangles[i][1]) max[1] = rectangles[i][1];
//    	if(max[2] < rectangles[i][2]) max[2] = rectangles[i][2];
//    	if(max[3] < rectangles[i][3]) max[3] = rectangles[i][3];
//    	System.out.println(max[0] + " " + max[1] +" " + max[2] + " " + max[3]);
//    }
//    
//    boolean[][] map = new boolean[max[3]-max[1]][max[2]-max[0]];
//    for(int i = 0; i < size; i++) {
//    	for(int row = rectangles[i][1]-max[1]; row < rectangles[i][3]-max[1]; row++) {
//    		for(int col = rectangles[i][0]-max[0]; col < rectangles[i][2]-max[0]; col++) {
//        		if(map[row][col]) continue;
//                answer++;
//        		map[row][col] =true;
//        	}
//    	}
//    }
//    
//    
//
//    return answer;
//} 




//
//public static long solution(int[][] rectangles) {
//    long answer = 0;
//    int size = rectangles.length;
//    HashMap<String, Integer> map = new HashMap<String, Integer>();
//    for(int i = 0; i < size; i++) {
//    	for(int row = rectangles[i][1]; row < rectangles[i][3]; row++) {
//    		for(int col = rectangles[i][0]; col < rectangles[i][2]; col++) {
//    			System.out.println(row + " " +col);
//    			System.out.println(""+row+col);
//        		if(!map.containsKey(""+row+col)) {
//        			answer++;
//        			map.put(row+""+col, 0);
//        		}
//        		System.out.println("answer : " + answer);
//        	}
//    	}
//    }
//    
//    
//
//    return answer;
//} 
