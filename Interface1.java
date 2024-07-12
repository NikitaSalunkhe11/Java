interface Demo1{
	default void fun(){
		System.out.println("In fun");
	}
}
interface Demo2{
	default void fun(){
		System.out.println("In fun Demo2");
	}
}
class Child implements Demo1,Demo2{
	/*public void fun(){
		System.out.println("In child fun");
	}	*/
}
class Client{
	public static void main(String[] args){

		Child obj=new Child();
		obj.fun();
	}
}


