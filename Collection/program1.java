import java.util.*;
class Demo{
	public static void main(String[] args){

		List al=new ArrayList();

		al.add(10);
		al.add("Nikita");
		al.add(new Integer(30));

		System.out.println(al);
		System.out.println(al.indexOf(30));

		Object arr[]=al.toArray();
		System.out.println(arr[1]);

		for(var x : al){
			System.out.println(x.getClass().getName());
		}
	}
}
