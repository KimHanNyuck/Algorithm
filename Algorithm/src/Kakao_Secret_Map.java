import java.util.Arrays;

public class Kakao_Secret_Map {
	static public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++) {          
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);  
            temp = String.format("%" + n + "s", temp);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kakao_Secret_Map ksm = new Kakao_Secret_Map();
		
		System.out.println(ksm.solution(5, new int[]{9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28}));
	}

}
