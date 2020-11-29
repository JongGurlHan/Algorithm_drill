package chap02;

import java.util.Scanner;

//�迭 ��ҿ� ���� �о�鿩 �������� �����մϴ�.
public class ReverseArray {
	
	//�迭 ��� a[idx1]�� a[idx2	]�� ���� �ٲ�
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
		
		System.out.print("��ڼ� :");
		int num = sc.nextInt();

		int[]list = new int[num];
		
		for(int i = 0; i<list.length; i++) {
			System.out.print("x["+i+"] :" );
			list[i] = sc.nextInt();
		}
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		
		reverse(list);
		
		for(int i = 0; i<list.length; i++) {
			System.out.println("x["+i+"] :" +list[i]);
		}
		
		
		
	}

}
