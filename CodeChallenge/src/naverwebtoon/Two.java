package naverwebtoon;

import java.util.ArrayList;
import java.util.List;

public class Two {

	public static String[] solution(String s) {
		List<String> list = new ArrayList<>();
		String[] answer = {};

		int start = 0;
		int size = s.length();

		for(int i = 1; i < size; i++) {
			if(s.substring(start, i).equals(s.substring(size-i))) {
				list.add(s.substring(start, i));
				s = s.substring(i, size-i);
				i=0;
				size = s.length();
			}

		}

		if(s.length() != 0) {
			answer = new String[list.size()*2+1];
			answer[list.size()] = s;
		}else {
			answer = new String[list.size()*2];
		}

		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		for(int i = 0; i < list.size(); i++) {
			answer[i+(answer.length+1)/2] = list.get(list.size()-i-1);
		}

		return answer;
	}

	public static void main(String[] args) {
		String s = "llttaattll";
		String[] result = solution(s);
		System.out.println("=================");
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
