package hyundaimobis;

import java.util.ArrayList;

public class Three {

	public static int[] solution(int[] m, int[] b) {
		int size = m.length;
		int[] answer = new int[size];
		ArrayList<Integer> list = new ArrayList<>();
		int start = 0;
		for(int i = 0; i < size; i++) {
			for(int j = start; j < m[i]; j++) {
				list.add(b[j]);
			}
			start += m[i];
			
			int hap = 0;
			while(true) {
				for(int a = 0; a < list.size(); a++) {
					hap = hap & list.get(a);
				}
			
				if(hap == 0) break;
				
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {

		int[] m = {2,2};
		int[] b = {3,2,1,2};
		
		int[] result = solution(m,b);
		for(int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}

	}
}


/*

0 이상의 정수로 이루어진 길이가 n인 배열 a가 있습니다. 당신은 이 배열에 다음과 같은 행동을 할 수 있습니다.

a 배열에서 0보다 큰 특정 수를 하나 골라 1 감소시킵니다.
당신은 a[0] & a[1] & ... & a[n-1] = 0 이 되도록 위의 행동을 0번 이상 반복하고자 합니다. (&는 Bitwise And 연산입니다.) 이때, 당신은 주어진 행동을 가능한 적게 반복하고 싶습니다. 따라서, 당신은 배열 원소 간의 &(Bitwise And) 연산 결과가 0이 되도록 주어진 행동을 하는 횟수를 최소화하고, 그때의 최소화된 횟수를 구하면 됩니다.

정수로 이루어진 배열 m과 b가 매개변수로 주어집니다. b는 여러 개의 a 배열을 순서대로 이어 붙인 배열이며, m은 각 a 배열의 길이가 순서대로 담긴 배열입니다. 각 a 배열에 대해 문제의 답을 구하여 배열에 차례대로 담아 return 하도록 solution 함수를 완성해주세요.

예를 들어, m = [2,3,4], b = [1,2,3,4,5,6,7,8,9] 라면, 다음 3가지 배열에 대해서 문제의 답을 구해야 합니다.

a = [1,2] (m[0] = 2 이므로, b의 첫 2개 원소가 a 배열을 이룹니다.)
a = [3,4,5] (m[1] = 3 이므로, b의 그다음 3개 원소가 a 배열을 이룹니다.)
a = [6,7,8,9] (m[2] = 4 이므로, b의 그다음 4개 원소가 a 배열을 이룹니다.)
답이 항상 32-bit 정수 범위에 있는 것은 증명될 수 있습니다.

제한사항
1 ≤ m의 길이 ≤ 200,000
1 ≤ m의 모든 수 ≤ 200,000
1 ≤ m의 모든 수의 합 = b의 길이 ≤ 200,000
0 ≤ b의 모든 수 < 230
입출력 예
m	b	result
[2,2]	[3,2,1,2]	[2,0]
입출력 예 설명
입출력 예 #1

이 입출력 예에는 2개의 a 배열이 있습니다.
m[0] = 2 이므로, 첫 번째 a 배열은 [3,2] 입니다.
a[1]을 2번 골라서 1씩 빼면 a = [3,0] 이 되므로, 주어진 조건(a[0] & ... & a[n-1] = 0)을 만족시킵니다.
a[0]을 1번 골라서 1 빼고, a[1]을 1번 골라서 1을 빼도 a = [2,1]이 되므로, 주어진 조건을 만족시킵니다.
하지만 2번보다 더 적은 횟수의 행동을 통해 주어진 조건을 만족시키는 것은 불가능하므로, 2를 배열에 담아야 합니다.
m[1] = 2 이므로, 두 번째 a 배열은 [1,2] 입니다.
아무런 행동을 하지 않아도 a 배열이 주어진 조건을 만족시키므로, 0을 배열에 담아야 합니다.
따라서 [2,0]을 return 해야 합니다.
*/