package chap01;

import java.util.Scanner;

//2�ڸ��� ���(10~99)�� �Է��մϴ�.
public class Digits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		do {
			
			System.out.println("2�ڸ��� ������ �Է��ϼ���");			 
			no = sc.nextInt();
			
		}while(no <10 || no>100);		
		
		System.out.println("���� no�� ���� " + no + "�� �Ǿ����ϴ�.");
	}
	

}
