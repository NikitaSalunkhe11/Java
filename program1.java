class Parent{
	Parent(){
		System.out.println("In Parent constructor");
	}
	{
		System.out.println("Parent Instance block");
	}
	static{
		System.out.println("Parent static block");
	}

}
class Child extends Parent{

	Child(){
		System.out.println("In Child constructor");
	}
	{
		System.out.println("Child Instance block");
	}
	static{
		System.out.println("Child static block");
	}
}
class Client{
	public static void main(String[] args){
		
		Child obj=new Child();
	}
}
