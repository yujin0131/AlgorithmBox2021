package weeklyChallenge;

public class Day1 {
	public static long solution(int price, long money, int count) {
		long answer = -money;
		for(int i = 1; i <= count; i++) {
			answer += price * i;
		}
		return answer <= 0 ? 0 : answer;
	}

	public static void main(String[] args) {
		int price = 3;
		long money = 20;
		int count = 4;
		long result = solution(price, money, count);
		System.out.println(result);
	}
}
