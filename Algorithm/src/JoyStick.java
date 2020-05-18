public class JoyStick {
	
	public int solution(String name) {
        int answer = 0;
        int exp = name.length() - 1;
        for(int i = 0; i < name.length(); i++){
            char alphabet = name.charAt(i);	// n번째 변수
            answer += ('Z'- alphabet + 1) > alphabet - 'A' ? alphabet - 'A' : ('Z' - alphabet + 1);
            //	3항연산으로 N 기준 Up & down
            if(alphabet == 'A'){	// n번째 수가 A라면
                int nextIdx = i+1;	// 다음 수 탐색
                int countA = 0;		// 반복되는 수 체크
                while (nextIdx < name.length() && 
                       name.charAt(nextIdx) == 'A'){
                    countA ++;
                    nextIdx++;
                }
                int tmp = (i-1)*2 + (name.length() -1 -i - countA) ;
                if(exp > tmp) exp = tmp; // length -1이 tmp보다 크다면 tmp = exp
            }
        }

        answer += exp;
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoyStick js = new JoyStick();
		int sol = js.solution("AAABAAA");
		System.out.println(sol);
	}

}
