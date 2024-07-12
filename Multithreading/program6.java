class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class Demo{
	public static void main(String[] args){

		MyThread obj=new MyThread();

		obj.setPriority(1);
		obj.start();

		obj.yield();

		System.out.println("end code");
	}
}
