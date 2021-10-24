package dabeeo;

public class One {
	public static int solution(int n, int m) {
        int answer = 0;
        int size;
        String str = "";
        outer : for(int i = n; i < m; i++){
        	str = String.valueOf(i);
        	size = str.length();
            for(int j = 0; j < (size + 1) / 2; j++) {
            	if(! (str.charAt(j) == str.charAt(size-j-1))) continue outer;
            }
            answer++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 100;
		int m = 300;
		int result = solution(n, m);
		System.out.println(result);
	}
}
