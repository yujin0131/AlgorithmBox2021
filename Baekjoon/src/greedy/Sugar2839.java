package greedy;

public class Sugar2839 {
	
	public static int solution(int n) {	
		int mok = n / 5; //3
		int min = n;
		for(int i = mok; i >= 0; i--) {
			int na = n;
			na -= i * 5;
			if(na % 3 == 0) {
				int num = na / 3 + i;
				if(num < min) min = num;
			}
		}
		
		int answer = min != n ? min : -1;
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 11;
		int result = solution(n);
		System.out.println(result);
	}
}
