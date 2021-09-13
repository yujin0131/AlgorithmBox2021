package kakaoRequitment;

import java.util.ArrayList;
import java.util.HashMap;

public class One {

	public static int[] solution(String[] id_list, String[] report, int k) {
       
        int size = report.length;
        int id_size = id_list.length;
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, Integer> check = new HashMap<String, Integer>();
        
        for(int i = 0; i < id_size; i++) {
        	map.put(id_list[i],	"");
        	check.put(id_list[i], 0);
        }
        ArrayList<String> listCheck = new ArrayList<>();
        
        for(int i = 0; i < size; i++) {
        	String[] split = report[i].split(" ");
        	
        	System.out.println("aa" + map.get(split[0]));
        	if(map.get(split[0]).contains(split[1])) continue;
        	
        	System.out.println("dd");
        	map.put(split[0], map.get(split[0]) +" " + split[1]);
        	check.put(split[1], (check.get(split[1])+1));
        	if(check.get(split[1]) == k) {
        		listCheck.add(split[1]);
        		System.out.println("넘었어" + split[1]);
        	}
        	System.out.println(split[0]+ " : " +map.get(split[0]));
        	
        		
        }
        
        
        int[] answer = new int[id_size];

        for(int i = 0; i < id_size; i++) {
        	for(int j = 0; j < listCheck.size(); j++) {
        		if(map.get(id_list[i]).contains(listCheck.get(j))) {
        			answer[i]++;
        		}
        	}
        	
        	
        }
        return answer;
    }
	
