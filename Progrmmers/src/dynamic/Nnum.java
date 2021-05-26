package dynamic;

public class Nnum {
	public static int solution(int[] money) {
		int answer = 0;
		int size = money.length;
		int count = 0;
		int num = 0;

		size = size % 2 == 0 ? 2 : 3;

		while(count < size) {
			for(int i = count; i < money.length; i++) {
				switch (size) {
				case 2:
					if(i % 2 == count % 2) {
						num += money[i];
					}
					break;
  		
				case 3:
					if(money.length == 3) {
						num = money[i];
						break;
					}else {
						if(i != 0 && i != money.length-1 && i % 2 == count % 2) {
							num += money[i];
						}else if(count != 1 && i == money.length-1) {
							num += count == 0 ? money[0] : money[i];
							
						}

						System.out.println(i + " / " + num);
					}

					break;

				}

			}
			if(num > answer) {
				answer = num;
			}
			num = 0;
			count++;
			System.out.println("=========");

		}
		return answer;
	}


	public static void main(String[] args) {
		int[] money = {3, 7, 8, 1, 2, 5, 6};

		int result = solution(money);

		System.out.println(result);
	}
}
