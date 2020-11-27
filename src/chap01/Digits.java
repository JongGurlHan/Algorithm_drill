package chap01;

import java.util.Scanner;

//2자리의 양수(10~99)을 입력합니다.
public class Digits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		do {
			
			System.out.println("2자리의 정수를 입력하세요");			 
			no = sc.nextInt();
			
		}while(no <10 || no>100);		
		
		System.out.println("변수 no의 값은 " + no + "가 되었습니다.");
	}
	

}
