package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*문제설명
 * 
 * 철수는 주가 데이터를 이용해 특정 기업의 1일 주가 변화 그래프를 그리려고 합니다. 주가 데이터는 다음과 같은 형식을 가지고 있습니다.

"price=[가격] code=[6자리 숫자] time=[날짜]"
"price=" 뒤에는 1 이상의 자연수가 오며, 해당 시각의 주가를 나타냅니다.
"code=" 뒤에 오는 6자리 숫자는 주식종목코드를 나타냅니다.
"time=" 뒤에는 날짜가 YYYYMMDDHH 형식으로 주어집니다.
예를 들어 "2019062213"의 경우 2019년 6월 22일 13시 기준의 데이터입니다.
철수가 이용하려는 데이터에는 여러 기업의 정보가 뒤죽박죽 섞여 있기 때문에, 먼저 원하는 데이터만 골라내는 작업을 하려고 합니다.

특정 기업의 주식종목코드 company_code, 그래프를 그리려는 날짜 day, 주가 데이터 data가 매개변수로 주어질 때, 데이터에서 그래프를 그리려는 날짜에 해당되는 특정 기업의 주가 데이터만 뽑아 시간 순으로 정렬해 return 하도록 solution 함수를 완성해주세요.

제한사항
company_code는 6자리 숫자로 된 문자열입니다.
day는 "YYYYMMDD" 형식의 문자열 입니다.
YYYY년 MM월 DD일을 나타냅니다.
1990년 ~ 2019년까지 날짜가 주어집니다.
시각은 24시간 표기법을 사용합니다.
data는 주가 데이터가 문자열 형식으로 담긴 배열입니다.
data 배열의 길이는 1 이상 1,000 이하입니다.
data의 각 원소는 "price=[가격] code=[6자리 숫자] time=[날짜]" 형식의 문자열입니다.
code와 time은 문제에 설명된 형식을 따릅니다.
같은 주식종목코드를 가지는 데이터 간에 시각이 중복되는 경우는 없습니다.
가격은 0으로 시작하지 않으며, 1이상 10,000,000 이하인 자연수입니다.
return 하는 정답 배열의 길이가 1 이상인 경우만 입력으로 주어집니다.
입출력 예
company_code	day	data	result
"012345"	"20190620"	["price=80 code=987654 time=2019062113","price=90 code=012345 time=2019062014","price=120 code=987654 time=2019062010","price=110 code=012345 time=2019062009","price=95 code=012345 time=2019062111"]	[110, 90]
입출력 예 설명
입출력 예 #1

입력으로 주어지는 data는 다음과 같습니다.

data
1	"price=80 code=987654 time=2019062113"
2	"price=90 code=012345 time=2019062014"
3	"price=120 code=987654 time=2019062010"
4	"price=110 code=012345 time=2019062009"
5	"price=95 code=012345 time=2019062111"
위 데이타에서 주식종목코드가 "012345"인 기업의 2019년 6월 20일의 가격 정보를 뽑아 시간 순으로 정렬해서 return 하면 됩니다. 이에 해당 되는 데이터는 두 번째인 "price=90 code=012345 time=2019062014"와 네 번째인 "price=110 code=012345 time=2019062009" 입니다. 각 데이터에서 가격 정보만 뽑아 시간 순서로 정렬하면 [110, 90] 이 1 됩니다.


 * */
public class One {

	public static void main(String[] args) {
		String code = "012345";
		String day = "20190620"; 
		String[] data = {"price=80 code=987654 time=2019062113","price=90 code=012345 time=2019062014","price=120 code=987654 time=2019062010","price=110 code=012345 time=2019062009","price=95 code=012345 time=2019062111"};

		int [] answer = solution(code, day, data);
		for(int i =0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

	public static int[] solution(String code, String day, String[] data) {

		Object[] keyarr = {};

		String quesday = day;

		Map<Object, Object> quesmap = new HashMap();
		List<Object> list = new ArrayList<>();
		for(int i = 0; i < data.length; i++) {

			if(data[i].contains("code="+code)) {

				if(data[i].contains(day)) {
					int quesprice = Integer.parseInt(data[i].substring(6, data[i].indexOf("code")-1));
					int questime = Integer.parseInt(data[i].substring(data[i].indexOf(day) + 8));

					quesmap.put(questime, quesprice);
				}
			}

		}
		keyarr= quesmap.keySet().toArray();
		Arrays.sort(keyarr);
		TreeMap<Object,Object> reve = new TreeMap(quesmap);

		Iterator<Object> iteratorKey = reve.keySet().iterator(); //키값 내림차순 정렬
		while(iteratorKey.hasNext()){
			int key = (int)iteratorKey.next();
			list.add(reve.get(key));
		}

		int size = 0;
		int[] answer = new int[list.size()];

		for(Object temp : list){

			answer[size++] = (int) temp;

		}







		return answer;
	}
}
