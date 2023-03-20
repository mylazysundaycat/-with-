package 연습문제;

public class Q11 {
	public static void main(String[] args) {
		System.out.println("  | 1  2  3  4  5  6  7  8  9");
		System.out.println("--+---------------------------");
		for(int i=0;i<9;i++) {
			for(int j=0; j<9; j++) {
				
				if(j==0) {
					System.out.printf("%d |",i+1);
				} 
				
				if((j+1)*(i+1)>=10) {
				System.out.printf(" "+(j+1)*(i+1));	
				}else {
				System.out.printf("  "+(j+1)*(i+1));
				}
			}
			System.out.println();
		}
	}
}
