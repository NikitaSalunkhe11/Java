class MyThread extends Thread{
	Thread  mainth=Thread.currentThread();
	public void run(){
		for(int i=0;i<7;i++){
			System.out.println("In run");
			System.out.println("main thread : "+Thread.currentThread().getName());
			/*try{
				//mainth.join();
			}catch(InterruptedException ex){
				
			}*/
		}
	}
}
class Client{
      	public static void main(String[] args){
		
		MyThread obj=new MyThread();

		System.out.println("In client");
		obj.start();
		try{
			obj.join();
		}catch(InterruptedException ex){
			System.out.println("Handled");
		}
		for(int i=0;i<4;i++){
			System.out.println("In main");
		}
	}	
}	
