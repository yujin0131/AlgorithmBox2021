package all;

public class Matches {
	public static int solution(int n, int a, int b) {
		int answer = 1;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		while(b - a != 1 && answer < Math.sqrt(n)) {
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;
			answer++;
			System.out.println(a + " / " + b);
		}

		answer = a % 2 == 1 ? answer : answer + 1;
		return answer;
	}

	public static void main(String[] args) {
		int n = 16;
		int a = 14;
		int b = 16;

		int result = solution(n, a, b);
		System.out.println(result);
	}
}
