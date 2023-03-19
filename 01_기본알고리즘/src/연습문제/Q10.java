package 연습문제;

public class Q10 {
	public static void main(String[] args) {
		System.out.println(jarisu(1332));
	}
	
	static int jarisu(int n) {
		int size = 0;
		
		while(n/10!=0) {
			size++;
			n = n/10;
		}
		size++;
		
		return size;
	}
}
