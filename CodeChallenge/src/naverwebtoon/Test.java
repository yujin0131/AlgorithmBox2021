package naverwebtoon;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static int[] solution(int[][] v) {
		int[] answer = new int[2];
	
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		
		x.add(v[0][0]);
		y.add(v[0][1]);
		
		for(int i = 1; i < v.length; i++) {
			if(x.contains(v[i][0])) {
				x.remove(x.indexOf(v[i][0]));
			}else {
				x.add(v[i][0]);
			}
			
			if(y.contains(v[i][1])) {
				y.remove(y.indexOf(v[i][1]));
			}else {
				y.add(v[i][1]);
			}
			

		}

		answer[0] = x.get(0);
		answer[1] = y.get(0);
		return answer;
	}
	public static void main(String[] args) {

		int[][] v = {{1,4},{3,4},{3,10}};


		int[] result = solution(v);
		for(int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}
	}
}
