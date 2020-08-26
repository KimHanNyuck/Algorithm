
public class Normal_Square {
	public long solution(int w, int h) {
        long answer = 1;
        int a = Math.max(w, h);
        int b = Math.min(w, h);
        long minus = gcb(a,b);
        return (long)w*h-(w+h-minus);
    }
	public long gcb(int a, int b) {
		while(b>0) {
			int temp = a%b;
			a = b;
			b = temp;
			gcb(a,b);
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Normal_Square ns = new Normal_Square() ;
		System.out.println(ns.solution(12, 8));
	}

}
