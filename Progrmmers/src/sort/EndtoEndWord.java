package sort;

import java.util.HashMap;

public class EndtoEndWord {
	public static int[] solution(int n, String[] words) {
		int[] answer = {0,0};
		HashMap<String, Integer> map = new HashMap<>();
		map.put(words[0], null);
		int count = 0;
		for(int i = 1; i < words.length; i++) {
			if(map.containsKey(words[i]) || words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)) {
				count = i+1;
				break;
			} 
			map.put(words[i], null);
		}

		System.out.println(count);
		if(count != 0) {
			
			answer[0] = count % n == 0 ? n : count % n ;
			answer[1] = count % n == 0 ? count / n : count/n + 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 6;
		String[] words = {"awawa", "awah", "heffecta", "awawa", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
	
		int[] result = solution(n, words);

		System.out.println(result[0] + " , " +  result[1]);
		
	}
}
