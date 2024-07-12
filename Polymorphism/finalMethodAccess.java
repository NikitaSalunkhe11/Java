final class Parent{
	final void fun(){
		System.out.println("In Parent Static fun");
	}
}
class Child extends Parent{
	
	final void fun(){
		System.out.println("In Child static fun");
	}	

}
class Client{
	public static void main(String[] args){

		System.out.println("In main");

		Parent obj= new Child();
		obj.fun();

		Child obj1=new Child();
		obj.fun();
	}
}


