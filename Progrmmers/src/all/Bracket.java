package all;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bracket {
	public static String solution(String p) {
		String answer = "";
		Queue<String> question_q = new LinkedList<>();
		Stack<String> answer_stack = new Stack<>();
		
		String check = "(";
		for(int i = 0; i < p.length(); i++) {
			if(p.substring(i, i+1) == check) {
				answer_stack.add(p.substring(i, i+1));	
			}else {
				if(answer_stack.size() > 0) {
					answer_stack.pop();
				}else {
					
				}
			}
		}
		
		while(answer_stack.size() < p.length()) {
			String now = question_q.poll();
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String p = "(()())()";
		//"()))((()"
		//")("
		
		String result = solution(p);
		System.out.println(result);
	}

}