	public static void main(String[] args) {


		//		 result = solution();
		//		System.out.println(result);
		
		String[] id_list = {"con","ryan","muzi",  "frodo","apeach", "neo"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con","muzi frodo","apeach frodo","apeach con","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
				int[] result = solution(id_list, report, k);
				for(int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}

	}
}

/*
 2022 KAKAO BLIND RECRUITMENT 예선 for 이유진
감독관 채팅
메시지 보관함
테스트 안내
도움말
Java 레퍼런스
컴파일 옵션
테스트 종료
프로그래밍1
 
프로그래밍2
 
프로그래밍3
 
프로그래밍4
 
프로그래밍5
 
프로그래밍6
 
프로그래밍7
문제 설명
문제 설명
신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.

유저 ID	유저가 신고한 ID	설명
"muzi"	"frodo"	"muzi"가 "frodo"를 신고했습니다.
"apeach"	"frodo"	"apeach"가 "frodo"를 신고했습니다.
"frodo"	"neo"	"frodo"가 "neo"를 신고했습니다.
"muzi"	"neo"	"muzi"가 "neo"를 신고했습니다.
"apeach"	"muzi"	"apeach"가 "muzi"를 신고했습니다.
각 유저별로 신고당한 횟수는 다음과 같습니다.

유저 ID	신고당한 횟수
"muzi"	1
"frodo"	2
"apeach"	0
"neo"	2
위 예시에서는 2번 이상 신고당한 "frodo"와 "neo"의 게시판 이용이 정지됩니다. 이때, 각 유저별로 신고한 아이디와 정지된 아이디를 정리하면 다음과 같습니다.

유저 ID	유저가 신고한 ID	정지된 ID
"muzi"	["frodo", "neo"]	["frodo", "neo"]
"frodo"	["neo"]	["neo"]
"apeach"	["muzi", "frodo"]	["frodo"]
"neo"	없음	없음
따라서 "muzi"는 처리 결과 메일을 2회, "frodo"와 "apeach"는 각각 처리 결과 메일을 1회 받게 됩니다.

이용자의 ID가 담긴 문자열 배열 id_list, 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report, 정지 기준이 되는 신고 횟수 k가 매개변수로 주어질 때, 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ id_list의 길이 ≤ 1,000
1 ≤ id_list의 원소 길이 ≤ 10
id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.
id_list에는 같은 아이디가 중복해서 들어있지 않습니다.
1 ≤ report의 길이 ≤ 200,000
3 ≤ report의 원소 길이 ≤ 21
report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
예를 들어 "muzi frodo"의 경우 "muzi"가 "frodo"를 신고했다는 의미입니다.
id는 알파벳 소문자로만 이루어져 있습니다.
이용자id와 신고한id는 공백(스페이스)하나로 구분되어 있습니다.
자기 자신을 신고하는 경우는 없습니다.
1 ≤ k ≤ 200, k는 자연수입니다.
return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.
입출력 예
id_list	report	k	result
["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
입출력 예 설명
입출력 예 #1

문제의 예시와 같습니다.

입출력 예 #2

"ryan"이 "con"을 4번 신고했으나, 주어진 조건에 따라 한 유저가 같은 유저를 여러 번 신고한 경우는 신고 횟수 1회로 처리합니다. 따라서 "con"은 1회 신고당했습니다. 3번 이상 신고당한 이용자는 없으며, "con"과 "ryan"은 결과 메일을 받지 않습니다. 따라서 [0, 0]을 return 합니다.

제한시간 안내
정확성 테스트 : 10초
Solution.java
size
1
import java.util.ArrayList;
2
import java.util.HashMap;
3
class Solution {
4
    public int[] solution(String[] id_list, String[] report, int k) {
5
             
6
        int size = report.length;
7
        int idSize = id_list.length;
8
        
9
        HashMap<String, String> map = new HashMap<String, String>();
10
        HashMap<String, Integer> check = new HashMap<String, Integer>();
11
        for(int i = 0; i < idSize; i++) {
12
            map.put(id_list[i], "");
13
            check.put(id_list[i], 0);
14
        }
15
        ArrayList<String> listCheck = new ArrayList<>();
16
        
17
        for(int i = 0; i < size; i++) {
18
            String[] split = report[i].split(" ");
19
            if(map.get(split[0]).contains(split[1])) continue;
20
            map.put(split[0], map.get(split[0]) +" " + split[1]);
21
            check.put(split[1], (check.get(split[1])+1));
22
            if(check.get(split[1]) == k) {
23
                listCheck.add(split[1]);
24
            }
25
                
26
        }
27
        
28
        
29
        int[] answer = new int[idSize];
30
        size = listCheck.size();
31
        for(int i = 0; i < idSize; i++) {
32
            for(int j = 0; j < size; j++) {
33
                if(map.get(id_list[i]).contains(listCheck.get(j))) {
34
                    answer[i]++;
35
                }
36
            }
37
            
38
            
39
        }
40
        return answer;
41
    }
42
}
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (9.91ms, 71.7MB)
테스트 2 〉	통과 (10.36ms, 74MB)
테스트 3 〉	실패 (345.15ms, 183MB)
테스트 4 〉	통과 (8.59ms, 69.7MB)
테스트 5 〉	실패 (8.69ms, 62.2MB)
테스트 6 〉	통과 (13.43ms, 60.8MB)
테스트 7 〉	통과 (20.01ms, 81.8MB)
테스트 8 〉	실패 (24.50ms, 90.2MB)
테스트 9 〉	실패 (157.43ms, 143MB)
테스트 10 〉	통과 (96.88ms, 143MB)
테스트 11 〉	실패 (259.57ms, 187MB)
테스트 12 〉	실패 (12.77ms, 71.4MB)
테스트 13 〉	통과 (11.60ms, 71.6MB)
테스트 14 〉	실패 (138.57ms, 111MB)
테스트 15 〉	실패 (137.58ms, 151MB)
테스트 16 〉	실패 (13.49ms, 61.5MB)
테스트 17 〉	실패 (11.82ms, 73.3MB)
테스트 18 〉	실패 (12.86ms, 71.9MB)
테스트 19 〉	실패 (15.37ms, 72.9MB)
테스트 20 〉	실패 (145.63ms, 122MB)
테스트 21 〉	실패 (238.71ms, 134MB)
테스트 22 〉	통과 (7.77ms, 59.8MB)
테스트 23 〉	통과 (8.24ms, 60.6MB)
테스트 24 〉	통과 (7.83ms, 71.1MB)
채점 완료
종료까지
01:08:55 
*/