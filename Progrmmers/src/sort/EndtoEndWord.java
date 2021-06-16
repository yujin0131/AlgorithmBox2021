package sort;

public class EndtoEndWord {
	public static int[] solution(int n, String[] words) {
		int[] answer = {0,0};
		String str = words[0] + ",";
		int count = 0;
		for(int i = 1; i < words.length; i++) {
			if(str.contains(","+words[i]) || !words[i-1].substring(words[i-1].length() - 1).equals(words[i].substring(0,1))) {
				count = i+1;
				break;
			} 
			str += words[i] + ",";
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
		String[] words = {"hello", "observe", "heffect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
	
		int[] result = solution(n, words);

		System.out.println(result[0] + " , " +  result[1]);
		
	}
}
