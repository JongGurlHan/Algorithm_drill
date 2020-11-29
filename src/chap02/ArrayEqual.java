package chap02;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int[]a, int[]b) {
		
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 a�ǿ�ڼ� :");
		int num = sc.nextInt();

		int[]a = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"] :" );
			a[i] = sc.nextInt();
		}

		System.out.print("�迭 b�ǿ�ڼ� :");
		int numB = sc.nextInt();
		
		int[]b = new int[numB];
		
		for(int i = 0; i<numB; i++) {
			System.out.print("x["+i+"] :" );
			b[i] = sc.nextInt();
		}
				
	
		
		System.out.println("�迭 a�� b�� "+
							(equals(a,b) ? "�����ϴ�.": "�ٸ��ϴ�."));
		
		
		
		
		
	}

}
