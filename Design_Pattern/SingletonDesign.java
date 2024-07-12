class Singleton{
	static Singleton obj=new Singleton();
	
	private Singleton(){
		System.out.println("In constructor");
	}

	static Singleton fun(){
		return obj;
	}
}
class Client{
	public static void main(String[] args){
		
		System.out.println("In main");		
		
		Singleton obj1=Singleton.fun();
		System.out.println(obj1);

		Singleton obj2=Singleton.fun();
		System.out.println(obj2);

	}
}
