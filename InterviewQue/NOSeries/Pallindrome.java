/*
 * 123321 yes or no
 */

import java.io.*;
class Client{

	static boolean validpallindrome(int num){
		
		int val=num;

		int rev=0;
		while(val != 0){
			int rem=val % 10;
			rev=rev*10 + rem;
			val=val/10;
		}

		if(rev==num){
			return true;
		}else{
			return false;
		}
	}		
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number");

		int num=Integer.parseInt(br.readLine());

		boolean ret=validpallindrome(num);

		if(ret == true){
			System.out.println(num+" is a Pallindrome No.");
		}else{
			System.out.println(num+" is Not Pallindrome Number");
		}
	}
}
