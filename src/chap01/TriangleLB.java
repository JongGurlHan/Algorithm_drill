package chap01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �ﰢ���Դϱ�? :");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {	
			for(int j = 1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
					
		}
	}

}
