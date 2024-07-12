import java.util.*;
class Demo{
	public static void main(String[] args){

		HashSet obj=new HashSet();

		obj.add(10);
		obj.add(20);
		obj.add(new Integer(30));

		System.out.println(obj);

		System.out.println(obj.getClass().getName());

	}
}
