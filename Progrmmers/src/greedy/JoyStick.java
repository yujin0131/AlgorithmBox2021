package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class JoyStick {

	 public static String[] solution(String[] files) {
	        String[] answer = new String[files.length];
	        
	        int count = 0;
	        ArrayList<Integer> list = new ArrayList<>();
	        while(count < files.length) {
	        	for(int i = 0; i < files.length - i - 1; i++) {
	        		String str1 = files[i].replaceAll("[0-9]", "").toUpperCase();
	        		String str2 = files[i].replaceAll("[0-9]", "").toUpperCase();
	        		if(str1.compareTo(str2) > 0) { //더 뒤에 오는 거
	        			
	        		}
	        	}
	        	count++;
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		String[] files = {"IMG12.png", "img10.png", "img02.png", "img1.png", "img01.GIF", "img2.JPG"};
		
		String[] result = solution(files);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
