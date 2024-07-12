class Client{
	static void fibonacci(int num){
		int a=0;
		int b=0;
		int c=1;

		for(int i=0;i<num;i++){
			System.out.print(b+"  ");
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println();
	}

	public static void main(String[] args){
		
		fibonacci(10);
		
		
	}
}
