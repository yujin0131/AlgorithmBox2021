package grap;

public class Two {

	public static int[] solution(String[] card_numbers) {
		int size = card_numbers.length;
		int[] answer = new int[size];
		int strnum = 0;
		int even = 0;
		int odd = 0;
		int count = 0;
		for(int i = 0; i < size; i++) {
			while(card_numbers[i].contains("-")) {
				card_numbers[i] = card_numbers[i].replaceFirst("-", "");
				count++;
			}
			if(!(count == 3 || count == 0)) {
				answer[i] = 0;
				count = 0;
				System.out.println("?? "  + card_numbers[i]);
				continue;
			}
			
			System.out.println(card_numbers[i]);
			
			strnum = card_numbers[i].length(); // 16
			if(strnum != 16) {
				answer[i] = 0;
				continue;
			}
			System.out.println(strnum + " " + even + " " + odd + " ");
			for(int j = strnum-1; j >= 0; j--) { // 15
				int now = card_numbers[i].charAt(j) -'0';
				if((strnum - j) % 2 == 0) {
					now *= 2;
					while(now > 9) {
						now = now / 10 + now % 10;
					}
					even += now;
					System.out.print(even + " ");
				}else {
					odd += now;
					System.out.print(odd + " ");
				}
				now = 0;
			}
			System.out.println();
			System.out.println(even + " " + odd);
			answer[i] = (even + odd) % 10 == 0 ? 1 : 0; 
			even = 0;
			odd = 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] card_numbers = {"3285-3764-9934-2453", "3285376499342453", "3285-3764-99342453", "328537649934245", "3285376499342459", "3285-3764-9934-2452"};
		int[] result = solution(card_numbers);
		for(int i = 0; i < card_numbers.length; i++) {
			System.out.println(result[i]);
		}
	}
}

/*
 * 문제 설명
신용 카드 번호는 총 16자리 숫자로 구성되며, 다음과 같은 형식을 가집니다.

XXXX-XXXX-XXXX-XXXX : X는 0 ~ 9 까지의 정수이며, 4자리씩 총 16개 숫자가 '-'로 연결된 형태입니다.
XXXXXXXXXXXXXXXX : X는 0 ~ 9 까지의 정수이며, 총 16개 숫자가 공백 없이 연결된 형태입니다.
또한, 신용 카드 번호는 Luhn 공식을 통해 유효성을 검사합니다. Luhn 공식은 아래와 같습니다.

가장 오른쪽부터 짝수번째 자리 숫자들에 2를 곱한 후 모두 더합니다. 이를 (1)이라고 합니다.
만약 2를 곱한 수가 두 자릿수라면 각 자릿수의 값을 더해 한 자릿수로 만든 후 더합니다.
가장 오른쪽부터 홀수번째에 있는 숫자를 모두 더하고 이를 (2)라고 합니다.
(1) + (2)가 10으로 나누어 떨어지면 유효한 번호입니다.
위에 제시된 형식 이외의 신용 카드 번호와 유효성 검사를 통과하지 못한 번호는 올바르지 않은 신용 카드 번호로 판단합니다.

신용 카드 번호들이 담긴 문자열 배열 card_numbers가 주어질 때, 각 카드 번호가 올바르면 1, 올바르지 않으면 0으로 표시한 배열을 return 하도록 solution 함수를 완성해주세요.

제한사항
card_numbers의 길이는 1 이상 10 이하입니다.
card_numbers의 원소는 신용 카드 번호를 나타내는 문자열입니다.
각 문자열은 0 ~ 9까지의 숫자와 '-'로만 구성되어 있습니다.
각 문자열의 길이는 1 이상 20 이하입니다.
입출력 예
card_num	return
["3285-3764-9934-2453", "3285376499342453", "3285-3764-99342453", "328537649934245", "3285376499342459", "3285-3764-9934-2452"]	[1, 1, 0, 0, 0, 0]
입출력 예 설명
입출력 예 #1

첫번 째 카드 번호의 경우 가장 오른쪽 부터의 순서와 각 위치의 숫자는 아래와 같습니다.

idx	16	15	14	13	12	11	10	9	8	7	6	5	4	3	2	1
number	3	2	8	5	3	7	6	4	9	9	3	4	2	4	5	3
예를 들어 오른쪽에서 10번째 숫자는 6이며, 이를 2배하면 12가 됩니다. 12의 각 자릿수 값을 더하면 3이 됩니다.

조건에 따라 짝수번째 숫자를 모두 2배해서 더하면 42가 됩니다. 또, 홀수 번째 숫자를 모두 더하면 38이 됩니다.

42 + 38 = 80이며, 이는 10으로 나누어 떨어지므로 올바른 번호입니다.

두 번째 카드 번호 또한 조건을 만족하므로 올바른 번호입니다.

세 번째, 네 번째 번호는 신용 카드 번호의 형식을 맞추지 못하므로 올바르지 않은 않은 번호입니다.
다섯 번째, 여섯 번째 번호는 신용 카드 번호의 형식은 맞추고 있으나, 유효성 검사를 만족하지 못하므로 올바르지 않은 번호입니다.
 */
