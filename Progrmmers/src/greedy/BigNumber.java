package greedy;

import java.util.LinkedList;
import java.util.Queue;

public class BigNumber {
	public static String solution(String number, int k) {
		 String answer = "";
		 int size = number.length();
		 Queue<Integer> number_q = new LinkedList<>();
		 int count = 0;
		 for(int i = 0; i < size; i++) {
			 if(count == k) {
				 answer += number.substring(i);
				 break;
			 }
			 
			 number_q.add(number.charAt(i)-'0');
			 
			 if(answer.charAt(answer.length()-1) - '0' < number_q.peek()) {
				 while(count < k) {
					 
				 }
			 }
			 answer += number_q.poll();
			
		 }
	     return answer;
	}

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String result = solution(number, k);
		System.out.println(result);
	}
}

/*
public static String solution(String number, int k) {
StringBuffer numstr = new StringBuffer(number);
while(k-- > 0) {
	for(int i = 0; i < numstr.length()-1; i++) {
		char first = numstr.charAt(i);
		char next = numstr.charAt(i+1);

		if(first == '9') continue;
		else if(first < next) {
			numstr.deleteCharAt(i);
			break;
		}else if(i+1 == number.length()-1) {
			numstr.deleteCharAt(i+1);
			break;
		}
	}
}
return numstr.toString();
}



 */