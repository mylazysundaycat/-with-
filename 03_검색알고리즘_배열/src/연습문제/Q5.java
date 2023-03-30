package 연습문제;

public class Q5 {
	public static void main(String[] args) {
		int[] a = {1,3,3,4,3,5,6,7,3};
		
		int num = binSearchX(a,9,3);
		System.out.println(num);
	}
	
	static int binSearchX(int[] a, int n, int key) {
		int save_num =0;
		int start = 0;
		int end = a.length;
		int bin = (start+end)/2;
		
		for(int i=0; i<a.length/2; i++) {
			
			if(a[bin]==key) {
				save_num=bin;
				if(bin>0) {
					--bin;
					if(a[bin]==key) {
						save_num=bin;	
					}
				} else {
					break;
				}
			} else if(a[bin]>key) {
				end = bin-1;
				bin = (start+end)/2;
			} else if(a[bin]<key) {
				start = bin+1;
				bin = (start+end)/2;
			}
		}
		
		return save_num;
	}
}
