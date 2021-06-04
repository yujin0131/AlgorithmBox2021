package all;

import java.util.ArrayList;

public class MaxEquation {

	static int size = 0;
	static String[] equation_arr;
	static ArrayList<ArrayList<String>> result_arr = new ArrayList();
	static ArrayList<String> equList = new ArrayList();
	static ArrayList<Long> numList = new ArrayList();
	static Long max = (long) 0;

	public static long solution(String expression) {
		ArrayList<String> equation = new ArrayList();


		if(expression.contains("*")) {
			equation.add("*");
		} 
		if(expression.contains("-")) {
			equation.add("-");
		}
		if(expression.contains("+")) {
			equation.add("+");
		}

		String n = "";
		for(int i = 0; i < expression.length(); i++) {
			char cha = expression.charAt(i);
			if(cha == '*' || cha == '+' || cha == '-') {
				equList.add(cha + "");
				numList.add(Long.parseLong(n));
				n = "";

			}else {
				n += cha;
			}
		}
		numList.add(Long.parseLong(n));

		size = equation.size();
		equation_arr = new String[size];
		boolean[] check = new boolean[size];
		permutation(size, equation, check, equation_arr, 0);



		return max;
	}

	public static void permutation(int size, ArrayList<String> equation, boolean[] check, String[] equation_arr, int depth) {
		if(depth == size) {
			solve();
			return;
		}

		for (int i = 0; i < size; i++){
			if (!check[i]) {
				check[i] = true;                    // 중복 체크
				equation_arr[depth] = equation.get(i);
				permutation(size, equation, check, equation_arr, depth+1);
				check[i] = false;
			}
		}
	}

	public static void solve() {
		ArrayList<String> equ = new ArrayList<>();
		equ.addAll(equList);
		ArrayList<Long> num = new ArrayList<>();
		num.addAll(numList);

		for(int i = 0; i<equation_arr.length; i++) {
			String first = equation_arr[i];
			for(int j = 0; j < equ.size(); j++) {
				if(first.equals(equ.get(j))) {
					long num1 = num.get(j);
					long num2 = num.get(j+1);

					equ.remove(j);
					num.remove(j+1);
					num.remove(j);
					num.add(j, cal(first, num1, num2));

					j--;
				}
			}
		}

		System.out.println(num.get(0));
		if(Math.abs(num.get(0)) > max) {
			max = Math.abs(num.get(0));

		}

	}

	public static long cal(String first, long num1, long num2) {
		switch (first) {
		case "*":
			return num1 * num2;
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		}
		return 0;
	}
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";

		long result = solution(expression);
		System.out.println("정답 " + result);
	}
}

