package all;

public class BinaryChaTwo {
	public static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
	
			String binary = Integer.toBinaryString((int) numbers[i]);
			binary = String.format("%030d", Integer.parseInt(binary));
			
			String check = binary.substring(binary.length()-2);
			
			if(binary.substring(binary.length()-1).equals("0") || check.equals("01")){
				answer[i] = ++numbers[i];
			}else {
				int index = binary.lastIndexOf("0");
				binary = binary.replaceFirst("01", "10");
				answer[i] = Integer.parseInt(binary, 2);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		long[] numbers = {1, 8};
		long[] result = solution(numbers);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
