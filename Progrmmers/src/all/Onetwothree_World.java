package all;
public class Onetwothree_World {
	public static String solution(int n) {
		String answer = "";


		while (n > 0) {
			int num = n % 3;
			n = n / 3;
			if(num == 0) {
				num = 4;
				n--;
			}
			answer = num + answer;

		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 10;
		String result = solution(n);
		System.out.println(result);
	}
}