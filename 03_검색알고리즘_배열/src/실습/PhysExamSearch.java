package 실습;

import java.util.Arrays;
import java.util.Comparator;

public class PhysExamSearch {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		public PhyscData (String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new  HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height>d2.height) ? 1 : (d1.height<d2.height) ?-1 : 0;
			}
		}
	}
	

	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("피카츄",150,3.2),
				new PhyscData("라이츄",190,10.3),
				new PhyscData("파이리",188,5.2)
		};
		
		System.out.println(Arrays.toString(x));
		
		
		int idx = Arrays.binarySearch(x, new PhyscData("", 188, 0.0), PhyscData.HEIGHT_ORDER);
		
		System.out.println(idx);
	}
	
}
