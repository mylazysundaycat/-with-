package 연습문제;

public class Q7_Fail {
	static int Gaus(int num) {
		return (1+num)*(num/2);
	}
	public static void main(String[] args) {
		int n = Gaus(10);
		System.out.println(n);
	}
}

