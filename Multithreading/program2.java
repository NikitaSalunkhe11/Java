class Parent{

}
class Child extends Parent implements Runnable{
		
	public void run(){
		System.out.println("Child :"+Thread.currentThread().getName());
	}
}
class Client{
	public static void main(String[] args){
		
		System.out.println("In client class");

		Child obj=new Child();

		Thread t= new Thread(obj);

		t.start();

		System.out.println("In main");
	}
}




