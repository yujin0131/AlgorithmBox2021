package all;

public class Binary {
	public static int[] solution(String s) {
		int[] answer = new int[2];

		while(!s.equals("1")) {

			answer[1] += s.length();
			s = s.replaceAll("0", "");
			answer[1] -= s.length();

			int num = s.length();
			s = Integer.toBinaryString(num);
			answer[0]++;
		}

		return answer;
	}

	public static void main(String[] args) {

		String s = "1111111";

		int[] result = solution(s);
		System.out.println(result[0] + " / " +result[1]);




	}
}
