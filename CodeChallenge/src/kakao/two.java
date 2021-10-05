package kakao;

public class two {

	public static void main(String[] args) {

		String s = "23four5six7";
		int result = solution(s);

		System.out.println(result);
	}

	public static int solution(String s) {

		String check[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < check.length; i++) {
			
			s = s.replaceAll(check[i], String.valueOf(i));
		}
		
		int answer = Integer.parseInt(s);
		
		return answer;
	}

}
