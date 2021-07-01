package greedy;

public class BigNumber {
	public static String solution(String number, int k) {
		StringBuffer numstr = new StringBuffer(number);
		int start = 0;
		int end = numstr.length() - k;
		while(k-- > 0) {
			int max = 0;
			for(int i = start; i < end; i++) {
				if(numstr.charAt(i) > max) {
					
				}
			}
			
		}
		return numstr.toString();
	}

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		String result = solution(number, k);
		System.out.println(result);
	}
}

/*
public static String solution(String number, int k) {
StringBuffer numstr = new StringBuffer(number);
while(k-- > 0) {
	for(int i = 0; i < numstr.length()-1; i++) {
		char first = numstr.charAt(i);
		char next = numstr.charAt(i+1);

		if(first == '9') continue;
		else if(first < next) {
			numstr.deleteCharAt(i);
			break;
		}else if(i+1 == number.length()-1) {
			numstr.deleteCharAt(i+1);
			break;
		}
	}
}
return numstr.toString();
}
 */