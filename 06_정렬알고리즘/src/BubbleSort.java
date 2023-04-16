import java.util.Arrays;

public class BubbleSort {
	//교환
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	//버블정렬-오름차순
	static void bubbleSort(int[] a) {
		int n = a.length;
		int count = 0;
		for(int i=0; i<n-1; i++) {
			int change_num = 0;
			for(int j=n-1; j>i; j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					change_num++;
					count++;
				}
				//교환횟수가 없으면 반복문 종료
				if(change_num==0){
					break;
				}
		}
		System.out.println("count:"+count);
	}
	
	//버전2
	static void bubbleSort2(int[] a) {
		int n = a.length;
		int k = 0;
		int count = 0;
		while(k<n-1) {
			int last = n-1;
			for(int j=n-1; j>k; j--)
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					count++;
					last = j;
				}
			k = last;
		}
		System.out.println("count:"+count);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,6,83123,10,44,5,82,103131,680,230};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = {3,6,83123,10,44,82,103131,680,230};
		bubbleSort2(b);
		
	}
}
