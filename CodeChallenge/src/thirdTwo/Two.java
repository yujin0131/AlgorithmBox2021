package thirdTwo;

public class Two {

	public static long[] solution(int n, long left, long right) {

        int index = 0;
        long a = left / n;  
		a = a == -1 ? a+1 : a;
        long b = left % n;
        long num = a*n + b;
        int cnt = 0;
        long[] answer = new long[(int)(right-left)+1];
        outer : for(long i = a; i < n; i++) {
        	for(long j = 0; j < n; j++) {
                if(cnt == 0) {
                    j = b;
                    cnt++;
                }

        		answer[index] = j < i ? i+1 : j+1;
        		index++;
                if(num == right) break outer;
        		
        		num++;
        	}

        }
        return answer;

    }
	 
	public static void main(String[] args) {

		int n = 4;
		long left = 7;
		long right = 14;
		long[] result = solution(n, left, right);

		for(int i = 0; i < result.length; i++) {
			//System.out.print(result[i] + " ");
		}
	}
}


/*
 * 문제 설명
정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.

n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 107
0 ≤ left ≤ right < n2
right - left < 105
입출력 예
n	left	right	result
3	2	5	[3,2,2,3]
4	7	14	[4,3,3,3,4,4,4,4]
 */
//
//public long[] solution(int n, long left, long right) {
//
//    long num = 0;
//    int index = 0;
//    long[] answer = new long[(int)(right-left)+1];
//    outer : for(int i = 0; i < n; i++) {
//    	for(int j = 0; j < n; j++) {
//        	if(num>=left) {
//    			answer[index] = j < i ? i+1 : j+1;
//    			index++;
//               if(num == right) break outer;
//    		}
//    		num++;
//    	}
//
//    }
//    return answer;
//
//}



//long[] answer = new long[(int)(right-left)+1];
//long a = (int)left / n;  
//a = a == -1 ? a+1 : a;
//long b = (int)left % n;
//System.out.println(a + " " + b);
//long c = a*n + 1 ;
//long d = 1;
//long s = n*n;
//int cnt = 0;
//for( int i = 0; i < s - a*n; i++) {
//	if(c > n) {
//		c = 1;
//		d++;
//		System.out.println("옴");
//	}
//
//	if(i >= b) {
//		System.out.println("여기");
//		if(cnt == right-left+1) break;
//		answer[cnt++] = c < d ? d : c;
//	}
//	System.out.println(c);
//	c++;
//}
//
//System.out.println("========");
//for(int i= 0; i < 2; i++) {
//	for(int j = 0; j < 4; j++) {
//		System.out.print(j + " ");
//	}
//	System.out.println();
//}
//
//// 1 2 3 4 5 2 2 3 4 5 3 3 3 4 5 4 4 4 4 5 5 5 5 5 5
//// 1 2 3 4 5 6 7 8 2 2
//// 1 2 2 2
//// 1 2 3 2 2 3
//return answer;
