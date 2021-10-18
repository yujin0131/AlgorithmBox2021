package kakaoMobilty;

public class Three {
	public static int solution(int[] A) {

        int size = A.length;
       
        if(size == 1) return 1;
        else if(size == 2) return 2;
        
        int odd = A[1];
        int even = A[0];
        int cnt = 2;
        int answer = 0;
        for(int i = 2; i < size; i++) {
        	System.out.println("===========" + even + " " +odd + " " +cnt);
        	if(i % 2 == 0 && A[i] != even)  {
        		System.out.println("여기 " +i + " "+ A[i] +  " "+even);
        		even = A[i];
        		if(i+1 < size) {
        			cnt = odd == A[i+1] ? 2 : 1;
        		}

        		answer = answer < cnt ? cnt : answer;

        	}else if (i % 2 == 1 && A[i] != odd){
        		System.out.println("여기2 " +i + " "+ A[i] +  " "+odd);
        		odd = A[i];
        		if(i+1 < size) {
        			cnt =  even == A[i+1] ? 2 : 1;
        		}
        		answer = answer < cnt ? cnt : answer;

        	}else {
        		cnt++;
        		if(i+1 == size) answer = cnt;
        	}
        	
        }
		return answer;
    }
	
	public static void main(String[] args) {
		int[] A = {7,-5,-5,-5,7,-1,7};
		int result = solution(A);
		System.out.println(result);
		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(reuslt[i]);
//		}
	}
}
