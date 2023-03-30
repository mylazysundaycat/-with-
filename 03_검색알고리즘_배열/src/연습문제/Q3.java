package 연습문제;

public class Q3 {
	public static void main(String[] args) {
		int[] a = {1,9,2,9,9,3,4};
		int[] idx = new int[10];
		int num = searchIdx(a,7,9,idx);
		System.out.println(num);
	}
	
	static int searchIdx(int[] a,int n,int key,int[] idx) {
		int i=0;
		int j=0;
		do {
			if(a[i]==key) {
				idx[j++]=i;
			}
			i++;
		} while(i<n);
		
		return j;
	}
}
