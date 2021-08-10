package greedy;

import java.util.Arrays;
import java.util.Collections;

public class Lifeboat {
	public static int solution(int[] people, int limit) {
		
		int answer = 0;
		Arrays.sort(people);
		int first = 0;
		int last = people.length-1;
		int hap = people[last];

		for(int i = first; i <= last; i++) {
			hap += people[i];
			
			if(hap > limit)	i--;
			
			answer++;
			last--;
			hap = people[last];

			if(i+1 == last) {
				answer++;
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {//10 10 30 50 60 70 80
		int[] people = {10,10,10,30,80,90};
		int limit = 100;
		int result = solution(people, limit);
		System.out.println(result);
	}
}
