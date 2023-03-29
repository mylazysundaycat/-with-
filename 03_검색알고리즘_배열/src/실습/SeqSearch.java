package 실습;

import java.util.Scanner;

public class SeqSearch {
	//순차검색 while문
	static int seqSearch(int[] a,int key) {
		int i=0;
		while(true) {
			if(i==a.length) {
				return -1;
			}
			if(a[i]==key) {
				return i;
			}
			i++;
		}
	}
	//순차검색 for문
	static int seqSearch2(int[] a,int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	//순차검색 보초법
	static int seqSearchSen(int[] a,int key) {
		int i=0;
		//보초 추가
		a[a.length] = key;
		
		while(true) {
			if(a[i]==key) {
				break;
			}
			i++;
		}
		return i==a.length?-1:i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 총 크기:");
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		
		for(int i=0; i<num; i++) {
			numArr[i] = sc.nextInt();
		}
		System.out.println();		
		System.out.print("검색할 숫자:");
		int key = sc.nextInt();
		
		System.out.println("해당 숫자는 "+seqSearch(numArr, key)+"번째에 존재합니다.");
		
	}
}
