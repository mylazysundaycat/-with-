package 실습;

public class EuclidGCD {
	public static int euclidGCD(int a, int b) {
			int maxNum = Math.max(a, b);
			int minNum = Math.min(a, b);
			
			int q = maxNum/minNum;
			int r = maxNum%minNum;
			
			if(r==0) {
				return minNum;
			} else {
				return euclidGCD(r,b);
			}
	}
	
	public static void main(String[] args) {
		int a = 50;
		int b = 15;
		
		int c = euclidGCD(a,b);
		System.out.println(c);
	}
	
	
}
