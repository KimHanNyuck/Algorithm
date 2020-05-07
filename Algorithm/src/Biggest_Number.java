import java.util.Arrays;
import java.util.Comparator;

class Comp implements Comparator<String>{	// Comparator 인터페이스 상속

	@Override	// Override
	public int compare(String o1, String o2) {	// compare 함수 정의
		// TODO Auto-generated method stub
		return (o2+o1).compareTo(o1+o2);
	}
	
}

    

public class Biggest_Number {
	public String solution(int[] numbers) {
		String answer = new String();
		String str_numbers[] = new String[numbers.length];	// String 배열의 방 생성
		
		for(int i=0; i<str_numbers.length; i++) {	// 정수형 배열에서 String형으로 변환
			str_numbers[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str_numbers, new Comp()); // compare 함수 사용 내림차순 정렬
		
		if(str_numbers[0].startsWith("0")) {	// 시작이 0이면 끝까지 0이기때문에 중복 제거
			answer += "0";
		} else {
			for(int j=0; j<str_numbers.length; j++) {	// 담음
				answer += str_numbers[j];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
