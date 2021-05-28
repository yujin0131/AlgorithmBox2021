package all;

public class Rectangle {
	public static long solution(long w, long h) { // 문제에서는 int로 되어있는데 형 변환 해줘야 한다.
		long  min_w = w;
		long  min_h = h;
		long  min = -1;
		while(min_w != 0) {
			if(min_w < min_h) {
				long num = min_w;
				min_w = min_h;
				min_h = num;
			}
			min_w -= min_h; // h가 최대공약수
		}
		min = min_h;
		min_w = w / min;
		min_h = h / min;
		
		long answer = (long) (w * h - ( min_w + min_h - 1 ) * min);
		
		
		return answer;
	}


	public static void main(String[] args) {
		int w = 414;
		int h = 351;
		long result = solution(w, h);
		System.out.println(result);
	}
}
