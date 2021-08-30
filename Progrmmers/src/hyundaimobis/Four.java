package hyundaimobis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Four {

	public static boolean[] solution(int[][] p, int[][] q) {
		boolean[] answer = {};
		
		int size = p.length;
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <size; i++) {
			Arrays.sort(p[i]);
			Arrays.sort(q[i]);
			// 1 2 2 3 5    2 4 7
			
			ArrayList<Integer> list2 = new ArrayList<>();
			for(int j = 0; j < p[i].length; j++) {
				list2.add(p[i][j]);
			}
			list.add(list2);
			
			int last = 1;
			int num = q[i][q[i].length-last];
			int listnum = list.get(i).get(list.get(i).size()-last);
			System.out.println(listnum);
			while(true) {
				if(listnum==num) {
					last++;
					System.out.println("1");
					continue;
				}else if(listnum>num){
					answer[i] = false;
					System.out.println("2");
					break;
				}else{
					System.out.println("3");
					int removeIdx = 0;
					if( list.get(i).indexOf(num-listnum) != -1) {
						removeIdx = list.get(i).indexOf(num-listnum);
						
					}else {
						
					}
					System.out.println(removeIdx);
					System.out.println(num + " " + list.get(i).get(removeIdx) + " " +list.get(i).get(listnum));
					list.get(i).add(listnum + list.get(i).get(removeIdx));
					list.get(i).remove(listnum);
					list.get(i).remove(removeIdx);
				}
				break;
			}
		}

		return answer;
	}
	
	/*
	 * 정수로 이루어진 두 집합 x, y가 주어졌을 때, 당신은 다음과 같은 과정을 통하여 x를 y와 동일하게 만들 수 있는지 알고 싶습니다.

x의 임의의 두 수를 제거한 뒤, 그 둘을 합친 수를 다시 넣습니다.
예를 들어, x = [5,3,2,2,1], y = [7,2,4] 라면, x를 다음과 같은 과정을 거쳐 y로 만들 수 있습니다.

[5,3,2,2,1] → [7,3,2,1] (5, 2 선택) → [7,2,4] (3, 1 선택)
이러한 x와 y가 여러 개 담긴 2차원 정수 배열 p와 q가 매개변수로 주어집니다. 각 경우에 대해서 x를 y로 만들 수 있으면 참값, 아니면 거짓값을 return 하도록 solution 함수를 완성해주세요.

제한사항
p의 길이 = q의 길이
1 ≤ y의 길이 ≤ x의 길이 ≤ 20
1 ≤ x, y의 모든 수 ≤ 10,000,000
x의 모든 수의 합 = y의 모든 수의 합
1 ≤ p의 각 행의 길이(= 각 x의 길이)의 합 ≤ 40
입출력 예
p	q	result
[[5,3,2,2,1]]	[[7,2,4]]	[true]
[[4,3,3],[1,2,3],[3,2,4]]	[[5,5],[5,1],[1,8]]	[false,true,false]
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.
입출력 예 #2

이 예시에는 3가지의 서로 다른 x, y가 있습니다.
x = [4,3,3], y = [5,5] 는 x를 y로 만드는 것이 불가능하므로, 거짓값을 배열에 넣어야 합니다.
x = [1,2,3], y = [5,1] 은 x를 y로 만드는 것이 가능하므로, 참값을 배열에 넣어야 합니다.
x = [3,2,4], y = [1,8] 은 x를 y로 만드는 것이 불가능하므로, 거짓값을 배열에 넣어야 합니다.
	 */

	public static void main(String[] args) {

		int[][] p = {{5,3,2,2,1}};
		int[][] q = {{7,2,4}};

		boolean[] result = solution(p, q);
		for(int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}


	}
}
