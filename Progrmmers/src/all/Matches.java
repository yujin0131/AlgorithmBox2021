package all;

public class Matches {
	public static int solution(int n, int a, int b) {
		int answer = 0;

		while(b != a) {
			a = ++a / 2;
			b = ++b / 2;
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 16;
		int a = 4;
		int b = 5;

		int result = solution(n, a, b);
		System.out.println(result);
	}
}
