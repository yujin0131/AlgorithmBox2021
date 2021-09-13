package kakaoRequitment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Three {

	public static int[] solution(int[] fees, String[] records) {

		int size = records.length;
		TreeMap<Integer, Integer> car = new TreeMap<>();
		HashMap<Integer, Integer> carCheck = new HashMap<>();

		for(int i = 0; i < size; i++) {
			String[] split = records[i].split(" ");
			String[] time = split[0].split(":");
			int carNum = Integer.parseInt(split[1]);
			int reTime = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);
	
			if(split[2].equals("OUT")) {
				car.put(carNum, car.get(carNum) + reTime);
				carCheck.remove(carNum);
				
			}else {
				if(!car.containsKey(carNum)) {
					car.put(carNum, 0 - reTime);
				
					continue;
				}
				car.put(carNum, (car.get(carNum) - reTime));
				carCheck.put(carNum, reTime);
				
			}
		}
		size = car.size();
		int[] answer = new int[size];

		for(int i = 0; i < size; i++) {
			if(carCheck.containsKey(car.firstKey())) {
				car.put(car.firstKey(), car.get(car.firstKey()) + 1439);
				System.out.println("??");
			}
			
			int mod = car.get(car.firstKey()) - fees[0];
			if(mod < 0) {
				answer[i] = fees[1];
			}else {
				
				mod = mod % fees[2] != 0 ? mod / fees[2] + 1 : mod/fees[2];
				answer[i]= fees[1] + mod * fees[3];
			}

			car.remove(car.firstKey());

		}
		return answer;
	}

	public static void main(String[] args) {


		//		 result = solution();
		//		System.out.println(result);

		int[] fees = {1,4611,1,10};
		String[] records = { "00:00 1234 IN"};
		int[] result = solution(fees, records);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
