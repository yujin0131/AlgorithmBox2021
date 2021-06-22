package kakao;

public class keypad {
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keypad = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,2}};

        int[] left = keypad[10];
        int[] right = keypad[11];
        
        hand = hand.equals("right") ? "R" : "L";
        
        for(int i = 0; i < numbers.length; i++) {
        	int[] next = keypad[numbers[i]];
        	
        	if(next[1] == 0) {
        		answer += "L";
        	}else if(next[1] == 2) {
        		answer += "R";
        	}else {
        		int le = Math.abs(next[0] - left[0]) + Math.abs(next[1] - left[1]);
        		int ri = Math.abs(next[0] - right[0]) + Math.abs(next[1] - right[1]);

        		if(le==ri) {
        			answer += hand;
        	        
        		}else {
        			answer += le < ri ? "L" : "R";	
        		}
        	}

        	if(answer.charAt(i)=='L') {
        		left = next;
        	}else {
        		right = next;
        	}
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		String result = solution(numbers, hand);
		System.out.println(result);
	}
}
