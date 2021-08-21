package wemakecode;

import java.util.ArrayList;
import java.util.Collections;

public class Three {

	public static int solution(int[] arr) {
		int answer = 0;

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr) {
			if(!list.contains(i)) {
				list.add(i);			
			}
		}
		Collections.sort(list);

		int[] resArr = new int[arr.length];

		int now = 0;
		int size = resArr.length;

		if(list.get(now) != 0) {
			for(int i = 0; i < size; i++) {
				resArr[i] = list.get(now);
			}
			answer++;
		}
		now++; // 1 2 4 8

		int start = 0;
		int count = 0;
		while(now < list.size()) {//
			System.out.println("==========");
			for(int i = 0; i < resArr.length; i++) {
				System.out.print(resArr[i] + " ");
			}
			System.out.println();
			System.out.println("============" + answer);
			
			int check = 0;
			for(int i = start; i < size; i++) {
				
				System.out.println(arr[i] + " " + list.get(now));
			
				if(check == 1 && arr[i] > list.get(now)){
					
				}else if(arr[i] >= list.get(now)) {
					resArr[i] = list.get(now);
					if(i+1 == size) answer++;
					check = 2;
				}else if(check == 2 ){
					System.out.println("fff");
					answer++;
					check = 1;
					
				}
				
			
				if(i+1 == size) {
					System.out.println("오나1 " + i);
					start = 0;
					now++;
				}
			}
			

			

			
		}

		for(int i = 0; i < resArr.length; i++) {
			System.out.print(resArr[i] + " ");
		}
		System.out.println();
		return answer;
	}
	// 1  2  4  8
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,6,8,9,5,1};
		int result = solution(arr);
		System.out.println(result);
	}
}



/*
 0 이상의 정수로 이루어진 배열 arr이 주어집니다. 당신은 arr과 길이가 같으며 모든 원소가 0으로 이루어진 배열 A를 다음 작업을 통해 arr과 같게 만들려고 합니다.

인덱스 i부터 j까지의 구간에 속하는 모든 원소에 임의의 양의 정수 value를 더합니다.
0 ≤ i ≤ j < A의 길이
예를 들어 arr이 [1, 2, 4, 8, 4, 2, 1] 일 때, 다음 과정을 통해 A를 arr과 같게 만들 수 있습니다.

i	j	value	A
-	-	-	[0, 0, 0, 0, 0, 0, 0]
0	6	1	[1, 1, 1, 1, 1, 1, 1]
1	5	1	[1, 2, 2, 2, 2, 2, 1]
2	4	2	[1, 2, 4, 4, 4, 2, 1]
3	3	4	[1, 2, 4, 8, 4, 2, 1]
위와 같이, A를 arr과 같게 만들려면 최소 4번의 작업이 필요하며, 이보다 적은 횟수로 작업을 마칠 수 없습니다.

정수 배열 arr이 매개변수로 주어질 때, 0으로 이루어진 배열을 arr과 같은 배열로 만들기 위해 필요한 최소 작업 횟수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ arr의 길이 ≤ 100,000
0 ≤ arr의 원소 ≤ 1,000,000,000
입출력 예
arr	result
[1, 2, 4, 8, 4, 2, 1]	4
[1, 3, 5, 7, 6, 8, 9, 5, 1]	7
[10, 0, 10, 0, 10, 0]	3
[5, 4, 5, 4, 5, 5]	4
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.

입출력 예 #2

다음과 같은 과정을 거쳐 작업을 마칠 수 있습니다.

i	j	value	A
-	-	-	[0, 0, 0, 0, 0, 0, 0, 0, 0]
0	8	1	[1, 1, 1, 1, 1, 1, 1, 1, 1]
1	7	2	[1, 3, 3, 3, 3, 3, 3, 3, 1]
2	7	2	[1, 3, 5, 5, 5, 5, 5, 5, 1]
3	6	1	[1, 3, 5, 6, 6, 6, 6, 5, 1]
3	3	1	[1, 3, 5, 7, 6, 6, 6, 5, 1]
5	6	2	[1, 3, 5, 7, 6, 8, 8, 5, 1]
6	6	1	[1, 3, 5, 7, 6, 8, 9, 5, 1]
위 방법 외에 다른 방법으로도 작업을 마칠 수 있으나, 7보다 적은 횟수로 작업을 마치는 방법은 없습니다. 따라서 7을 return 합니다.

입출력 예 #3

다음과 같은 과정을 거쳐 작업을 마칠 수 있습니다.

i	j	value	A
-	-	-	[0, 0, 0, 0, 0, 0]
0	0	10	[10, 0, 0, 0, 0, 0]
2	2	10	[10, 0, 10, 0, 0, 0]
4	4	10	[10, 0, 10, 0, 10, 0]
따라서 3을 return 합니다.

입출력 예 #4

다음과 같은 과정을 거쳐 작업을 마칠 수 있습니다.

i	j	value	A
-	-	-	[0, 0, 0, 0, 0, 0]
0	5	4	[4, 4, 4, 4, 4, 4]
0	0	1	[5, 4, 4, 4, 4, 4]
2	2	1	[5, 4, 5, 4, 4, 4]
4	5	1	[5, 4, 5, 4, 5, 5]
따라서 4를 return 합니다.
*/
