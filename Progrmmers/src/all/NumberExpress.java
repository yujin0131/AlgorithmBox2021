package all;

public class NumberExpress {
	public static int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			int num = 0;
			for(int j = i; j <= n; j++) {
				num += j;
				if(num > n) {
					break;
				}else if(num == n) {
					answer++;
					break;
				}
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 15;
		int result = solution(n);
		System.out.println(result);
	}
}
