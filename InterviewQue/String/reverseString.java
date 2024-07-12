import java.io.*;
class Client{
	static void reverseString(String str){
		
		char str1;

		char arr[]=str.toCharArray();

		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}

	}
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String");

		String str=br.readLine();

		reverseString(str);

		System.out.println();
	}
}
