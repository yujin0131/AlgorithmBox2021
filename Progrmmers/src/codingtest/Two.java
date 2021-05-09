package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Two {
	/*문제설명
	 * 
	 * 어떤 스키장에서 리프트에 손님을 탑승시킬 때, 탑승장에 도착한 시간 뿐만 아니라, 손님의 티켓 등급도 고려하여 탑승 순서가 정해집니다. 이에 따른 탑승 순서를 다음과 같이 정합니다.

리프트는 일정한 시간 간격으로 한 대씩 탑승장으로 들어옵니다.
탑승장에 들어오는 순서대로 리프트에 번호를 부여합니다. 첫 번째 리프트부터 0번 리프트입니다.
라프트 한 대에는 한 명의 승객만 탑승합니다.
리프트 한 대가 출발하고, 다음 리프트가 도착하기 전까지 탑승장에 도착한 승객은 모두 같은 시각에 도착한 것으로 간주합니다.
손님들의 리프트 탑승장 도착 시각은 리프트 번호로 주어집니다.
즉, 손님이 리프트 탑승장에 도착한 후 바로 다음으로 탑승장에 들어오는 리프트 번호가 해당 손님이 탑승장에 도착한 시각입니다.
기존 탑승장에 대기중인 승객과 현재 도착한 승객 중에서 우선 순위가 가장 높은 탑승자를 선정합니다.
티켓 등급이 높을 수록 우선순위가 높으며, 등급이 가장 높은 손님이 여러 명일 경우는 먼저 도착한 순서대로 리프트에 탑승합니다.
도착한 시각(리프트 번호)과 등급이 같을 경우에는 아이디 값이 작은 손님이 먼저 탑승합니다.
각 손님의 도착 시각(리프트 번호)을 저장한 배열 t와 그 손님의 등급을 저장한 배열 r이 주어질 때, 탑승하는 손님의 순서를 return 하도록 solution 함수를 완성해 주세요.

제한 사항
t의 길이는 1 이상 1,000 이하입니다.
t의 원소는 0 이상 10,000 이하인 정수입니다.
t[i]는 아이디가 i인 손님이 도착한 시각(리프트 번호)을 나타냅니다.
예를 들어 t[0]는 아이디가 0인 손님이 탑승장에 도착한 시각(리프트 번호)입니다.
r의 길이는 t의 길이와 같습니다.
r의 원소는 0 이상 5 이하인 정수입니다.
r의 값이 작을수록 우선 순위가 높습니다.
r[i]는 아이디가 i인 손님의 티켓 등급을 나타냅니다.
예를 들어 r[0]는 아이디가 0인 손님의 티켓 등급입니다.
입출력 예
t	r	result
[0,1,3,0]	[0,1,2,3]	[0, 1, 3, 2]
[7,6,8,1]	[0,1,2,3]	[3, 1, 0, 2]
입출력 예 설명
입출력 예 #1
손님이 총 4명 있습니다. 이 중 0번과 3번 손님이 0번 리프트가 탑승장에 들어오는 시각에 도착했습니다. 우선 순위가 높은 0번 손님이 먼저 리프트에 탑승합니다.
1번 리프트가 탑승장에 들어오는 시각에 1번 손님이 도착하고, 1번 손님의 우선 순위가 기존에 도착해서 기다리던 3번 손님보다 높아서 1번 손님이 1번 리프트에 탑승합니다. 다음으로 2번 리프트가 탑승장에 도착하는 시각에 탑승장에 남아있는 손님은 3번 손님 한 명입니다. 추가로 도착한 다른 손님이 없기 때문에 3번 손님이 2번 리프트에 탑승합니다. 마지막으로 2번 손님이 3번 리프트가 탑승장에 들어오는 시각에 도착하고, 혼자서 대기중이므로 바로 3번 리프트에 탑승합니다. 따라서 리프트에 탑승한 손님의 아이디는 순서대로 [0, 1, 3, 2]입니다.

입출력 예 #2
1번, 6번, 7번, 8번 리프트가 탑승장에 들어오는 시각에 각각 손님이 1명씩 들어오므로 우선 순위와 상관 없이 들어오는 순서대로 탑승이 진행됩니다. 따라서 리프트에 탑승한 손님의 아이디는 순서대로 [3,1,0,2]입니다.
	 * 
	 */

	public static void main(String[] args) {

		int[] t = {0,1,3,0};
		int[] r = {0,1,2,3};
		int[] answer = solution(t, r);
		for(int i =0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}
	public static int[] solution(int[] t, int[] r) {

		int check = 0;
		List anslist = new ArrayList();
		while(check < 15) {
			List list = new ArrayList();
			for(int i =0; i<t.length; i++) {
				if(t[i] == check) {
					list.add(i);
				}
			}
			if(list.isEmpty()) {
			}else if(list.size()>1){
				int num = r[(int)Collections.min(list)];
				anslist.add(num);
				for(int j = 0; j < list.size()-1; j++) {
					t[] +=1;
				}
			}else {
				anslist.add(list.get(0));
			}
			check++;
		}

		int size = 0;
		int[] answer = new int[anslist.size()];

		for(Object temp : anslist){

			answer[size++] = (int) temp;

		}
//		int num = Arrays.binarySearch(t, 0);
//		System.out.println(num);
		return answer;
	}
}
