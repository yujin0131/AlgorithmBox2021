package sort;

public class LargestNumber {
	public static String solution(int[] numbers) {
		String answer = "";


		return answer;
	}
	
	public static void main(String[] args) {

		int[] numbers = {34, 3, 7 ,35, 41};

		String result = solution(numbers);
		System.out.println(result);
	}
}

/* public static String solution(int[] numbers) {
        String answer = "";
        int count = 0;

        String[] str_num = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) 
        	str_num[i] = Integer.toString(numbers[i]);


        while(count < str_num.length) {       	
        	int big = count;	

        	for(int i = count; i < str_num.length; i++) {
        		if(str_num[big].charAt(0) < str_num[i].charAt(0)) {
        			big = i;
        		}else if(str_num[big].charAt(0) == str_num[i].charAt(0)&& Integer.parseInt(str_num[big]) < Integer.parseInt(str_num[i])) {
        			big = i;
        		}
        		change(count, big, str_num);

        	}
        	count++;
        }

        for(int i = 0; i < str_num.length; i++) 
        	answer += str_num[i];

        return answer;
    }

	public static void change(int count, int big, String[] str_num) {
		String temp = str_num[count];
		str_num[count] = str_num[big];
		str_num[big] = temp;

	}
 */
