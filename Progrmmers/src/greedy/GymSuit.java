package greedy;

import java.util.Arrays;

public class GymSuit {

	public static int solution(int n, int[] lost, int[] reserve) {
		int size = lost.length;
		int answer = n-size;
		int sizeRe = reserve.length;
		int start = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		outer : for(int i = 0; i < size; i++) {
			for(int j = start; j < sizeRe; j++) {
				if(reserve[j] == lost[i]) {
					start = j+1;
					reserve[j] = -1;
					answer++;
					continue outer;
				}else if(reserve[j] - 1 == lost[i]) {
					if(i < size -1 && reserve[j] == lost[i+1]) {
						start = j+1;
						reserve[j] = -1;
						answer++;
						i++;
						continue outer;
					}
					reserve[j] = -1;
					answer++;
					start = j+1;
					continue outer;
				}else if(reserve[j] + 1 == lost[i]) {
					if(j < sizeRe -1 && reserve[j+1] == lost[i]) {
						start = j+1;
						reserve[j+1] = -1;
						answer++;
						continue outer;
					}
					reserve[j] = -1;
					answer++;
					start = j+1;
					continue outer;
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,3,4};
		int[] reserve = {1,2,3};
		int result = solution(n, lost, reserve);
		System.out.println(result);
	}
}
