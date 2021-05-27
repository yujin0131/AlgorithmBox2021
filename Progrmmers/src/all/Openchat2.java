package all;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Openchat2 {
	public static String[] solution(String[] record) {

		HashMap<String, String> map = new HashMap<>();
		List<String> list = new LinkedList<>();

		for(int i = 0; i < record.length; i++) {
			String[] split = record[i].split(" ");
			if(!split[0].equals("Leave")) {
				map.put(split[1], split[2]);
			}
		}

		
		for(int i = 0; i < record.length; i++) {
			String[] split = record[i].split(" ");
			if(split[0].equals("Enter")) {
				list.add(map.get(split[1]) + "님이 들어왔습니다.");
			}else if(split[0].equals("Leave")) {
				list.add(map.get(split[1]) + "님이 나갔습니다.");
			}
		}

		String answer[] = list.toArray(new String[list.size()]);
		
		return answer;
	}

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

		String[] result = solution(record);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

/*
 * 			int first_index = record[i].indexOf(" ");
			int last_index = record[i].lastIndexOf(" ");

			user_id = first_index == last_index ? record[i].substring(first_index+1) : record[i].substring(first_index+1, last_index);
			user_name = record[i].substring(last_index + 1); 		

			if(record[i].contains("Enter")) {
				list.add(user_id+"님이 들어왔습니다.");
				map.put(user_id, user_name);
			}else if(record[i].contains("Leave")) {
				list.add(user_id + "님이 나갔습니다.");
			}else {
				map.put(user_id, user_name);
			}



			int first_index = record[i].indexOf(" ");
			int last_index = record[i].lastIndexOf(" ");

			if(first_index == last_index) {
				user_id = record[i].substring(first_index+1);
				list.add(user_id + "님이 나갔습니다.");
			}else {
				user_id = record[i].substring(first_index+1, last_index);
				user_name = record[i].substring(last_index + 1); 		
				map.put(user_id, user_name);

				if(record[i].contains("Enter")) {
					list.add(user_id+"님이 들어왔습니다.");
				}

			}

		}


		HashMap<String, String> map = new HashMap<>();
		List<String> list = new LinkedList<>();

		for(int i = 0; i < record.length; i++) {
			String[] split = record[i].split(" ");

			if(split[0].equals("Enter")) {
				map.put(split[1], split[2]);
				list.add(split[1]+"님이 들어왔습니다.");
			}else if(split[0].equals("Leave")) {
				list.add(split[1] + "님이 나갔습니다.");
			}else {
				map.put(split[1], split[2]);
			}

		}

		String[] answer = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			String[] split = list.get(i).split("님");
			answer[i] = list.get(i).replaceAll(split[0], map.get(split[0]));

		}
 */
