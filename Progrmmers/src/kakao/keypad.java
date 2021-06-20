package kakao;

public class keypad {
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        int[][] key = new int[4][3];
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String result = solution(numbers, hand);
		System.out.println(result);
	}
}
