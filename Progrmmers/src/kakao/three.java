package kakao;

import java.util.Stack;

public class three {

	public static void main(String[] args) {

		int n =8;
		int k = 2;
		String cmd[] = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
		String answer = solution(n, k, cmd);
		System.out.println(answer);
	}

	public static String solution(int n, int k, String[] cmd) {
		String answer = "";
		String anarray[] = {"O","O","O","O","O","O","O","O"};

		String ques = "";
		int z = 0;
		
		Stack<Integer> stack = new Stack<>(); 

		for(int i = 0; i < cmd.length; i++) {
			String check = "";
			ques = cmd[i];
			check = ques.substring(0, 1);
			switch (check) {
			case "D":
				k += Integer.parseInt(ques.substring(2,3));
				System.out.println(k);
				
				anarray[k] = "O";
				break;
			case "C":
				System.out.println("c" + i + " / " + k);
				if(k == n) {
					k--;
				}
				n--;
				anarray[k] = "X";
				System.out.println(anarray[k]);
				stack.push(k);
				

				break;
			case "U":
				k -= Integer.parseInt(ques.substring(2,3));
				System.out.println(ques.substring(2,3));

				anarray[k] = "O";
				System.out.println("u" + " k :" + k + " / " + anarray[k]);
				break;

			case "Z":
				z = 1;
				i -= 2;
				System.out.println("되나 " + stack.peek());
				anarray[stack.peek()] = "O";
				if(stack.peek() < k) {
					k += stack.peek();
				}
				
				stack.pop(); 
				System.out.println("되나 " + stack.peek() + anarray[k]);
				break;
			}
		}

		for(int i = 0; i < 6; i++) {
			answer += anarray[i];
		}
		return answer;
	}
}
