package all;

import java.util.Stack;

public class Pair {
	public static int solution(String s){
		int answer = 0;
		Stack<String> stack = new Stack<>();

		stack.push(s.substring(0 , 1));
		for(int i = 1; i < s.length(); i++ ) {
			if(stack.size() != 0 && s.substring(i, i+1).equals(stack.peek())) {
				stack.pop();
			}else {
				stack.push(s.substring(i ,i+ 1));
			}

		}
		if(stack.size() ==0) {
			answer = 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "abccdffdbac";  

		int result = solution(s);
		System.out.println(result);
	}
}

/* public static int solution(String s){
		int answer = 0;
   		for(int i = 0; i < s.length() - 1 ; i++ ) {
	        	String str = s.substring(i, i+1);
	        	if(str.equals(s.substring(i+1, i+2))) {
	        		s = s.replaceFirst(str + str, "");
	        		i = -1;
	        		if(s.length() == 0) {
	        			answer = 1;
	        			break;
	        		}
	        	}
	        }
	        	return answer;
	}
 */
