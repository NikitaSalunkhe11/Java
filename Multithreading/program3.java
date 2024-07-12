//Concurrency Methods
//1. join()   ===> 
//2. yeild()   ===>>
//3. sleep()   ==>> InterruptedException


class MyThread extends Thread{

	MyThread(String str){
		super(str);

	}
	public void run(){
		System.out.println(Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			System.out.println("Exception Handled");
		}
	}
}

class Client{
	public static void main(String[] args){
	
		MyThread obj=new MyThread("Nikita");
		obj.start();
		System.out.println("End code");
	}
}
