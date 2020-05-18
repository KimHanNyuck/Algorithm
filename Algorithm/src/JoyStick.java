public class JoyStick {
	
	public int solution(String name) {
        int answer = 0;
        int exp = name.length() - 1;
        for(int i = 0; i < name.length(); i++){
            char alphabet = name.charAt(i);	// n��° ����
            answer += ('Z'- alphabet + 1) > alphabet - 'A' ? alphabet - 'A' : ('Z' - alphabet + 1);
            //	3�׿������� N ���� Up & down
            if(alphabet == 'A'){	// n��° ���� A���
                int nextIdx = i+1;	// ���� �� Ž��
                int countA = 0;		// �ݺ��Ǵ� �� üũ
                while (nextIdx < name.length() && 
                       name.charAt(nextIdx) == 'A'){
                    countA ++;
                    nextIdx++;
                }
                int tmp = (i-1)*2 + (name.length() -1 -i - countA) ;
                if(exp > tmp) exp = tmp; // length -1�� tmp���� ũ�ٸ� tmp = exp
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
