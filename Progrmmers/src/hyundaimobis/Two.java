package hyundaimobis;

public class Two {

	 public static boolean[] solution(String[] a) {
	        boolean[] answer = new boolean[a.length];
	        int size = a.length;
	      
	        outer : for(int i = 0; i < size; i++) {
	        	String str = a[i];
	        	while(!str.equals("a")) {
	        		
	        		int numlen = str.length();
	        		if(!str.contains("a")) {
	        			answer[i] = false;
	        			continue outer;
	        		}
	        		
	        		if(str.charAt(0) == 'a') {
	        			str = str.replaceFirst("a", "");
	        			System.out.println(str);
	        		}else if(str.charAt(numlen-1) == 'a') {
	        			str = str.substring(0, numlen-1);
	
	        			System.out.println(str);
	        		}else {
	        			System.out.println("여기 " + str);
	        			int num = numlen - str.replace(String.valueOf("a"), "").length();
	        			System.out.println(num + " " + str);
	        			System.out.println(str.substring(0, num) + " " +str.substring(numlen-num));
	        			while(str.charAt(0) != 'a' && str.charAt(numlen-1) != 'a') {
	        				if(str.substring(0, num).contains("a") || str.substring(numlen-num).contains("a")) {
	        					answer[i] = false;
	        					continue outer;
	        				}else {
	        					str = str.substring(num, numlen-num);
	        					
	        				}	
	        				numlen = str.length();
	        			}
	        		}
	        		
	        		
	        	}
	        	answer[i] = true;
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		String[] a = {"abab","bbaa","bababa","bbbabababbbaa"};
		boolean[] result = solution(a);
		for(int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
		}
	
	}
}
/*
 어떤 문자열 s가 주어졌을 때, 당신은 이 s가 다음과 같은 규칙을 활용하여 만들어낼 수 있는 문자열인지 판별하는 프로그램을 작성하고자 합니다. 규칙은 다음과 같습니다.

맨 처음에는 한 글자짜리 문자열 "a"로 시작합니다.
3번 규칙을 0번 이상 반복합니다.
현재 문자열에 있는 'a'의 개수를 x라고 할 때, 다음 두 행동 중 하나를 합니다.
문자열의 양 옆에 각각 x개만큼의 'b'를 추가합니다. 예를 들어, 현재 문자열이 "aba"라면 이 행동을 취한 뒤 문자열은 "bbababb"가 됩니다.
문자열의 맨 앞 또는 맨 뒤에 'a'를 추가합니다. 예를 들어, 현재 문자열이 "aba"라면 이 행동을 취한 뒤 문자열은 "aaba" 또는 "abaa"가 됩니다.
"abab"는 "a" → "bab" → "abab" 로 만들어낼 수 있습니다.
"bbaa"는 주어진 규칙으로 만들어낼 수 없는 문자열입니다.
"bababa"는 주어진 규칙으로 만들어낼 수 없는 문자열입니다.
"bbbabababbbaa"는 "a" → "bab" → "abab" → "ababa" → "bbbabababbb" → "bbbabababbba" → "bbbabababbbaa" 로 만들어낼 수 있습니다.
문자열 배열 a가 매개변수로 주어집니다. a에 있는 모든 문자열에 대해 해당 문자열이 주어진 규칙을 활용하여 만들어낼 수 있는 문자열이면 참값을, 그렇지 않다면 거짓값을 차례대로 배열에 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ a의 길이 ≤ 1,000,000
1 ≤ a의 모든 문자열의 길이 ≤ 500,000
a의 모든 문자열은 'a', 'b'로만 이루어져 있습니다.
1 ≤ a의 모든 문자열의 길이의 합 ≤ 1,000,000
입출력 예
a	result
["abab","bbaa","bababa","bbbabababbbaa"]	[true,false,false,true]
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다
 */
