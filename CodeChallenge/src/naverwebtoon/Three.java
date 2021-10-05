package naverwebtoon;

public class Three {
	
	public static int solution(String s, String t) {
        int result = 0;
        
        while(s.contains(t)) {
        	s=s.replaceFirst(t, "");
        	result++;
        }

        return result;
    }
	public static void main(String[] args) {
		
		String s = "aaaaabbbbb";
		String t = "ab";
		
		int result = solution(s, t);
		System.out.println(result);
	}
}
