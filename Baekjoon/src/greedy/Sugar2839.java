package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar2839 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		String str = br.readLine();
		int n = Integer.parseInt(str);
		br.close();
		int mok = n / 5; 
		int min = n;
		for(int i = mok; i >= 0; i--) {
			int na = n;
			na -= i * 5;
			if(na % 3 == 0) {
				min = na / 3 + i;
				break;
			}
		}
		
		int answer = min != n ? min : -1;
		System.out.println(answer);
	}
}
