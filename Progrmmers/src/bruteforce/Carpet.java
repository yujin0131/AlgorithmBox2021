package bruteforce;

import java.util.ArrayList;

public class Carpet {
	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= yellow; i++) {
			if(yellow % i == 0) {
				list.add(i);
			}
		}
		
		int wid = list.size() / 2;
        int hei = list.size() % 2 == 0 ? wid - 1 : wid;
        int hap = (list.get(wid) + 2 + list.get(hei)) * 2;

		while(hap != brown) {
			wid++;
			hei--;
			hap = (list.get(wid) + 2 + list.get(hei)) * 2;
		}
		
		answer[0] = list.get(wid) + 2;
		answer[1] = list.get(hei) + 2;

		return answer;
	}

	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		int[] result = solution(brown, yellow);
		for(int i = 0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
