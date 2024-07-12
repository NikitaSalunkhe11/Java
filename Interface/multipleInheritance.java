interface Demo1{

	static void fun(){
		System.out.println("In Demo1 Interface");
	}
}
interface Demo2{
	
	static void fun(){
		System.out.println("In Demo2 Interface");
	}
}
class ChildDemo implements Demo1,Demo2{

	void fun(){
		System.out.println("In child fun");
	}
}
class Client{
	public static void main(String[] args){
			
		ChildDemo obj=new ChildDemo();

		obj.fun();


		ChildDemo obj1=new ChildDemo();

		obj1.fun();

	}
}
