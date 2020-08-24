
public class Gcd {
	public int[] solution(int n, int m) {
        int[] answer = new int[]{};
        int a1 = Math.max(n, m);
		int a2 = Math.min(n, m);
        return new int[] {gcb(n,m), (n*m)/gcb(n,m)};
    }
	public int gcb(int a , int b) {
		while(b>0) {
			int temp = a%b;
			a = b;
			b = temp;
			gcb(a,b);
		}
		return a;
	}
	public int gcm(int a , int b) {
		if(b==0) {
			return a;
		}else {
			int temp = a%b;
			gcm(b, a%b);
			return temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
