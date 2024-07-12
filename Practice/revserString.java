
import java.io.*;

class Client{
	static String reverseString(String str){

		char arr[]=str.toCharArray();

		StringBuffer str1=new StringBuffer();

		for(int i=arr.length-1;i>=0;i--){
			str1.append(arr[i]);
		}

		return str1.toString();
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string");

		String str=br.readLine();

		String str1=reverseString(str);

		System.out.println("reverse String is");

		System.out.println(str1);
	}
}

		
