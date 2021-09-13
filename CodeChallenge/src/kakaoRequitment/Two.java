package kakaoRequitment;

public class Two {

	public static int solution(int n, int k) {
		int answer = 0;
		String num = "1605000064";
				
				//conversion(n, k);
		System.out.println(num);
		num = num.replaceAll("00", "0");
		
		String[] numSplit = num.split("0");
		System.out.println(numSplit.length);
		
		for(int i = 0; i < numSplit.length; i++) {
			System.out.print(numSplit[i] + "/");
		}
		System.out.println();
		outer : for(int i = 0; i < numSplit.length; i++) {
			if(numSplit[i].equals("")) continue;
			int isNum = Integer.parseInt(numSplit[i].replaceAll("0", ""));
			System.out.println(isNum);
			if(isNum == 1) continue outer;
			System.out.println("오니");
			for(int j = 2; j < isNum/2; j++) {
				if(isNum % j == 0) {
					continue outer;
				}
			}
			answer++;
			System.out.println("answer : " +answer);
			
		}
		return answer;
	}
	
	

	public static String conversion(int n, int k) {
		String answer = "";
		int num = 0;
		
		while(n != 0) {
			num = n % k;
			if(num < 10) {
				answer = num + answer;
			} else {
				answer = num + 55 + answer; 
			}		
			n /= k;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int n = 110011;
		int k = 10;
		

		int result = solution(n ,k);
		System.out.println(result);

		//		[] result = solution();
		//		for(int i = 0; i < result.length; i++) {
		//			System.out.println(result[i]);
		//		}

	}
}
