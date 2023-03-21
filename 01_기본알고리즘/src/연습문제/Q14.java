package 연습문제;

public class Q14 {
	public static void main(String[] args) {
		 //triangleB(5);
		 //triangleLU(5);
		 //triangleRU(5);
		triangleRB(5);
	}
	static void triangleB(int n) {
		for(int i=n; i>0; i--) {
			System.out.print("*".repeat(n-i+1));
			System.out.println();
		}
		System.out.println();
	}
	
	static void triangleLU(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("*".repeat(n-i));
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i=0; i<n; i++) {
			System.out.print(" ".repeat(i));
			System.out.print("*".repeat(n-i));
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i=0; i<n; i++) {
			System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(i+1));
		}
	}
}
