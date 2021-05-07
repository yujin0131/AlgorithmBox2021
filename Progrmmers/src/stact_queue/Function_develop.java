package stact_queue;

import java.util.ArrayList;
import java.util.List;

public class Function_develop {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};

		int[] result = solution(progresses, speeds);

		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

		}


	}

	public static int[] solution(int[] progresses, int[] speeds) {
        int answer[];
        int count = 0; //총 셀거
		int loccount = 0;
		int startloc = 0; //배열 시작 위치
		List<Integer> answerlist = new ArrayList<Integer>();

		while(count < progresses.length) {
			for(int i = startloc; i < progresses.length; i++) {
				if(progresses[i] != 100) {
					progresses[i] += speeds[i];
					if(progresses[i] > 100)
						progresses[i] = 100;
				}
			}


			if(progresses[startloc] == 100) {
				count++;
				loccount++;
			
				while(count < progresses.length -1 &&  progresses[count] == 100) {
					count++;
					loccount++;
				}
				if(count == progresses.length -1 && progresses[count] == 100) {
					count++;
					loccount++;
				}
				
				startloc = count;
				answerlist.add(loccount);
				loccount = 0;
			
			}


		}
		answer = new int[answerlist.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = answerlist.get(i);
		}
		return answer;
    
	}
}
