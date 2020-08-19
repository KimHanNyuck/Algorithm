
public class P_AND_Y {
	boolean solution(String s) {
		int i = 0 , j = 0 ;
        String sl = s.toLowerCase();
        for(int c : sl.chars().toArray()) {
        	if(c==112) i++;
        	if(c==121) j++;
        }
        return (i == j || (i==0&&j==0))? true : false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
