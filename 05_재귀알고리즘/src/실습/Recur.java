package 실습;

import java.util.Stack;

public class Recur {
	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	static void recur2(int n) {
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	
	static void recur3(int n) {
		Stack s = new Stack();
	}
	
	public static void main(String[] args) {
		recur(4);
		System.out.println();
		recur2(4);
	}
}
