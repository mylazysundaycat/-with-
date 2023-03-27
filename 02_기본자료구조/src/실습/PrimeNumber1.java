package 실습;

public class PrimeNumber1 {
	public static void main(String[] args) {
		//나눗셈의 회수
		int counter = 0;
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				counter++;
				if(n%i==0) {
					break;
				}
			}
			if(n==i)
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행한 횟수:"+counter);
	}
}
