class Parent{
	public void run(){
		System.out.println("In Parent run");
	}	
}
class Child extends Parent implements Runnable{

	/*public void run(){
		System.out.println("In child Run");
	}*/
}
class Client{
	public static void main(String[] args){

		Child obj=new Child();

		Thread t=new Thread(obj);//Child class maza runnable type cha zala ahe so tyamule Thread class kade Runnable tyape cha constructor ahe
					   //
		t.start();
	}
}
