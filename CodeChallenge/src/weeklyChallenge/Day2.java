package weeklyChallenge;

public class Day2 {
	public static String solution(int[][] scores) {
        String answer = "";
        int length = scores.length;
        float[] student = new float[length];
        int[] student_cnt = new int[length];
        int[] max = new int[length];
        int[] min = new int[length];
        int[] max_cnt = new int[length];
        int[] min_cnt = new int[length];
        int now = 0;
        for(int i = 0; i < length; i++) {
        	min[i] = 100;
        }
        
        for(int i = 0; i < length; i++) {
        	for(int j = 0; j < length; j++) {
        		now = scores[i][j];
        		student[j] += now;
        		if(max[j] <= now) {
        			System.out.println("max  " +now + " " + i + " "+j); 
        			max_cnt[j] = max[j] == now ? max_cnt[j]+1 : 0;
        			max[j] = now;
        		}
        		if(min[j] >= now) {
        			System.out.println("min  " +now + " " + i + " "+j); 
        			min_cnt[j] = min[j] == now ? min_cnt[j]+1 : 0;
        			System.out.println("cnt " + j + " : "+ min[j] +" " +  now + " " + min_cnt[j]);
        			min[j] = now;
        		}
        	}

        	
        }
        
        for(int i = 0; i <length; i++) {
        	if((max[i] == scores[i][i] && max_cnt[i] == 0) ||(min[i] == scores[i][i] && min_cnt[i] == 0)) {
        		student[i] -= scores[i][i];
        		student_cnt[i]++;
        	}
        	student[i] /= length-student_cnt[i];
        	if(student[i] >= 90) answer+= "A";
        	else if(student[i] >= 80) answer+= "B";
        	else if(student[i] >= 70) answer+= "C";
        	else if(student[i] >= 50) answer+= "D";
        	else answer+= "F";
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		String result = solution(scores);
		System.out.println(result);
	}
}
