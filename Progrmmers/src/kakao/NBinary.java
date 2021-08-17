package kakao;

public class NBinary {//n : 진법, t : 미리 구할 숫자 갯수, m : 참가인원, p : 튜브 순서
	public static String solution(int n, int t, int m, int p) {
        String str = "";
        String answer ="";
        int count = -1;
        int mul = 1;
        while(answer.length() < t) {
        	count++;
        	if(n > 10 && count >= n) {
        		switch (count) {
				case 10:
					str += "A";
					break;
				case 11:
					str += "B";
					break;
				case 12:
					str += "C";
					break;
				case 13:
					str += "D";
					break;
				case 14:
					str += "E";
					break;
				case 15:
					str += "F";
					break;
				}
        	}else if(count >= n) {
        		int num = count;
        		while( num / n >= n) {
        			//num 
        		}
        		str += count % n;
        	}else {
        		System.out.println("오냐");
        		str += count;
        	}
        	
        	if(str.length() > mul * p) {
        		answer += str.charAt((p * mul++)-1);
        		System.out.println(answer);
        	}
        	
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 2;
		int t = 4;
		int m = 2;
		int p = 1;
		String result = solution(n, t, m, n);
		System.out.println(result);
	}
}
