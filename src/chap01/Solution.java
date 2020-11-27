package chap01;

import java.util.Scanner;
	 
class Solution {
   
	public int solution(int num) {
        Scanner sc = new Scanner(System.in);
    	num = sc.nextInt();
    	int answer = 0;
        
        do {
        	if(num %2 == 0 ) {
        		num = num/2;
        	}else {
        		num = num*3 +1;
        	}
        	answer++;
        }while(num ==1 || num ==-1); 
        
        
        return answer;
            
    }
    public static void main(String[] args) {
		
	}
    
    
}


