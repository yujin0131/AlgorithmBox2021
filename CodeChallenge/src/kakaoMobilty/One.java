package kakaoMobilty;

import java.util.HashSet;
import java.util.Set;

public class One {

	public static String solution(String S, String C) {
		String answer = "";
		String str = "";
		C = "@" + C.toLowerCase() + ".com>";
		String[] split = S.split(", ");
		Set<String> set = new HashSet<String>();
		int splitSize = split.length;
		int size = 0;
		for(int i = 0; i < splitSize; i++) {
			str = "";
			String[] nameSplit = split[i].split(" ");
			answer += split[i] + " <";
			size = nameSplit.length-1;
			for(int j = 0; j < size; j++) {
				str += nameSplit[j].substring(0,1).toLowerCase();
				System.out.println(str);
			}
			nameSplit[size] = nameSplit[size].replace("-", "");
			System.out.println(nameSplit[size]);
			str += nameSplit[size].length() > 8 ? nameSplit[size].substring(0,8).toLowerCase() : nameSplit[size].toLowerCase();
			int cnt = 1;
			String temp = str;
			System.out.println("dyrl     : " + str);
			while(set.contains(temp)) {
				temp = str + ++cnt;
			}
			str = cnt == 1 ? str : str + cnt;
			set.add(str);
			
			answer += i != splitSize-1 ? str + C + ", " : str + C;

			System.out.println(answer);
		}
		return answer;
	}
	public static void main(String[] args) {
		String c = "Example";
		String s = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
		String result = solution(s, c);
		System.out.println(result);
		//		
		//		for(int i = 0; i < result.length; i++) {
		//			System.out.println(result[i]);
	}
}

