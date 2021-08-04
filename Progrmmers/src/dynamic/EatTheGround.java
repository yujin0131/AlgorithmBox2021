package dynamic;

import java.util.Arrays;

public class EatTheGround {
	public static int solution(int[][] land) {
		int answer = 0;
		int k = land.length;
		
		for(int i = 0; i < k-1; i++) {
			land[i+1][0] += max(land[i][1], land[i][2], land[i][3]);
			land[i+1][1] += max(land[i][0], land[i][2], land[i][3]);
			land[i+1][2] += max(land[i][0], land[i][1], land[i][3]);
			land[i+1][3] += max(land[i][0], land[i][1], land[i][2]);
		}
		
		Arrays.sort(land[k-1]); 
		
		return land[k-1][3];
	}

	public static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
	public static void main(String[] args) {
		int[][] land = {{4,3,2,1}, {2,2,2,1}, {6,6,6,4}, {8,7,6,5}};
		int result = solution(land);
		System.out.println(result);
	}
	
	
	
	/*
	 int answer = 0;
		int l = land.length;
		int k = 4;
		int check = 0;

		int[] arr = new int [k];
		for(int i = 0; i < k; i++) {
			arr[i] = land[0][i];
		}
		
		while(answer < k) {
			for(int i = 1; i < l; i++) {
				int max = 0;
				int max_i = 0;
				for(int j = 0; j < k; j++) {
					if(j == check) continue;
					if(land[i][j] > max) {
						max = land[i][j];
						max_i = j;
					}
				}
				check = max_i;
				arr[answer] += max;
			}
			System.out.println(arr[answer]);
			answer++;
			check = answer;
		}
		
		Arrays.sort(arr); 
		
		for(int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
		return arr[k-1];
		*/
	 
}
