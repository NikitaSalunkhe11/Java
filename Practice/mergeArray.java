import java.io.*;
class MergeArray1{
    public static void mergeArrays(int arr1[],int arr2[]){

        int i=0;
        int j=0;
        int k=0;
        while(i < arr1.length && arr1.length > arr2.length){
            if(arr1[i] == 0 && arr1[i]>arr2[j]){
		    if(i < arr1.length-1 && arr1[i]==0 && arr2[j] > arr1[i+1]){
			int temp=arr1[i];
			arr1[i]=arr1[i+1];
			arr1[i+1]=temp;
		    }else{
                	arr1[k]=arr2[j];
			j++;
		    }
               		k++;
                	i++;
            }else if(arr1[i] != 0 && arr1[i]<arr2[j]){
		    i++;
		    k++;
		    continue;
	    }else{
		    arr1[k]=arr2[j];
		    k++;
		    j++;
		    i++;
	    }
        }
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array size for first array");

        int size1=Integer.parseInt(br.readLine());
        
        int arr1[] = new int[size1];

        System.out.println("Enter Sorted Array Elements");

        for(int i=0;i<size1;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Enter size of Second Array");

        int size2=Integer.parseInt(br.readLine());
        
        int arr2[] = new int[size2];

        System.out.println("Enter Sorted Array Elements");

        for(int i=0;i<size2;i++){
            arr2[i]=Integer.parseInt(br.readLine());
        }

        mergeArrays(arr1, arr2);

        System.out.println("Array becomes");

        for (int k=0;k<arr1.length;k++){
            System.out.print(arr1[k] + " ");
        }
        System.out.println();
    }
}

