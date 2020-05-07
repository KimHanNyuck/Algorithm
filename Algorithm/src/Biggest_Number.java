import java.util.Arrays;
import java.util.Comparator;

class Comp implements Comparator<String>{	// Comparator �������̽� ���

	@Override	// Override
	public int compare(String o1, String o2) {	// compare �Լ� ����
		// TODO Auto-generated method stub
		return (o2+o1).compareTo(o1+o2);
	}
	
}

    

public class Biggest_Number {
	public String solution(int[] numbers) {
		String answer = new String();
		String str_numbers[] = new String[numbers.length];	// String �迭�� �� ����
		
		for(int i=0; i<str_numbers.length; i++) {	// ������ �迭���� String������ ��ȯ
			str_numbers[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(str_numbers, new Comp()); // compare �Լ� ��� �������� ����
		
		if(str_numbers[0].startsWith("0")) {	// ������ 0�̸� ������ 0�̱⶧���� �ߺ� ����
			answer += "0";
		} else {
			for(int j=0; j<str_numbers.length; j++) {	// ����
				answer += str_numbers[j];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
