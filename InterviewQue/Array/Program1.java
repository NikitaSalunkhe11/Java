/*
 *Find Largest Number in an Array.....
 */

import java.io.*;
class Client{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter array Elements");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int num=0;
		for(int i=0;i<arr.length;i++){
			if(num < arr[i]){
				num=arr[i];
			}
		}
		System.out.println("Largest element is "+num);
	}
}



