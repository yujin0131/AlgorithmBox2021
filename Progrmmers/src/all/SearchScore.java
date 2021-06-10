package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SearchScore {

	public static int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];

		ArrayList<String[]> info_list = new ArrayList<>();
		ArrayList<String[]> query_list = new ArrayList<>();

		for(int i = 0; i < info.length; i++) {	
			String[] info_str = info[i].split(" ");
			info_list.add(info_str);
		}
		
		for(int i = 0; i < query.length; i++) {
			query[i].replaceAll(" and ", " ");
			String[] query_str = query[i].split(" ");
			
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

		int [] result = solution(info, query);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}






//mid : for(int j = 0; j < query.length; j++) {
//	String[] query_str = query[j].split(" ");
//	int num = 0;
//	for(int count = 0; count < info_str.length; count++) {
//		if(info_str[count].equals(query_str[num]) || query_str[num].equals("-") ||(num == 7 && Integer.parseInt(info_str[count]) > Integer.parseInt(query_str[num]))) {
//			num = num != 6 ? num+2 : num+1;
//		}else continue mid;
//
//	}
//	answer[j] += 1;
