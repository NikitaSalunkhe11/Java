import java.io.*;
class Client{

	void TwoSum(int arr[],int key){

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == key){
					System.out.println("["+i+","+j+"]");
					return;
				}
			}
		}
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size");

		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter array elements");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter key Element");

		int key=Integer.parseInt(br.readLine());

		Client obj=new Client();
		obj.TwoSum(arr,key);
	}
}
