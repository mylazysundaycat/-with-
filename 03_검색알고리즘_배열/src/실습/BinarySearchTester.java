package 실습;

import java.util.Arrays;

public class BinarySearchTester {
	public static void main(String[] args) {
		int[] a = {1,3,5,6,7,8,0,43,423,46,56,65854,9,324};
		
		System.out.println(pointer(a,7));
	}
	
	static int pointer(int[] a, int key) {
		int idx = Arrays.binarySearch(a, key);
		System.out.println(idx);
		if(Math.abs(idx+1)==a.length) {
			return 0;
		} else {
			return a[Math.abs(idx+1)];
		}
	}
}
