package chap01;
//1,2,....,의 합을 구합니다.
import java.util.Scanner;

public class SumWhile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n 까지의 합을 구합니다.");
		System.out.println("n의 값:");
		int input  = sc.nextInt();
		int sum = 0;	
		
			
		for(int i =1; i<=input; i++) {
			sum += i;			
		}	
		
		System.out.println("1부터" +input+ "까지의 합은 " +sum+ "입니다.");
	}
		
	
	
}
