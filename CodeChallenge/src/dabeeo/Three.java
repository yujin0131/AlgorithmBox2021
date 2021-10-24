package dabeeo;

import java.util.Arrays;
import java.util.Comparator;

public class Three {
	public static int solution(int [][] arr){  
		int answer = 0;
		int size = arr.length;
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) return o1[0]-o2[0];
				else return o1[1] - o2[1];
			}

		});

		int time = 0;
		for(int i = 0; i < size; i++) {
			if(arr[i][0] < time) {
				continue;
			}else {
				time = arr[i][1];
				answer++;
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2},{2,4},{2,2}};
		int result = solution(arr);
		System.out.println(result);
	}
}
