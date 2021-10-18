package kakaoMobilty;

public class Two {
	public static int solution(int[] T, int[] A) {
        int answer = 1;
        int size = A.length;
        boolean[] check = new boolean[T.length];
        check[0] = true;
        int idx = 0;
        for(int i = 0; i < size; i++) {
        	System.out.println(i + " -===================");
        	idx = A[i];
        	if(idx == 0) continue;
        	while(!check[idx]) {
        		System.out.println(idx);
        		check[idx] = true;
        		idx = T[idx];
        		answer++;
        	}
        }
        return answer;	
    }
	
	public static void main(String[] args) {
		int[] T = {0,0,0,0,2,3,3};
		int[] A = {2,5,6};
		int result = solution(T,A);
		System.out.println(result);
		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(reuslt[i]);
//		}
	}
}
