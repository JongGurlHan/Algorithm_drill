package chap01;
//1,2,....,�� ���� ���մϴ�.(����� �Է�)
import java.util.Scanner;

public class SumForPos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("1���� n ������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� ��:");
			input  = sc.nextInt();			
		}while(input <=0);
		
		int sum = 0;
		
		
		for(int i =1; i<=input; i++) {
			sum += i;			
		}	
		
		System.out.println("1����" +input+ "������ ���� " +sum+ "�Դϴ�.");
	}
		
	
	
}
