package chap01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 삼각형입니까? :");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {	
			for(int j = 1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
					
		}
	}

}
