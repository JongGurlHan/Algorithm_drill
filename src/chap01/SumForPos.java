package chap01;
//1,2,....,의 합을 구합니다.(양수만 입력)
import java.util.Scanner;

public class SumForPos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.println("1부터 n 까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값:");
			input  = sc.nextInt();			
		}while(input <=0);
		
		int sum = 0;
		
		
		for(int i =1; i<=input; i++) {
			sum += i;			
		}	
		
		System.out.println("1부터" +input+ "까지의 합은 " +sum+ "입니다.");
	}
		
	
	
}
