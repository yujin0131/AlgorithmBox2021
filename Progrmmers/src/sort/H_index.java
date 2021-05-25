package sort;

public class H_index {
	public static int solution(int[] citations) {
        int answer = 0;
        
        int check = -1;
        for(int i = 0; i < citations.length; i++) {
        	check = citations[i];
        	int high = 0;
        	int low = 0;
        	for(int j = 0; j < citations.length; j++) {
        		if(citations[j] > check) high++;
        		else if(citations[j] < check) low++;
        		else {
        			high++;
        			low++;
        		}
        	}
        	if(check >= high && check <= low ) break;
        }
        

		answer = check;
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] citations = {3,0,6,1,5};
		int result = solution(citations);
		System.out.println(result);
	}
}
