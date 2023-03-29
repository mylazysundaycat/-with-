package 실습;

public class BinSearch {
	static int binSearch(int[] a,int key) {
		int start=0;
		int end=a.length-1;
		int bin_num =0;
		
		do {
			bin_num=(start+end)/2;
			if(a[bin_num]==key) {
				return bin_num;
			} else if(a[bin_num]>key) {
				end = bin_num-1;
			} else if(a[bin_num]<key) {
				start = bin_num+1;
			}
		}while(start<=end);
		
		return -1;
	}
	
	static int binSearch2(int[] a,int key) {
		int start=0;
		int end=a.length-1;
		int bin_num=0;
		
		for(int i=0; i<a.length; i++) {
			bin_num=(start+end)/2;
			if(a[bin_num]==key) {
				return bin_num;
			} else if(a[bin_num]>key) {
				end = bin_num-1;
			} else if(a[bin_num]<key) {
				start = bin_num+1;
			}
		}
			
		return -1;
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,6,7,9,13,55,62,782,1312};
		System.out.println(binSearch2(a,7382));
		
	}
}
