import java.util.*;

public class Level3_01 {
	public int solution(int n) {
        int answer = 0 ;
        answer = tiles(n);
        return answer;
    }
    public int tiles(int n){
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0 ; i <= list.size(); i++) {
        	if(i <2) {
        		list.add(1);
        	}
        	list.add((list.get(n-2)+list.get(n-1))%1000000007);
        }
        return list.get(n);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level3_01 l3 = new Level3_01();
		l3.solution(4);
	}

}
