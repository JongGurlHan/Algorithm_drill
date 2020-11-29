package chap02;

import java.util.Scanner;

//배열 요소에 값을 읽어들여 역순으로 정렬합니다.
public class ReverseArray {
	
	//배열 요소 a[idx1]과 a[idx2	]의 값을 바꿈
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2]=t;
	}
	
	static void reverse(int[]a) {
		for(int i = 0; i<a.length/2; i++) {
			swap(a, i, a.length-1-i);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 :");
		int num = sc.nextInt();

		int[]list = new int[num];
		
		for(int i = 0; i<list.length; i++) {
			System.out.print("x["+i+"] :" );
			list[i] = sc.nextInt();
		}
		System.out.println("요소를 역순으로 정렬했습니다.");
		
		reverse(list);
		
		for(int i = 0; i<list.length; i++) {
			System.out.println("x["+i+"] :" +list[i]);
		}
		
		
		
	}

}
