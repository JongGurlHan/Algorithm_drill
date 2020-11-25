package chap01;

//3개의 정수값 입력하고 최댓값을 구합니다.
import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		int c  = sc.nextInt();
		int max = a;
		
		if(b>max) max = b;
		if(c>max) max = c;
				
		System.out.println("최대값은 " +max+ "입니다.");
		
		
		
	}

}
