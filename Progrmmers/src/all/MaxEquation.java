package all;

import java.util.ArrayList;
import java.util.List;

public class MaxEquation {
	public static long solution(String expression) {
        long answer = 0;
        List<String> equation = new ArrayList();
        
        if(expression.contains("*")) {
        	equation.add("*");
        } 
        if(expression.contains("-")) {
        	equation.add("-");
        }
        if(expression.contains("+")) {
        	equation.add("+");
        }
        
       
        return answer;
    }
	
	


	
	public static void main(String[] args) {
		String expression = "50*6-3*2";
		
		long result = solution(expression);
		System.out.println(result);
	}
}
