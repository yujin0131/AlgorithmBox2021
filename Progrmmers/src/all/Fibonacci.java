package all;

import java.math.BigInteger;

public class Fibonacci {
	public static int solution(int n) {
        BigInteger num_re = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ZERO;
        BigInteger num1 = BigInteger.ONE;
        BigInteger mod = new BigInteger("1234567");
        int count = 1;
        
        while(count < n) {
        	num_re = num1.add(num2);
        	num2 = num1;
        	num1 = num_re;
        	count++;
        }
        
        int answer = (num_re.mod(mod)).intValue();
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 888;
		int result = solution(n);
		System.out.println(result);
	}
}
