package stact_queue;

import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		int count = 3;
		
        Queue<Character> skill_q = new LinkedList<>();
        for(int i = 0; i < skill.length(); i++) {
        	skill_q.add(skill.charAt(i));
        }
        
        outer : for(int i = 0; i < skill_trees.length; i++) {
        	
        	
        	count = 3;
        	System.out.println("+++++++++++++++++++" + skill_trees[i]);
        	
        	System.out.println(skill_q.peek());
        	for(int j = 0; j < skill_trees[i].length(); j++) {
        		 if(skill.contains(Character.toString(skill_trees[i].charAt(j)))){
        			 if(skill_trees[i].charAt(j) != skill_q.peek()) {
        				 System.out.println("여기" + skill_trees[i].charAt(j) + " " +skill_q.peek());
        				 for(int k = count; k > 0; k--) {
        		        		skill_q.add(skill_q.poll());
        		        	}
        				 continue outer;
        			 }
        			 System.out.println("이건" + skill_trees[i].charAt(j));
        			 skill_q.add(skill_q.poll());
        			 count--;
        		 }
        	}
        	answer++;
        	
        	for(int j = count; j > 0; j--) {
        		skill_q.add(skill_q.poll());
        	}
        	System.out.println("됨" + skill_trees[i]);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"C", "D", "CB", "BDA"};
		
		int result = solution(skill, skill_trees);
		System.out.println(result);
	}
}
