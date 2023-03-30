package 실습;

import java.util.Arrays;

public class StringBinarySearch {
	public static void main(String[] args) {
		String[] x = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int idx = Arrays.binarySearch(x, "q");
		System.out.println(idx);
		
		
				
	}
}
