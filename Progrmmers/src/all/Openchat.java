package all;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Openchat {
	public static String[] solution(String[] record) {

		HashMap<String, String> map = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();

		for(int i = 0; i < record.length; i++) {
			if(record[i].contains("Enter") || record[i].contains("Change")) {
				if(!record[i].substring(5, 6).equals(" ")) {
					q.add(i);
				}
				int first_index = record[i].indexOf(" ");
				int last_index = record[i].lastIndexOf(" ");

				String user_id = record[i].substring(first_index+1, last_index);
				String user_name = record[i].substring(last_index + 1); 

				map.put(user_id, user_name);
				System.out.println(user_id + " " + map.get(user_id));
			}
		}

		String[] answer = new String[record.length - q.size()];

		int j = -1;
		for(int i = 0; i < record.length; i++) {
			j++;
			if(i == q.peek()) {
				q.poll();
				j--;
				continue;
			}
			int first_index = record[i].indexOf(" ") +1 ;
			int last_index = record[i].indexOf(" " , 7);

			if(record[i].contains("Enter")) {
				answer[j] = map.get(record[i].substring(first_index, last_index)) + "님이 들어왔습니다.";
			}else {
				answer[j] = map.get(record[i].substring(first_index)) + "님이 나갔습니다.";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] record = {"Enter uid1234234 Muziginnamedlaus", "Enter u Prodo", "Leave uid1234234","Enter uid1234 Prodo", "Change uid1234 yujin", "Leave uid1234","Change u Ryan"};

		String[] result = solution(record);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
