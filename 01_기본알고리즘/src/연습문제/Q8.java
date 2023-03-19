package 연습문제;

public class Q8 {
	static int sumof (int a,int b) {
		int x = 0;
		int y = 0;
		
		if(a<b) {
			x = a;
			y = b;
		} else {
			x = b;
			y = a;
		}
		
		int sum = 0;
		
		for(int i=x; i<=y; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumof(0, 10));
	}
}
