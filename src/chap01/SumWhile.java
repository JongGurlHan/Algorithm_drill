package chap01;
//1,2,....,�� ���� ���մϴ�.
import java.util.Scanner;

public class SumWhile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n ������ ���� ���մϴ�.");
		System.out.println("n�� ��:");
		int input  = sc.nextInt();
		int sum = 0;	
		
			
		for(int i =1; i<=input; i++) {
			sum += i;			
		}	
		
		System.out.println("1����" +input+ "������ ���� " +sum+ "�Դϴ�.");
	}
		
	
	
}
