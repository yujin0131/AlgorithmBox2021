package kakao;

import java.util.LinkedList;

public class Cache {
	public static int solution(int cacheSize, String[] cities) {
		
		int answer = 0;
		int size = cities.length;
		LinkedList<String> cache = new LinkedList<>();
		String city = "";
		
		for(int i = 0; i < size; i++) {
			city = cities[i].toUpperCase();
			
			if(cache.contains(city)) {
				cache.remove(city);
				answer++;
			}else {
				answer += 5;
			}
			
			cache.add(city);
			
			if(cache.size() > cacheSize) {
				cache.removeFirst();
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int cacheSize = 5;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		
		int result = solution(cacheSize, cities);
		System.out.println(result);
	}
}
