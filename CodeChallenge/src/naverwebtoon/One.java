package naverwebtoon;

import java.util.Arrays;
import java.util.Collections;

public class One {
	
	public static int solution(int[] prices, int[] discounts) {
        int answer = 0;
        
        Integer pricesarr[] = Arrays.stream(prices).boxed().toArray(Integer[]::new);
        Integer discountsarr[] = Arrays.stream(discounts).boxed().toArray(Integer[]::new);
        Arrays.sort(pricesarr,Collections.reverseOrder());
        Arrays.sort(discountsarr,Collections.reverseOrder());
    
        
        for(int i = 0; i < pricesarr.length; i++) {
        	if(i < discountsarr.length) {
        		answer += pricesarr[i] / 100 * (100- discountsarr[i]);
        	}else {
        		answer += pricesarr[i];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] prices = {13000, 88000, 10000};
		int[] discounts = {30,20,80,25};
		
		int result = solution(prices, discounts);
		
		System.out.println(result);
	}
}
