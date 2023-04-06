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
		for(int i=0; i<n-1; i++)
			for(int j=n-1; j>i; j--)
				if(a[j-1]>a[j])
					swap(a,j-1,j);
	}
	
	public static void main(String[] args) {
		int[] a = {3,6,8,10,44,82,103131,680,230};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}
