package all;

import java.util.Arrays;

public class JadenCase {
	public static String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		String[] arr = s.split("");
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || arr[i-1].equals(" ")) {
				arr[i] = arr[i].toUpperCase();
			}
			answer += arr[i];

		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		String s = "medo 4mE 3people unFollowed me";

		String result = solution(s);
		System.out.println(result);
	}
}
