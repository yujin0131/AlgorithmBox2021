package stact_queue;

import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int count = skill.length();
		
		Queue<Character> skill_q = new LinkedList<>();
		for(int i = 0; i < skill.length(); i++) {
			skill_q.add(skill.charAt(i));
		}

		outer : for(int i = 0; i < skill_trees.length; i++) {
			if(count != skill.length()){
				for(int k = count; k > 0; k--) {
					skill_q.add(skill_q.poll());
				}
				count = skill.length();
			}

			for(int j = 0; j < skill_trees[i].length(); j++) {
				if(skill.contains(Character.toString(skill_trees[i].charAt(j)))){
					if(skill_trees[i].charAt(j) != skill_q.peek()) {

						continue outer;
					}
					skill_q.add(skill_q.poll());
					count--;
				}
			}
			answer++;


		}


		return answer;
	}

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"};

		int result = solution(skill, skill_trees);
		System.out.println(result);
	}
}
