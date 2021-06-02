package stact_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketRotation {

	public static int solution(String s) {
		int answer = 0;
		Map<String, String> bracket = new HashMap<>();
		Stack<String> check_stack = new Stack<>();
		bracket.put("(", ")");
		bracket.put("[", "]");
		bracket.put("{", "}");

		for(int count = 0; count < s.length(); count++) {
			for(int i = 0; i < s.length(); i++) {
				String str = s.substring(i ,i + 1);

				if(!bracket.containsKey(str)) {
					if(check_stack.size() == 0 || !bracket.get(check_stack.peek()).equals(str)) {
						break;
					}
					check_stack.pop();
					
					if(i == (s.length()-1) && check_stack.size() == 0) {
						answer++;
					}
					
				}else check_stack.push(str);
			}

			s = s.substring(1,s.length()) + s.substring(0,1);
			check_stack.clear();
		}

		return answer;

	}

	public static void main(String[] args) {
		String s = "[{()";

		int result = solution(s);
		System.out.println(result);
	}
}
